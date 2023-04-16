package it.prova.progettogestioneordini.test;

import java.time.LocalDate;
import java.util.List;

import it.prova.progettogestioneordini.dao.EntityManagerUtil;
import it.prova.progettogestioneordini.model.Articolo;
import it.prova.progettogestioneordini.model.Categoria;
import it.prova.progettogestioneordini.model.Ordine;
import it.prova.progettogestioneordini.service.ArticoloService;
import it.prova.progettogestioneordini.service.CategoriaService;
import it.prova.progettogestioneordini.service.MyServiceFactory;
import it.prova.progettogestioneordini.service.OrdineService;

public class TestProgettoGestioneOrdini {

	public static void main(String[] args) {

		OrdineService ordineServiceInstance = MyServiceFactory.getOrdineServiceInstance();
		ArticoloService articoloServiceInstance = MyServiceFactory.getArticoloServiceInstance();
		CategoriaService categoriaServiceInstance = MyServiceFactory.getCategoriaServiceInstance();

		try {
			
			TestClearAllTable(categoriaServiceInstance, articoloServiceInstance, ordineServiceInstance);
			
//			System.out.println("******* INIZIO TEST extra *******");
//			caricaUltimiIDArticolo(articoloServiceInstance);
//			System.out.println(articoloServiceInstance.caricaUltimoID().getId());
//			caricaUltimiIDOrdine(ordineServiceInstance);
//			System.out.println(ordineServiceInstance.caricaUltimoID().getId());
//			caricaUltimiIDCategoria(categoriaServiceInstance);
//			System.out.println(categoriaServiceInstance.caricaUltimoID().getId());

			System.out.println("******* UTILIY START LIST *******");
			System.out.println("In tabella Ordine ci sono " + ordineServiceInstance.listAll().size() + " elementi.");
			System.out
					.println("In tabella Articolo ci sono " + articoloServiceInstance.listAll().size() + " elementi.");
			System.out.println(
					"In tabella Categoria ci sono " + categoriaServiceInstance.listAll().size() + " elementi.");

			System.out.println("******* INIZIO TEST ORDINE *******");
			// System.out.println("In tabella Ordine ci sono " +
			// ordineServiceInstance.listAll().size() + " elementi.");

//			testInserimentoNuovoOrdine(ordineServiceInstance);
//			System.out.println("In tabella Ordine ci sono " + ordineServiceInstance.listAll().size() + " elementi.");

//			testAggiornaOrdineEsistente(ordineServiceInstance);
//			System.out.println("In tabella Ordine ci sono " + ordineServiceInstance.listAll().size() + " elementi.");

//			testRimuoviOrdineSenzaArticoli(articoloServiceInstance, ordineServiceInstance);
//			System.out.println("In tabella Ordine ci sono " + ordineServiceInstance.listAll().size() + " elementi.");
//			System.out
//					.println("In tabella Articolo ci sono " + articoloServiceInstance.listAll().size() + " elementi.");

//			TestListaOrdiniDaCategoria(categoriaServiceInstance, articoloServiceInstance, ordineServiceInstance);
//			System.out.println("In tabella Ordine ci sono " + ordineServiceInstance.listAll().size() + " elementi.");
//			System.out.println("In tabella Articolo ci sono " + articoloServiceInstance.listAll().size() + " elementi.");
//			System.out.println("In tabella Categoria ci sono " + categoriaServiceInstance.listAll().size() + " elementi.");

			// TestUltimoOrdineByCategoria(categoriaServiceInstance,
			// articoloServiceInstance, ordineServiceInstance);

//			TestIndirizziDistintiByStringaContenutaSerialeArticoli(articoloServiceInstance, ordineServiceInstance);

			System.out.println("******* INIZIO TEST ARTICOLO *******");
			// System.out
			// .println("In tabella Articolo ci sono " +
			// articoloServiceInstance.listAll().size() + " elementi.");

//			testInserimentoNuovoArticolo(articoloServiceInstance, ordineServiceInstance);
//			System.out.println("In tabella Articolo ci sono " + articoloServiceInstance.listAll().size() + " elementi.");
//			System.out.println("In tabella Ordine ci sono " + ordineServiceInstance.listAll().size() + " elementi.");

//			testAggiornaArticoloEsistente(articoloServiceInstance, ordineServiceInstance);
//			System.out.println("In tabella Articolo ci sono " + articoloServiceInstance.listAll().size() + " elementi.");

//			testRimuoviArticoloOnlyOrdine(articoloServiceInstance,	ordineServiceInstance);
//			System.out.println("In tabella Articolo ci sono " + articoloServiceInstance.listAll().size() + " elementi.");

//			TestAggiungiCategoriaAdArticolo(categoriaServiceInstance, articoloServiceInstance, ordineServiceInstance);
//			System.out.println("In tabella Ordine ci sono " + ordineServiceInstance.listAll().size() + " elementi.");
//			System.out.println("In tabella Articolo ci sono " + articoloServiceInstance.listAll().size() + " elementi.");
//			System.out.println("In tabella Categoria ci sono " + categoriaServiceInstance.listAll().size() + " elementi.");

//			TestRimozioneSicuraArticolo(categoriaServiceInstance, articoloServiceInstance, ordineServiceInstance);
//			System.out.println("In tabella Ordine ci sono " + ordineServiceInstance.listAll().size() + " elementi.");
//			System.out.println("In tabella Articolo ci sono " + articoloServiceInstance.listAll().size() + " elementi.");
//			System.out.println("In tabella Categoria ci sono " + categoriaServiceInstance.listAll().size() + " elementi.");

//			

//			TestSommaPrezziArticoliDaCategoria(categoriaServiceInstance, articoloServiceInstance,
//					ordineServiceInstance);
//			System.out.println("In tabella Ordine ci sono " + ordineServiceInstance.listAll().size() + " elementi.");
//			System.out.println("In tabella Articolo ci sono " + articoloServiceInstance.listAll().size() + " elementi.");
//			System.out.println("In tabella Categoria ci sono " + categoriaServiceInstance.listAll().size() + " elementi.");

			// TestSommaPrezziAricoliByDestinatario(articoloServiceInstance,
			// ordineServiceInstance);

			// TestArticoliConOrdiniErrati(articoloServiceInstance, ordineServiceInstance);

			System.out.println("******* INIZIO TEST CATEGORIA *******");
//			System.out.println(
//					"In tabella Categoria ci sono " + categoriaServiceInstance.listAll().size() + " elementi.");

//			testInserimentoNuovaCategoria(categoriaServiceInstance);
//			System.out.println("In tabella Categoria ci sono " + categoriaServiceInstance.listAll().size() + " elementi.");

//			testAggiornaCategoria(categoriaServiceInstance);
//			System.out.println("In tabella Categoria ci sono " + categoriaServiceInstance.listAll().size() + " elementi.");

//			testAggiungiArticoloACategoria(categoriaServiceInstance, articoloServiceInstance, ordineServiceInstance);
//			System.out.println("In tabella Ordine ci sono " + ordineServiceInstance.listAll().size() + " elementi.");
//			System.out.println("In tabella Articolo ci sono " + articoloServiceInstance.listAll().size() + " elementi.");
//			System.out.println("In tabella Categoria ci sono " + categoriaServiceInstance.listAll().size() + " elementi.");

//			TestRimozioneSicuraCategoria(categoriaServiceInstance, articoloServiceInstance, ordineServiceInstance);
//			System.out.println("In tabella Ordine ci sono " + ordineServiceInstance.listAll().size() + " elementi.");
//			System.out.println("In tabella Articolo ci sono " + articoloServiceInstance.listAll().size() + " elementi.");
//			System.out.println("In tabella Categoria ci sono " + categoriaServiceInstance.listAll().size() + " elementi.");

//			TestListaCategorieDistinteDaOrdine(categoriaServiceInstance, articoloServiceInstance, ordineServiceInstance);
//			System.out.println("In tabella Ordine ci sono " + ordineServiceInstance.listAll().size() + " elementi.");
//			System.out.println("In tabella Articolo ci sono " + articoloServiceInstance.listAll().size() + " elementi.");
//			System.out.println("In tabella Categoria ci sono " + categoriaServiceInstance.listAll().size() + " elementi.");

//			TestListaCodiciCategoriePerDataOrdine(categoriaServiceInstance, articoloServiceInstance,
//					ordineServiceInstance);

		} catch (Throwable e) {
			e.printStackTrace();
		} finally {
			// questa è necessaria per chiudere tutte le connessioni quindi rilasciare il
			// main
			EntityManagerUtil.shutdown();
		}

	}

///////////////// METODI INTERMEDI ///////////////////////////////////////////////////////////////////////////////////////////	

//* ORDINE *******************************************************************************************************************

