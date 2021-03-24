package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;



// Questa classe è POJO - Plain old java object
// E' una semplice classe che contiene dei paramentri, ma non h alogica, non fa nulla

/**
 * Classe che memorizza il nome del corso superato, il voto dell'esame e la data di superamento
 * @author Serena
 *
 */

public class Voto {
	private String nomeCorso;
	private int voto;
	private LocalDate data;
	
	
	
	/**
	 * 
	 * @param nomeCorso nome esame superato
	 * @param voto voto di superamento
	 * @param data data di superamento
	 */
	public Voto(String nomeCorso, int voto, LocalDate data) {
		super();
		this.nomeCorso = nomeCorso;
		this.voto = voto;
		this.data = data;
	}




	public String getNomeCorso() {
		return nomeCorso;
	}




	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}




	public int getVoto() {
		return voto;
	}




	public void setVoto(int voto) {
		this.voto = voto;
	}




	public LocalDate getData() {
		return data;
	}




	public void setData(LocalDate data) {
		this.data = data;
	}




	@Override
	public String toString() {
		return "Esame " + nomeCorso + " superato con " + voto + " in data " + data + "]";
	}
	
	
	
}
