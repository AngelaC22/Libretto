package it.polito.tdp.libretto.model;

import java.util.ArrayList;
import java.util.List;

public class Model {
	
	private List<Esame> esami ;

	public Model() {
		this.esami = new ArrayList<Esame>() ;
	}
	
	/**
	 * Aggiunge un nuovo esame all'elenco degli esami presenti
	 * @param e
	 * @return true se l'ha inserito
	 * @return false se esiste gi� e quindi non l'ha potuto inserire
	 */
	public boolean addEsame(Esame e){
		if (! esami.contains(e)){
			esami.add(e) ;
			return true;
		} else
			return false;
			
	}
	
	/**
	 * Ricerca se esiste un esame con il codice specificato
	 * Se esiste lo restituisce, altrimenti restituisce null
	 * @param codice = codice dell'esame da ricercare
	 * @return l'esame trovato, oppure null se non trovato
	 */
	public Esame trovaEsame(String codice){
		int pos = this.esami.indexOf(new Esame(codice, null, null));
		if (pos ==-1){
			return null;
		} else {
			return esami.get(pos);
		}
	}

}