	private static void testInserimentoNuovoOrdine(OrdineService ordineServiceInstance) throws Exception {
		System.out.println(".......testInserimentoNuovoOrdine inizio.............");

		Ordine ordineInstance = new Ordine("jim carrey", "via york 1", LocalDate.parse("2023-02-10"),
				LocalDate.parse("2023-02-10"));
		ordineServiceInstance.inserisciNuovo(ordineInstance);
		if (ordineInstance.getId() == null)
			throw new RuntimeException("testInserimentoNuovoOrdine fallito ");

		System.out.println(".......testInserimentoNuovoOrdine fine: PASSED.............");
	}

	public static void testAggiornaOrdineEsistente(OrdineService ordineServiceInstance) throws Exception {
		System.out.println(".......testAggiornaOrdine start.............");

		if (ordineServiceInstance.listAll().isEmpty())
			throw new RuntimeException("testAggiornaOrdine failed: no ordine to connect ");

		// ne carico uno e mi salvo il campo su cui farò la modifica, ed id
		Ordine ordineTestUpdate = ordineServiceInstance.listAll().get(0);
		String nomeDestinatarioToChange = ordineTestUpdate.getNomeDestinatario();
		Long idOrdineBeforeUpdate = ordineTestUpdate.getId();

		// modifico il parametro scelto, lo salvo e poi aggiorno
		String nomeDestinatarioChanged = "albert nope";
		ordineTestUpdate.setNomeDestinatario(nomeDestinatarioChanged);
		ordineServiceInstance.aggiorna(ordineTestUpdate);

		// ricarico l'ordine per preparare il test
		Ordine ordineRicaricato = ordineServiceInstance.caricaSingoloElemento(idOrdineBeforeUpdate);
		String nomeDestinatarioAfterChanged = ordineRicaricato.getNomeDestinatario();
		Long idOrdineAfterUpdate = ordineRicaricato.getId();

		// controllo che il campo modificato sia tale, uguale a quello scelto, ma che
		// abbia stesso id iniziale (3cdz.i*)
		if (nomeDestinatarioToChange.equals(nomeDestinatarioAfterChanged)
				|| idOrdineBeforeUpdate != idOrdineAfterUpdate)
			throw new RuntimeException("testAggiornaOrdine failed: update non corretto ");

		// System.out.println(ordineTestUpdate.getId());
		System.out.println(".......testAggiornaOrdine end: PASSED.............");
	}

	private static void testRimuoviOrdineSenzaArticoli(ArticoloService articoloServiceInstance,
			OrdineService ordineServiceInstance) throws Exception {
		System.out.println(".......testRimuoviOrdineSenzaArticoli start.............");

		if (ordineServiceInstance.listAll().isEmpty())
			throw new RuntimeException("testAggiornaOrdine failed: no ordine to connect ");

		// controllo: rimuova ordine senza articoli

		// creo un ordine senza collegamenti e provo a rimuoverlo
		testInserimentoNuovoOrdine(ordineServiceInstance);
		Ordine ordineUnlinked = ordineServiceInstance.caricaUltimoID();
		ordineServiceInstance.rimozione(ordineUnlinked.getId());
		System.out.println(".......testRimuoviOrdineSenzaArticoli end: first part PASSED.............");

		// controllo: non rimuova ordine con articoli

		// creo un articolo, implicitamente il suo rodine by default
		testInserimentoNuovoArticolo(articoloServiceInstance, ordineServiceInstance);
		Ordine ordineLinked = ordineServiceInstance.caricaUltimoID();
		ordineServiceInstance.rimozione(ordineLinked.getId()); // aspettarsi eccezione!!!

	}

//* ARTICOLO *******************************************************************************************************************

