package it.prova.progettogestioneordini.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import it.prova.progettogestioneordini.model.Ordine;

public class OrdineDAOImpl implements OrdineDAO {

	private EntityManager entityManager;

	@Override
	public List<Ordine> list() throws Exception {
		return entityManager.createQuery("from Ordine", Ordine.class).getResultList();
	}

	@Override
	public Ordine get(Long id) throws Exception {
		return entityManager.find(Ordine.class, id);
	}

	@Override
	public void update(Ordine input) throws Exception {
		if (input == null) {
			throw new Exception("Problema valore in input");
		}
		input = entityManager.merge(input);

	}

	@Override
	public void insert(Ordine input) throws Exception {
		if (input == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.persist(input);
	}

	@Override
	public void delete(Ordine input) throws Exception {
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
	public Ordine findByIdEager(Long id) throws Exception {
		TypedQuery<Ordine> query = entityManager
				.createQuery("select o from Ordine o left join fetch o.articoli a where o.id = ?1 ", Ordine.class);
		query.setParameter(1, id);
		return query.getResultStream().findFirst().orElse(null);
	}

	@Override
	public Ordine findLastId() throws Exception {
		TypedQuery<Ordine> query = entityManager.createQuery("from Ordine order by id desc ", Ordine.class);
		return query.getResultStream().findFirst().orElse(null);
	}

	@Override // articolo possiede implicitamente l'id del suo ordinema ciò non semplifica la
				// query
	public List<Ordine> ordiniByCategoria(Long idCategoria) throws Exception {
		TypedQuery<Ordine> query = entityManager.createQuery(
				"select o from Ordine o join o.articoli a join a.categorie c where c.id = ?1  ", Ordine.class);
//		TypedQuery<Ordine> query = entityManager.createQuery(
//				"select c.a.o from Categoria c join fetch c.articoli a join fetch a.ordine o where c.id = ?1  ",
//				Ordine.class);
		query.setParameter(1, idCategoria);
		return query.getResultList();
	}

	@Override
	public Ordine findLastBySpedizioneByCategoria(Long idCategoria) throws Exception {
//		TypedQuery<Ordine> query = entityManager.createQuery(
//				"select o from Ordine o join o.articoli a join a.categorie c where c.id = ?1 order by o.dataSpedizione desc ",
//				Ordine.class);
		TypedQuery<Ordine> query = entityManager.createQuery(
				"select o from Ordine o join o.articoli a join a.categorie c where c.id = ?1 and o.dataSpedizione = (select max(o.dataSpedizione) from Ordine o) ",
				Ordine.class);
		query.setParameter(1, idCategoria);
		return query.getResultStream().findFirst().orElse(null);
	}

	@Override
	public List<String> findIndirizziDistinctOrdiniBySerialeOfArticoli(String input) throws Exception {
		TypedQuery<String> query = entityManager.createQuery(
				"select distinct o.indirizzoSpedizione from Ordine o join o.articoli a where a.numeroSeriale like ?1  ",
				String.class);
		query.setParameter(1, "%" + input + "%");
		return query.getResultList();
	}

	@Override // test sulle righe orfane di artioolo
	public void deleteAll() throws Exception {
		entityManager.createNativeQuery("delete from ordine").executeUpdate();

	}

}
