package it.prova.progettogestioneordini.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import it.prova.progettogestioneordini.model.Articolo;
import it.prova.progettogestioneordini.model.Categoria;
import it.prova.progettogestioneordini.model.Ordine;

public class CategoriaDAOImpl implements CategoriaDAO {

	private EntityManager entityManager;

	@Override
	public List<Categoria> list() throws Exception {
		return entityManager.createQuery("from Categoria", Categoria.class).getResultList();
	}

	@Override
	public Categoria get(Long id) throws Exception {
		return entityManager.find(Categoria.class, id);
	}

	@Override
	public void update(Categoria input) throws Exception {
		if (input == null) {
			throw new Exception("Problema valore in input");
		}
		input = entityManager.merge(input);
	}

	@Override
	public void insert(Categoria input) throws Exception {
		if (input == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.persist(input);
	}

	@Override
	public void delete(Categoria input) throws Exception {
		if (input == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.remove(entityManager.merge(input));
	}

	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;

	}

	@Override
	public Categoria findByIdEager(Long id) throws Exception {
		TypedQuery<Categoria> query = entityManager.createQuery(
				"select c from Categoria c left join fetch c.articoli a where c.id = ?1 ", Categoria.class);
		query.setParameter(1, id);
		return query.getResultStream().findFirst().orElse(null);
	}

	@Override
	public Categoria findLastId() throws Exception {
		TypedQuery<Categoria> query = entityManager.createQuery("from Categoria order by id desc ", Categoria.class);
		return query.getResultStream().findFirst().orElse(null);
	}

	@Override
	public void deleteAndUnlinkAll(Long idCategoria) throws Exception {
		entityManager.createNativeQuery("delete from articolo_categoria u where u.categoria_id = ?1")
				.setParameter(1, idCategoria).executeUpdate();
		entityManager.createNativeQuery("delete from categoria c where c.id = ?1").setParameter(1, idCategoria)
				.executeUpdate();

	}

	@Override
	public List<Categoria> categorieDistinctByOrdine(Long idOrdine) throws Exception {
		TypedQuery<Categoria> query = entityManager.createQuery(
				"select distinct c from Categoria c join c.articoli a join a.ordine o where o.id = ?1  ",
				Categoria.class);
		query.setParameter(1, idOrdine);
		return query.getResultList();
	}

	@Override
	public List<String> codiciCategorieDistinctByOrdineDate(int mese, int anno) throws Exception {
		TypedQuery<String> query = entityManager.createQuery(
				"select distinct c.codice from Categoria c join c.articoli a join a.ordine o where MONTH(o.dataSpedizione) = ?1 and YEAR(o.dataSpedizione) = ?2",
				String.class);
		query.setParameter(1, mese);
		query.setParameter(2, anno);
		return query.getResultList();
	}

}