	private static void testInserimentoNuovoArticolo(ArticoloService articoloServiceInstance,
			OrdineService ordineServiceInstance) throws Exception {

		System.out.println(".......testInserimentoNuovoArticolo inizio.............");

		// creo un nuovo ordine
		Ordine ordineTemp = new Ordine("ZAC CODY", "via lumb 12", LocalDate.parse("2022-03-10"),
				LocalDate.parse("2022-03-10"));
		ordineServiceInstance.inserisciNuovo(ordineTemp); // deve avvenire prima dell'inserimento dell'articolo
		Long idOrdineTest = ordineTemp.getId(); // mi salvo l'id per il test finale

		// creo e setto l'articolo
		Articolo articoloTemp = new Articolo("knife", "klo", 3, LocalDate.parse("2022-01-10"));
		articoloTemp.setOrdine(ordineTemp); // direttamente qui non dal costruttore..

		articoloServiceInstance.inserisciNuovo(articoloTemp);

		if (articoloTemp.getOrdine().getId() == null || articoloTemp.getId() == null
				|| articoloTemp.getOrdine().getId() != ordineTemp.getId())
			throw new RuntimeException(
					"testInserimentoNuovoArticolo fallito, controllare inserimento ordine e articolo e  loro associazione ");

		System.out.println(".......testInserimentoNuovoArticolo fine: PASSED.............");
	}

	public static void testAggiornaArticoloEsistente(ArticoloService articoloServiceInstance,
			OrdineService ordineServiceInstance) throws Exception {
		System.out.println(".......testAggiornaArticolo start.............");

		if (articoloServiceInstance.listAll().isEmpty())
			throw new RuntimeException("testAggiornaArticolo failed: no articoli to connect ");

		// un articolo esistente avrà byDesgin la foreignKey not null, salvo id e campo
		// interessati
		Articolo articoloTemp = articoloServiceInstance.listAll().get(0);
		String descrizioneToChange = articoloTemp.getDescrizione();
		Long idArticoloBeforeUpdate = articoloTemp.getId();

		// modifico il parametro scelto, salvandolo e poi aggiorno
		String descrizioneChanged = ("motoscafo");
		articoloTemp.setDescrizione(descrizioneChanged);
		articoloServiceInstance.aggiorna(articoloTemp);

		// ricarico l'ordine per preparare il test
		Articolo articoloRicaricato = articoloServiceInstance.caricaSingoloElemento(idArticoloBeforeUpdate);
		String descrizioneAfterChanged = articoloRicaricato.getDescrizione();
		Long idArticoloAfterUpdate = articoloRicaricato.getId();

		// controllo che il campo modificato sia tale, uguale a quello scelto, ma che
		// abbia stesso id iniziale (3cdz.i*)
		if (descrizioneToChange.equals(descrizioneAfterChanged) || idArticoloBeforeUpdate != idArticoloAfterUpdate)
			throw new RuntimeException("testAggiornaArticolo failed: update non corretto ");

		System.out.println(".......testAggiornaArticolo end: PASSED.............");
	}

// si nota anche dai successivi id automatici che sia stato inserito e rimosso
	private static void testRimuoviArticoloOnlyOrdine(ArticoloService articoloServiceInstance,
			OrdineService ordineServiceInstance) throws Exception {
		System.out.println(".......testRimuoviArticoloOnlyOrdine start.............");

		if (articoloServiceInstance.listAll().isEmpty())
			throw new RuntimeException("testRimuoviArticoloOnlyOrdine failed: no articoli to connect ");

		// ne creo uno nuovo e mi salvo l'id, poi lo inserisco // i test sui metodi
		// precedenti presenti sono già validati
		// cosi sono sicuro non abbia categorie collegate
		Ordine ordineTemp = new Ordine("franco sole", "via mare 12", LocalDate.parse("2020-05-10"),
				LocalDate.parse("2021-06-10"));
		ordineServiceInstance.inserisciNuovo(ordineTemp);

		Articolo articoloTemp = new Articolo("manubrio", "m9", 15, LocalDate.parse("2019-05-10"));
		articoloTemp.setOrdine(ordineTemp); // direttamente qui non dal costruttore..
		// String descrizioneToChange = articoloTemp.getDescrizione();
		articoloServiceInstance.inserisciNuovo(articoloTemp);
		Long idArticoloToRemove = articoloTemp.getId();

		// essendo record con fk posso eseguire la remove diretta
		articoloServiceInstance.rimuovi(idArticoloToRemove);

		Articolo articoloCheckRemove = articoloServiceInstance.caricaSingoloElemento(idArticoloToRemove);
		if (articoloCheckRemove != null) {
			throw new RuntimeException("testRimuoviArticoloOnlyOrdine FALLITO: articolo not removed");
		}
		System.out.println(".......testRimuoviArticoloOnlyOrdine fine: PASSED.............");
	}

	public static void TestAggiungiCategoriaAdArticolo(CategoriaService categoriaServiceInstance,
			ArticoloService articoloServiceInstance, OrdineService ordineServiceInstance) throws Exception {
		System.out.println(".......TestAggiungiCategoriaAdArticolo start.............");

		// creo un nuovo ordine per nuovo articolo, ed inserisco il tutto
		Ordine ordineTemp = new Ordine("maria dos", "via sole 9", LocalDate.parse("2022-03-10"),
				LocalDate.parse("2022-03-10"));
		ordineServiceInstance.inserisciNuovo(ordineTemp); // deve avvenire prima dell'inserimento dell'articolo

		// creo e setto l'articolo
		Articolo articoloTemp = new Articolo("pettine", "d8", 4, LocalDate.parse("2022-01-10"));
		articoloTemp.setOrdine(ordineTemp); // direttamente qui non dal costruttore..
		articoloServiceInstance.inserisciNuovo(articoloTemp);

		// creo una nuova categoria
		Categoria categoriaTemp = new Categoria("beauty", "c9");
		categoriaServiceInstance.inserisciNuovo(categoriaTemp);

		// chiamo il metodo
		articoloServiceInstance.aggiungiCategoria(articoloTemp, categoriaTemp);
		// ricarico articoloEager e controllo abbia categorie associate
		Articolo articoloTest = articoloServiceInstance.caricaEagerDaID(articoloTemp.getId());
		if (articoloTest.getCategorie().isEmpty()) {
			throw new RuntimeException(
					"TestAggiungiCategoriaAdArticolo FALLITO: nessuna categoria associata all'articolo");
		}

		System.out.println(".......TestAggiungiCategoriaAdArticolo fine: PASSED.............");
	}

