package it.prova.progettogestioneordini.service;

import java.util.List;

import it.prova.progettogestioneordini.dao.CategoriaDAO;
import it.prova.progettogestioneordini.model.Articolo;
import it.prova.progettogestioneordini.model.Categoria;

public interface CategoriaService {

	void inserisciNuovo(Categoria categoriaInstance) throws Exception; // TESTED

	void aggiorna(Categoria categoriaInstance) throws Exception; // TESTED

	List<Categoria> listAll() throws Exception;

	Categoria caricaSingoloElemento(Long id) throws Exception;

	void aggiungiArticolo(Categoria categoriaInstance, Articolo articoloInstance) throws Exception; // TESTED

	Categoria caricaEagerDaID(Long id) throws Exception;

	Categoria caricaUltimoID() throws Exception;

	void rimuoviEScollegaTutto(Long idCategoria) throws Exception; // TESTED*

	List<Categoria> categorieDistinteDaOrdine(Long idOrdine) throws Exception; // TESTED

	List<String> codiciCategorieDistinteDaDataOrdine(int mese, int anno) throws Exception; // TESTED

	void setCategoriaDAO(CategoriaDAO categoriaoDAO);
}
