package it.prova.progettogestioneordini.dao;

import java.util.List;

import it.prova.progettogestioneordini.model.Ordine;

public interface OrdineDAO extends IBaseDAO<Ordine> {

	List<Ordine> ordiniByCategoria(Long idCategoria) throws Exception;

	Ordine findLastBySpedizioneByCategoria(Long idCategoria) throws Exception;

	List<String> findIndirizziDistinctOrdiniBySerialeOfArticoli(String input) throws Exception;

}