	public static void TestRimozioneSicuraArticolo(CategoriaService categoriaServiceInstance,
			ArticoloService articoloServiceInstance, OrdineService ordineServiceInstance) throws Exception {
		System.out.println(".......TestRimozioneSicuraArticolo start.............");

		// mi credo un articolo e categoria associati // un po macchinoso
		TestAggiungiCategoriaAdArticolo(categoriaServiceInstance, articoloServiceInstance, ordineServiceInstance);
		Articolo ArticoloInserito = articoloServiceInstance.caricaUltimoID();
		Categoria primaCategoriaInserita = categoriaServiceInstance.caricaUltimoID();
		// creo-inserisco un altra categoria
		testInserimentoNuovaCategoria(categoriaServiceInstance);
		Categoria secondaCategoriaInserita = categoriaServiceInstance.caricaUltimoID();
		// aggiungo quest ultima all'articolo
		articoloServiceInstance.aggiungiCategoria(ArticoloInserito, secondaCategoriaInserita);

		// chiamo il metodo da testare
		articoloServiceInstance.rimuoviEScollegaTutto(ArticoloInserito.getId());

		// verifico che l'articolo non sia piu presente sulla sua table e nemmeno nei
		// set delle categorie prima associate
		Articolo articoloCheckRemove = articoloServiceInstance.caricaSingoloElemento(ArticoloInserito.getId());
		Categoria primaCategoriaCheck = categoriaServiceInstance.caricaEagerDaID(primaCategoriaInserita.getId());
		Categoria secondaCategoriaCheck = categoriaServiceInstance.caricaEagerDaID(secondaCategoriaInserita.getId());
		if (articoloCheckRemove != null) {
			throw new RuntimeException("TestRimozioneSicuraArticolo FALLITO: articolo not removed");
		}
		//
		if (!primaCategoriaCheck.getArticoli().isEmpty() || !secondaCategoriaCheck.getArticoli().isEmpty()) {
			throw new RuntimeException("TestRimozioneSicuraArticolo FALLITO: articolo ancora associato a categorie");
		}
		System.out.println(".......TestRimozioneSicuraArticolo fine: PASSED.............");
	}

//* CATEGORIA *******************************************************************************************************************

	private static void testInserimentoNuovaCategoria(CategoriaService categoriaServiceInstance) throws Exception {
		System.out.println(".......testInserimentoNuovaCategoria inizio.............");

		Categoria categoriaInstance = new Categoria("farinacei", "f9");
		categoriaServiceInstance.inserisciNuovo(categoriaInstance);
		if (categoriaInstance.getId() == null)
			throw new RuntimeException("testInserimentoNuovaCategoria fallito ");

		System.out.println(".......testInserimentoNuovaCategoria fine: PASSED.............");
	}

	public static void testAggiornaCategoria(CategoriaService categoriaServiceInstance) throws Exception {
		System.out.println(".......testAggiornaCategoria start.............");

		if (categoriaServiceInstance.listAll().isEmpty())
			throw new RuntimeException("testAggiornaCategoria failed: no categorie to connect ");

		// ne creo una e mi salvo il campo su cui farò la modifica, poi lo inserisco,
		// salvo anche l'id
		Categoria categoriaTemp = new Categoria("drink", "f85");
		String descrizioneToChange = categoriaTemp.getDescrizione();
		categoriaServiceInstance.inserisciNuovo(categoriaTemp);
		Long idcategoriaTemp = categoriaTemp.getId();

		// modifico il parametro scelto, me lo salvo e poi aggiorno
		String descrizioneChanged = "food";
		categoriaTemp.setDescrizione(descrizioneChanged);
		categoriaServiceInstance.aggiorna(categoriaTemp);

		// ricarico la categoria per preparare il test
		Categoria categoriaPost = categoriaServiceInstance.caricaSingoloElemento(categoriaTemp.getId());
		String descrizioneAfterUpdate = categoriaPost.getDescrizione();

		// controllo che il campo modificato sia tale, uguale a quello scelto, ma che
		// abbia stesso id iniziale
		if (categoriaPost == null || descrizioneAfterUpdate.equals(descrizioneToChange))
			throw new RuntimeException("testAggiornaCategoria failed: update non corretto ");
		// lo riporti allo stato originario poi...
		System.out.println(".......testAggiornaCategoria end: PASSED.............");
	}

	public static void testAggiungiArticoloACategoria(CategoriaService categoriaServiceInstance,
			ArticoloService articoloServiceInstance, OrdineService ordineServiceInstance) throws Exception {
		System.out.println(".......testAggiungiArticoloACategoria start.............");

		// creo un nuovo ordine per nuovo articolo, ed inserisco il tutto
		Ordine ordineTemp = new Ordine("franco rossi", "via monti 9", LocalDate.parse("2022-03-10"),
				LocalDate.parse("2022-03-10"));
		ordineServiceInstance.inserisciNuovo(ordineTemp); // deve avvenire prima dell'inserimento dell'articolo

		// creo e setto l'articolo
		Articolo articoloTemp = new Articolo("trapano", "t56", 100, LocalDate.parse("2022-01-10"));
		articoloTemp.setOrdine(ordineTemp); // direttamente qui non dal costruttore..
		articoloServiceInstance.inserisciNuovo(articoloTemp);

		// creo una nuova categoria
		Categoria categoriaTemp = new Categoria("strumenti", "f37");
		categoriaServiceInstance.inserisciNuovo(categoriaTemp);

		// chiamo il metodo
		categoriaServiceInstance.aggiungiArticolo(categoriaTemp, articoloTemp);
		// ricarico la categoriaEager e controllo abbia articoli associati
		Categoria categoriaTest = categoriaServiceInstance.caricaEagerDaID(categoriaTemp.getId());
		if (categoriaTest.getArticoli().isEmpty()) {
			throw new RuntimeException("testAggiungiArticoloACategoria FALLITO: nessun articolo associato a categoria");
		}

		System.out.println(".......testAggiungiArticoloACategoria fine: PASSED.............");

	}

