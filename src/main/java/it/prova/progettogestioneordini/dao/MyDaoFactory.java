package it.prova.progettogestioneordini.dao;

public class MyDaoFactory {

	private static OrdineDAO ordineDaoInstance = null;
	private static ArticoloDAO articoloDaoInstance = null;
	private static CategoriaDAO categoriaDaoInstance = null;

	public static OrdineDAO getOrdineDAOInstance() {
		if (ordineDaoInstance == null)
			ordineDaoInstance = new OrdineDAOImpl();

		return ordineDaoInstance;
	}

	public static ArticoloDAO getArticoloDAOInstance() {
		if (articoloDaoInstance == null)
			articoloDaoInstance = new ArticoloDAOImpl();

		return articoloDaoInstance;
	}

	public static CategoriaDAO getCategoriaoDAOInstance() {
		if (categoriaDaoInstance == null)
			categoriaDaoInstance = new CategoriaDAOImpl();

		return categoriaDaoInstance;
	}

}
