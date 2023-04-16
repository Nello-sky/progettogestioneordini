package it.prova.progettogestioneordini.dao;

import java.util.List;

import it.prova.progettogestioneordini.model.Articolo;

public interface ArticoloDAO extends IBaseDAO<Articolo> {

	void deleteAndUnlinkAll(Long idArticolo) throws Exception;

	int sumPrezzoArticoliByCategoria(Long idCategoria) throws Exception;

	int sumPrezziByDestinatario(String nomeDestinatario) throws Exception;

	List<Articolo> findByOrdineError() throws Exception;

}