	public static void TestRimozioneSicuraCategoria(CategoriaService categoriaServiceInstance,
			ArticoloService articoloServiceInstance, OrdineService ordineServiceInstance) throws Exception {
		System.out.println(".......TestRimozioneSicuraCategoria start.............");

		// mi credo un articolo e categoria associati
		TestAggiungiCategoriaAdArticolo(categoriaServiceInstance, articoloServiceInstance, ordineServiceInstance);
		Articolo primoArticoloInserito = articoloServiceInstance.caricaUltimoID();
		Categoria CategoriaInserita = categoriaServiceInstance.caricaUltimoID();
		// creo-inserisco un altro articolo
		testInserimentoNuovoArticolo(articoloServiceInstance, ordineServiceInstance);
		Articolo secondoArticoloInserito = articoloServiceInstance.caricaUltimoID();
		// aggiungo quest ultimo alla categoria
		categoriaServiceInstance.aggiungiArticolo(CategoriaInserita, secondoArticoloInserito);

		// chiamo il metodo da testare
		categoriaServiceInstance.rimuoviEScollegaTutto(CategoriaInserita.getId());

		// verifico che la categoria non sia piu presente sulla sua table e nemmeno nei
		// set degli articoli prima associati
		Categoria categoriaCheckRemove = categoriaServiceInstance.caricaSingoloElemento(CategoriaInserita.getId());
		Articolo primoArticoloCheck = articoloServiceInstance.caricaEagerDaID(primoArticoloInserito.getId());
		Articolo secondoArticoloCheck = articoloServiceInstance.caricaEagerDaID(secondoArticoloInserito.getId());
		if (categoriaCheckRemove != null) {
			throw new RuntimeException("TestRimozioneSicuraCategoria FALLITO: Categoria not removed");
		}
		//
		if (!primoArticoloCheck.getCategorie().isEmpty() || !secondoArticoloCheck.getCategorie().isEmpty()) {
			throw new RuntimeException("TestRimozioneSicuraCategoria FALLITO: categoria ancora associato ad articoli");
		}
		System.out.println(".......TestRimozioneSicuraCategoria fine: PASSED.............");
	}
//* extra *******************************************************************************************************************

	public static void caricaUltimiIDArticolo(ArticoloService articoloServiceInstance) throws Exception {
		System.out.println(".......caricaUltimiIDOrdine start.............");
		if (articoloServiceInstance.listAll().isEmpty())
			throw new RuntimeException("caricaUltimiIDArticolo failed: no articoli to connect ");
		articoloServiceInstance.caricaUltimoID();
		System.out.println(".......caricaUltimiIDArticolo fine: PASSED.............");
	}

	public static void caricaUltimiIDOrdine(OrdineService ordineServiceInstance) throws Exception {
		System.out.println(".......caricaUltimiIDOrdine start.............");
		if (ordineServiceInstance.listAll().isEmpty())
			throw new RuntimeException("caricaUltimiIDOrdine failed: no articoli to connect ");
		ordineServiceInstance.caricaUltimoID();
		System.out.println(".......caricaUltimiIDOrdine fine: PASSED.............");
	}

	public static void caricaUltimiIDCategoria(CategoriaService categoriaServiceInstance) throws Exception {
		System.out.println(".......caricaUltimiIDCategoria start.............");
		if (categoriaServiceInstance.listAll().isEmpty())
			throw new RuntimeException("caricaUltimiIDCategoria failed: no articoli to connect ");
		categoriaServiceInstance.caricaUltimoID();
		System.out.println(".......caricaUltimiIDCategoria fine: PASSED.............");
	}

//* homeworks *******************************************************************************************************************

	public static void TestListaOrdiniDaCategoria(CategoriaService categoriaServiceInstance,
			ArticoloService articoloServiceInstance, OrdineService ordineServiceInstance) throws Exception {
		System.out.println(".......TestListaOrdiniDaCategoria start.............");
		// creo due articoli(collegati ad ordini diversi), creo una categoria e glieli
		// collego

		testInserimentoNuovoArticolo(articoloServiceInstance, ordineServiceInstance);
		Articolo primoArticoloInserito = articoloServiceInstance.caricaUltimoID();
		testInserimentoNuovoArticolo(articoloServiceInstance, ordineServiceInstance);
		Articolo secondoArticoloInserito = articoloServiceInstance.caricaUltimoID();

		testInserimentoNuovaCategoria(categoriaServiceInstance);
		Categoria categoriaTest = categoriaServiceInstance.caricaUltimoID();
		categoriaServiceInstance.aggiungiArticolo(categoriaTest, primoArticoloInserito);
		categoriaServiceInstance.aggiungiArticolo(categoriaTest, secondoArticoloInserito);

		// provo a richiamare dall'id della categoria gli ordini suddetti.

		List<Ordine> listaOrdiniTest = ordineServiceInstance.ordiniCollegatiACategoria(categoriaTest.getId());
		if (listaOrdiniTest.size() < 1)
			throw new RuntimeException("TestListaOrdiniDaCategoria FALLITO: nessun ordine collegato presente");
		System.out.println(".......TestListaOrdiniDaCategoria fine: PASSED......." + listaOrdiniTest.size() + " ....");
	}

