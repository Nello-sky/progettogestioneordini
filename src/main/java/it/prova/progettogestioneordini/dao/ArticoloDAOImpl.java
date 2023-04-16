package it.prova.progettogestioneordini.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import it.prova.progettogestioneordini.model.Articolo;

public class ArticoloDAOImpl implements ArticoloDAO {

	private EntityManager entityManager;

	@Override
	public List<Articolo> list() throws Exception {
		return entityManager.createQuery("from Articolo", Articolo.class).getResultList();
	}

	@Override
	public Articolo get(Long id) throws Exception {
		return entityManager.find(Articolo.class, id);
	}

	@Override
	public void update(Articolo input) throws Exception {
		if (input == null) {
			throw new Exception("Problema valore in input");
		}
		input = entityManager.merge(input);
	}

	@Override
	public void insert(Articolo input) throws Exception {
		if (input == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.persist(input);
	}

	@Override
	public void delete(Articolo input) throws Exception {
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
	public Articolo findByIdEager(Long id) throws Exception {
		TypedQuery<Articolo> query = entityManager
				.createQuery("select a from Articolo a left join fetch a.categorie c where a.id = ?1 ", Articolo.class);
		query.setParameter(1, id);
		return query.getResultStream().findFirst().orElse(null);
	}

	@Override
	public void deleteAndUnlinkAll(Long idArticolo) throws Exception {
		entityManager.createNativeQuery("delete from articolo_categoria u where u.articolo_id = ?1")
				.setParameter(1, idArticolo).executeUpdate();
		entityManager.createNativeQuery("delete from articolo a where a.id = ?1").setParameter(1, idArticolo)
				.executeUpdate();
	}

	@Override // rendere più performante
	public Articolo findLastId() throws Exception {
		TypedQuery<Articolo> query = entityManager.createQuery("from Articolo order by id desc ", Articolo.class);
		return query.getResultStream().findFirst().orElse(null);
	}

	@Override
	public int sumPrezzoArticoliByCategoria(Long idCategoria) throws Exception {
		Query query = entityManager
				.createQuery("select sum(a.prezzoSingolo) from Articolo a left join a.categorie c where c.id = ?1")
				.setParameter(1, idCategoria);
		// con nativa
//		Query query = entityManager.createNativeQuery(
//				"select sum(a.prezzosingolo) from articolo a left join articolo_categoria c on a.id=c.articolo_id where c.categoria_id = ?1  ");
		query.setParameter(1, idCategoria);
		return ((Number) query.getSingleResult()).intValue();
	}

	@Override
	public int sumPrezziByDestinatario(String nomeDestinatario) throws Exception {
		Query query = entityManager.createQuery(
				"select sum(a.prezzoSingolo) from Articolo a left join a.ordine c where c.nomeDestinatario = ?1")
				.setParameter(1, nomeDestinatario);
		return ((Number) query.getSingleResult()).intValue();
	}

	@Override
	public List<Articolo> findByOrdineError() throws Exception {
		TypedQuery<Articolo> query = entityManager.createQuery(
				"select a from Articolo a join a.ordine o where o.dataSpedizione > o.dataScadenza  ", Articolo.class);
		return query.getResultList();
	}

	@Override
	public void deleteAll() throws Exception {
		entityManager.createNativeQuery("delete from articolo_categoria").executeUpdate();
		entityManager.createNativeQuery("delete from articolo").executeUpdate();
		
	}

}
