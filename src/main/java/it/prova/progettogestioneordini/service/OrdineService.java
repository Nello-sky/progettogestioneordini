package it.prova.progettogestioneordini.service;

import java.util.List;

import it.prova.progettogestioneordini.dao.OrdineDAO;
import it.prova.progettogestioneordini.model.Ordine;

public interface OrdineService {

	List<Ordine> listAll() throws Exception;

	void inserisciNuovo(Ordine ordineInstance) throws Exception; // TESTED

	void aggiorna(Ordine ordineInstance) throws Exception; // TESTED

	Ordine caricaSingoloElemento(Long id) throws Exception;

	Ordine caricaUltimoID() throws Exception;

	void rimozione(Long idArticolo) throws Exception; // TESTED

	List<Ordine> ordiniCollegatiACategoria(Long idCategoria) throws Exception; // TESTED

	Ordine trovaPiuRecenteBySpedizioneByCategoria(Long idCategoria) throws Exception; // TESTED

	List<String> trovaIndirizziDistinctOrdiniBySerialeOfArticoli(String input) throws Exception; // TESTED

	void setOrdineDAO(OrdineDAO ordineDAO);
}