	public static void TestListaCategorieDistinteDaOrdine(CategoriaService categoriaServiceInstance,
			ArticoloService articoloServiceInstance, OrdineService ordineServiceInstance) throws Exception {

		System.out.println(".......TestListaCategorieDistinteDaOrdine start.............");

		// creo tre articoli, tutti legati allo stesso ordine
		// ne associo due ad una categoria e l'ultimo ad un altra
		Ordine ordineTemp = new Ordine("sarto", "via zanti 12", LocalDate.parse("2022-03-10"),
				LocalDate.parse("2022-03-10"));
		ordineServiceInstance.inserisciNuovo(ordineTemp); // deve avvenire prima dell'inserimento dell'articolo

		Articolo articoloTemp1 = new Articolo("vite", "po9", 3, LocalDate.parse("2022-01-10"));
		articoloTemp1.setOrdine(ordineTemp);
		Articolo articoloTemp2 = new Articolo("filo", "po9", 3, LocalDate.parse("2022-01-10"));
		articoloTemp2.setOrdine(ordineTemp);
		Articolo articoloTemp3 = new Articolo("ago", "po9", 3, LocalDate.parse("2022-01-10"));
		articoloTemp3.setOrdine(ordineTemp);

		articoloServiceInstance.inserisciNuovo(articoloTemp1);
		articoloServiceInstance.inserisciNuovo(articoloTemp2);
		articoloServiceInstance.inserisciNuovo(articoloTemp3);

		Categoria categoriaTemp1 = new Categoria("sartoria", "c9");
		categoriaServiceInstance.inserisciNuovo(categoriaTemp1);
		Categoria categoriaTemp2 = new Categoria("metallo", "c9");
		categoriaServiceInstance.inserisciNuovo(categoriaTemp2);

		articoloServiceInstance.aggiungiCategoria(articoloTemp1, categoriaTemp2);
		articoloServiceInstance.aggiungiCategoria(articoloTemp2, categoriaTemp1);
		articoloServiceInstance.aggiungiCategoria(articoloTemp3, categoriaTemp1);

		Articolo articoloTemp1Ricaricato = articoloServiceInstance.caricaEagerDaID(articoloTemp1.getId());
		Articolo articoloTemp2Ricaricato = articoloServiceInstance.caricaEagerDaID(articoloTemp2.getId());
		Articolo articoloTemp3Ricaricato = articoloServiceInstance.caricaEagerDaID(articoloTemp3.getId());
		// provo a richiamare dall'id di ordine le categorie distinte
		List<Categoria> listaCategoriaTest = categoriaServiceInstance.categorieDistinteDaOrdine(ordineTemp.getId());
		if (listaCategoriaTest.size() < 1)
			throw new RuntimeException(
					"TestListaCategorieDistinteDaOrdine FALLITO: nessuna categoria collegata presente");
		System.out.println(
				".......TestListaCategorieDistinteDaOrdine fine: PASSED......." + listaCategoriaTest.size() + " ....");
	}

	public static void TestSommaPrezziArticoliDaCategoria(CategoriaService categoriaServiceInstance,
			ArticoloService articoloServiceInstance, OrdineService ordineServiceInstance) throws Exception {

		System.out.println(".......TestSommaPrezziArticoliDaCategoria start.............");

		// creo due articoli collegati ad una categoria
		Ordine ordineTemp = new Ordine("marinaio", "via mare 12", LocalDate.parse("2022-03-10"),
				LocalDate.parse("2022-03-10"));
		ordineServiceInstance.inserisciNuovo(ordineTemp); // deve avvenire prima dell'inserimento dell'articolo

		Articolo articoloTemp1 = new Articolo("esca", "po9", 3, LocalDate.parse("2022-01-10"));
		articoloTemp1.setOrdine(ordineTemp);
		Articolo articoloTemp2 = new Articolo("amo", "po9", 3, LocalDate.parse("2022-01-10"));
		articoloTemp2.setOrdine(ordineTemp);

		articoloServiceInstance.inserisciNuovo(articoloTemp1);
		articoloServiceInstance.inserisciNuovo(articoloTemp2);

		Categoria categoriaTemp1 = new Categoria("sea", "c9");
		categoriaServiceInstance.inserisciNuovo(categoriaTemp1);

		articoloServiceInstance.aggiungiCategoria(articoloTemp1, categoriaTemp1);
		articoloServiceInstance.aggiungiCategoria(articoloTemp2, categoriaTemp1);

		Articolo articoloTemp1Ricaricato = articoloServiceInstance.caricaEagerDaID(articoloTemp1.getId());
		Articolo articoloTemp2Ricaricato = articoloServiceInstance.caricaEagerDaID(articoloTemp2.getId());

		// lancio il metodo
		int sommaPrezziArticoliDaCategoria = articoloServiceInstance
				.sommaPrezzoArticoliByCategoria(categoriaTemp1.getId());
		if (sommaPrezziArticoliDaCategoria == 0)
			throw new RuntimeException(
					"TestListaCategorieDistinteDaOrdine FALLITO: nessuna categoria collegata presente");
		System.out.println(".......TestListaCategorieDistinteDaOrdine fine: PASSED......."
				+ sommaPrezziArticoliDaCategoria + " ....");

	}

	public static void TestUltimoOrdineByCategoria(CategoriaService categoriaServiceInstance,
			ArticoloService articoloServiceInstance, OrdineService ordineServiceInstance) throws Exception {

		System.out.println(".......TestUltimoOrdineByCategoria start.............");

		// creo due articoli con diversi ordini ma stessa categoria
		Ordine ordineTemp1 = new Ordine("primo", "via gruul 12", LocalDate.parse("2020-03-10"),
				LocalDate.parse("2022-03-10"));
		ordineServiceInstance.inserisciNuovo(ordineTemp1); // deve avvenire prima dell'inserimento dell'articolo

		Ordine ordineTemp2 = new Ordine("secondo", "via ball 12", LocalDate.parse("2022-03-10"),
				LocalDate.parse("2022-03-10"));
		ordineServiceInstance.inserisciNuovo(ordineTemp2); // deve avvenire prima dell'inserimento dell'articolo

		Articolo articoloTemp1 = new Articolo("vite", "po9", 3, LocalDate.parse("2022-01-10"));
		articoloTemp1.setOrdine(ordineTemp1);
		Articolo articoloTemp2 = new Articolo("filo", "po9", 3, LocalDate.parse("2022-01-10"));
		articoloTemp2.setOrdine(ordineTemp2);

		articoloServiceInstance.inserisciNuovo(articoloTemp1);
		articoloServiceInstance.inserisciNuovo(articoloTemp2);

		Categoria categoriaTemp1 = new Categoria("tempo", "c9");
		categoriaServiceInstance.inserisciNuovo(categoriaTemp1);

		articoloServiceInstance.aggiungiCategoria(articoloTemp1, categoriaTemp1);
		articoloServiceInstance.aggiungiCategoria(articoloTemp2, categoriaTemp1);

		Articolo articoloTemp1Ricaricato = articoloServiceInstance.caricaEagerDaID(articoloTemp1.getId());
		Articolo articoloTemp2Ricaricato = articoloServiceInstance.caricaEagerDaID(articoloTemp2.getId());
		// provo a richiamare dall'id di ordine le categorie distinte
		Ordine lastOrderTest = ordineServiceInstance.trovaPiuRecenteBySpedizioneByCategoria(categoriaTemp1.getId());
		if (lastOrderTest == null)
			throw new RuntimeException("TestUltimoOrdineByCategoria FALLITO: nessuna categoria collegata presente");
		System.out.println(".......TestUltimoOrdineByCategoria fine: PASSED......." + lastOrderTest + " ....");
	}

