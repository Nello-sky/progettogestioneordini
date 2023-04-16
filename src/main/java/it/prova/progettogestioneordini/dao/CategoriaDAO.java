package it.prova.progettogestioneordini.dao;

import java.util.List;

import it.prova.progettogestioneordini.model.Categoria;

public interface CategoriaDAO extends IBaseDAO<Categoria> {

	void deleteAndUnlinkAll(Long idCategoria) throws Exception;

	List<Categoria> categorieDistinctByOrdine(Long idOrdine) throws Exception;

	List<String> codiciCategorieDistinctByOrdineDate(int mese, int anno) throws Exception;
}
