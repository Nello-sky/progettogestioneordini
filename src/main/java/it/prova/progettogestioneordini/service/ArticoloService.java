package it.prova.progettogestioneordini.service;

import java.util.List;

import it.prova.progettogestioneordini.dao.ArticoloDAO;
import it.prova.progettogestioneordini.model.Articolo;
import it.prova.progettogestioneordini.model.Categoria;

public interface ArticoloService {

	void inserisciNuovo(Articolo articoloInstance) throws Exception; // TESTED

	void aggiorna(Articolo articoloInstance) throws Exception; // TESTED

	List<Articolo> listAll() throws Exception;

	Articolo caricaSingoloElemento(Long id) throws Exception;

	void rimuovi(Long idArticolo) throws Exception; // TESTED

	void aggiungiCategoria(Articolo articoloInstance, Categoria categoriaInstance) throws Exception; // TESTED

	public Articolo caricaEagerDaID(Long id) throws Exception;

	void rimuoviEScollegaTutto(Long idArticolo) throws Exception; // TESTED*

	Articolo caricaUltimoID() throws Exception;

	int sommaPrezzoArticoliByCategoria(Long idCategoria) throws Exception; // TESTED

	int sommaPrezziByDestinatario(String nomeDestinatario) throws Exception; // TESTED

	List<Articolo> trovaByOrdineError() throws Exception; // TESTED

	void setArticoloDAO(ArticoloDAO articoloDAO);
}