	public static void TestListaCodiciCategoriePerDataOrdine(CategoriaService categoriaServiceInstance,
			ArticoloService articoloServiceInstance, OrdineService ordineServiceInstance) throws Exception {

		System.out.println(".......TestListaCategoriePerDataOrdine start.............");

		// creo 3 categorie, la prima collegata a due articoli con stesso ordine che
		// intercettiamo
		// una collegata ad un articolo con diverso ordine ma che interecettiamo
		// l'ultima collegata ad un articolo con ordine diverso che non intercettiamo
		Categoria categoriaTemp1 = new Categoria("first", "c1");
		categoriaServiceInstance.inserisciNuovo(categoriaTemp1);
		Categoria categoriaTemp2 = new Categoria("second", "c2");
		categoriaServiceInstance.inserisciNuovo(categoriaTemp2);
		Categoria categoriaTemp3 = new Categoria("nope", "c3");
		categoriaServiceInstance.inserisciNuovo(categoriaTemp3);

		Ordine ordineTemp1 = new Ordine("First", "via gruul 12", LocalDate.parse("2010-11-10"),
				LocalDate.parse("2022-03-10"));
		ordineServiceInstance.inserisciNuovo(ordineTemp1);
		Articolo articoloTemp1 = new Articolo("Temp1First", "po9", 3, LocalDate.parse("2022-01-10"));
		articoloTemp1.setOrdine(ordineTemp1);
		Articolo articoloTemp2 = new Articolo("Temp2First", "po9", 3, LocalDate.parse("2022-01-10"));
		articoloTemp2.setOrdine(ordineTemp1);
		articoloServiceInstance.inserisciNuovo(articoloTemp1);
		articoloServiceInstance.inserisciNuovo(articoloTemp2);
		articoloServiceInstance.aggiungiCategoria(articoloTemp1, categoriaTemp1);
		articoloServiceInstance.aggiungiCategoria(articoloTemp2, categoriaTemp1);

		Ordine ordineTemp2 = new Ordine("Second", "via gruul 12", LocalDate.parse("2010-11-10"),
				LocalDate.parse("2022-03-10"));
		ordineServiceInstance.inserisciNuovo(ordineTemp2);
		Articolo articoloTemp3 = new Articolo("Temp3Second", "po9", 3, LocalDate.parse("2022-01-10"));
		articoloTemp3.setOrdine(ordineTemp2);
		articoloServiceInstance.inserisciNuovo(articoloTemp3);
		articoloServiceInstance.aggiungiCategoria(articoloTemp3, categoriaTemp2);

		Ordine ordineTemp3 = new Ordine("Third", "via gruul 12", LocalDate.parse("2020-11-10"),
				LocalDate.parse("2022-03-10"));
		ordineServiceInstance.inserisciNuovo(ordineTemp3);
		Articolo articoloTemp4 = new Articolo("Temp4Third", "po9", 3, LocalDate.parse("2022-01-10"));
		articoloTemp4.setOrdine(ordineTemp3);
		articoloServiceInstance.inserisciNuovo(articoloTemp4);
		articoloServiceInstance.aggiungiCategoria(articoloTemp4, categoriaTemp3);

		Articolo articoloTemp1Ricaricato = articoloServiceInstance.caricaEagerDaID(articoloTemp1.getId());
		Articolo articoloTemp2Ricaricato = articoloServiceInstance.caricaEagerDaID(articoloTemp2.getId());
		Articolo articoloTemp3Ricaricato = articoloServiceInstance.caricaEagerDaID(articoloTemp3.getId());
		Articolo articoloTemp4Ricaricato = articoloServiceInstance.caricaEagerDaID(articoloTemp4.getId());
		// test del metodo, vogliamo due valori in uscita
		List<String> codiciOutput = categoriaServiceInstance.codiciCategorieDistinteDaDataOrdine(11, 2010);
		if (codiciOutput.isEmpty())
			throw new RuntimeException(
					"TestListaCodiciCategoriePerDataOrdine FALLITO: nessuna categoria collegata presente");
		System.out.println(
				".......TestListaCodiciCategoriePerDataOrdine fine: PASSED......." + codiciOutput.size() + " ....");
	}

	public static void TestSommaPrezziAricoliByDestinatario(ArticoloService articoloServiceInstance,
			OrdineService ordineServiceInstance) throws Exception {

		System.out.println(".......TestSommaPrezziAricoliByDestinatario start.............");

		// credo 3 articoli, due collegati ad un ordine e quindi un destinatario e uno
		// ad un altro ordine
		Ordine ordineTemp1 = new Ordine("destinatario somma", "via piazza 12", LocalDate.parse("2010-11-10"),
				LocalDate.parse("2022-03-10"));
		ordineServiceInstance.inserisciNuovo(ordineTemp1);
		Articolo articoloTemp1 = new Articolo("calcolatrice", "c8", 5, LocalDate.parse("2022-01-10"));
		articoloTemp1.setOrdine(ordineTemp1);
		Articolo articoloTemp2 = new Articolo("righello", "r4", 4, LocalDate.parse("2022-01-10"));
		articoloTemp2.setOrdine(ordineTemp1);
		articoloServiceInstance.inserisciNuovo(articoloTemp1);
		articoloServiceInstance.inserisciNuovo(articoloTemp2);

		Ordine ordineTemp2 = new Ordine("destinatraio void", "via gruul 12", LocalDate.parse("2010-11-10"),
				LocalDate.parse("2022-03-10"));
		ordineServiceInstance.inserisciNuovo(ordineTemp2);
		Articolo articoloTemp3 = new Articolo("pizza", "pp", 12, LocalDate.parse("2022-01-10"));
		articoloTemp3.setOrdine(ordineTemp2);
		articoloServiceInstance.inserisciNuovo(articoloTemp3);

		Articolo articoloTemp1Ricaricato = articoloServiceInstance.caricaEagerDaID(articoloTemp1.getId());
		Articolo articoloTemp2Ricaricato = articoloServiceInstance.caricaEagerDaID(articoloTemp2.getId());
		Articolo articoloTemp3Ricaricato = articoloServiceInstance.caricaEagerDaID(articoloTemp3.getId());

		// test del metodo
		int sommaPrezziTest = articoloServiceInstance.sommaPrezziByDestinatario("destinatario somma");
		if (sommaPrezziTest == 0)
			throw new RuntimeException(
					"TestSommaPrezziAricoliByDestinatario FALLITO: nessuna destinatario collegato presente");
		System.out
				.println(".......TestSommaPrezziAricoliByDestinatario fine: PASSED......." + sommaPrezziTest + " ....");
	}

	public static void TestIndirizziDistintiByStringaContenutaSerialeArticoli(ArticoloService articoloServiceInstance,
			OrdineService ordineServiceInstance) throws Exception {

		System.out.println(".......TestIndirizziDistintiByStringaContenutaSerialeArticoli start.............");

		// credo tre articoli, due collegati ad un ordine e l'ultimo ad un altro ordine,
		// che non ricerco però
		Ordine ordineTemp1 = new Ordine("paolo ind", "via popolo 12", LocalDate.parse("2010-11-10"),
				LocalDate.parse("2022-03-10"));
		ordineServiceInstance.inserisciNuovo(ordineTemp1);
		Articolo articoloTemp1 = new Articolo("tavolo", "77tav99", 5, LocalDate.parse("2022-01-10"));
		articoloTemp1.setOrdine(ordineTemp1);
		Articolo articoloTemp2 = new Articolo("tavoletta", "18tav", 4, LocalDate.parse("2022-01-10"));
		articoloTemp2.setOrdine(ordineTemp1);
		articoloServiceInstance.inserisciNuovo(articoloTemp1);
		articoloServiceInstance.inserisciNuovo(articoloTemp2);

		Ordine ordineTemp2 = new Ordine("paolo void", "via zama 12", LocalDate.parse("2010-11-10"),
				LocalDate.parse("2022-03-10"));
		ordineServiceInstance.inserisciNuovo(ordineTemp2);
		Articolo articoloTemp3 = new Articolo("bicchiere", "b11", 12, LocalDate.parse("2022-01-10"));
		articoloTemp3.setOrdine(ordineTemp2);
		articoloServiceInstance.inserisciNuovo(articoloTemp3);

		Articolo articoloTemp1Ricaricato = articoloServiceInstance.caricaEagerDaID(articoloTemp1.getId());
		Articolo articoloTemp2Ricaricato = articoloServiceInstance.caricaEagerDaID(articoloTemp2.getId());
		Articolo articoloTemp3Ricaricato = articoloServiceInstance.caricaEagerDaID(articoloTemp3.getId());

		// test del metodo
		List<String> indirizziOutput = ordineServiceInstance.trovaIndirizziDistinctOrdiniBySerialeOfArticoli("tav");
		if (indirizziOutput.isEmpty())
			throw new RuntimeException(
					"TestIndirizziDistintiByStringaContenutaSerialeArticoli FALLITO: nessuna categoria collegata presente");
		System.out.println(".......TestIndirizziDistintiByStringaContenutaSerialeArticoli fine: PASSED......."
				+ indirizziOutput.size() + " ....");
	}

	public static void TestArticoliConOrdiniErrati(ArticoloService articoloServiceInstance,
			OrdineService ordineServiceInstance) throws Exception {

		System.out.println(".......TestArticoliConOrdiniErrati start.............");

		// credo due articoli con stesso ordine errato e un articolo con ordine
		// corretto(necessario se svuoto la base dati)
		Ordine ordineTemp1 = new Ordine("nina nino", "via popolo 12", LocalDate.parse("2010-11-10"),
				LocalDate.parse("2009-03-10"));
		ordineServiceInstance.inserisciNuovo(ordineTemp1);
		Articolo articoloTemp1 = new Articolo("penna", "c1", 5, LocalDate.parse("2022-01-10"));
		articoloTemp1.setOrdine(ordineTemp1);
		Articolo articoloTemp2 = new Articolo("gomma", "c1", 4, LocalDate.parse("2022-01-10"));
		articoloTemp2.setOrdine(ordineTemp1);
		articoloServiceInstance.inserisciNuovo(articoloTemp1);
		articoloServiceInstance.inserisciNuovo(articoloTemp2);

		Ordine ordineTemp2 = new Ordine("paolo verdi", "via rossi 12", LocalDate.parse("2010-11-10"),
				LocalDate.parse("2022-03-10"));
		ordineServiceInstance.inserisciNuovo(ordineTemp2);
		Articolo articoloTemp3 = new Articolo("sale", "b11", 12, LocalDate.parse("2022-01-10"));
		articoloTemp3.setOrdine(ordineTemp2);
		articoloServiceInstance.inserisciNuovo(articoloTemp3);

		Articolo articoloTemp1Ricaricato = articoloServiceInstance.caricaEagerDaID(articoloTemp1.getId());
		Articolo articoloTemp2Ricaricato = articoloServiceInstance.caricaEagerDaID(articoloTemp2.getId());
		Articolo articoloTemp3Ricaricato = articoloServiceInstance.caricaEagerDaID(articoloTemp3.getId());

		// test del metodo
		List<Articolo> listaArticoliTest = articoloServiceInstance.trovaByOrdineError();
		if (listaArticoliTest.isEmpty())
			throw new RuntimeException("TestArticoliConOrdiniErrati FALLITO: nessuna articolo con errori");
		System.out.println(
				".......TestArticoliConOrdiniErrati fine: PASSED......." + listaArticoliTest.toString() + " ....");
	}

	///////////////// some tests
	///////////////// ////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void TestClearAllTable(CategoriaService categoriaServiceInstance,
			ArticoloService articoloServiceInstance, OrdineService ordineServiceInstance) throws Exception {

		System.out.println(".......TestClearAllTable start.............");
		articoloServiceInstance.eliminaTutto();
		ordineServiceInstance.eliminaTutto();
		categoriaServiceInstance.eliminaTutto();
		System.out.println(
				".......TestClearAllTable fine: PASSED...........");

	}
	
	
	
}
