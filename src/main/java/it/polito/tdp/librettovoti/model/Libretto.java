package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti; //dichiaro la variabile che per il momento è null perchè non ho ancora creato il libretto
	
	//costruttore del libretto, quando costruisco il libretto inizializzo anche la lista voti
	public Libretto() {
		
	this.voti=new ArrayList<Voto>();
		
	}

	public void add(Voto voto) {
		voti.add(voto);
		
	}
	
	public String toString() {
		
		//return voti.toString();//per ciascuna componente di ciascun voto, stampa l'uid se voto non dice come vuole essere stampato 
		String s="";
		for(Voto v: voti) {
			
			s = s+ v.toString() + "\n";
			
		}
		return s;
	
	}
	
	//stampa i voti uguali al numero passato come parametro(il test lo faccio poi in TestLibretto)
	public List <Voto> listaVotiUguali(int punteggio){
		
		List<Voto> risultato=new ArrayList<Voto>();
		for(Voto v:voti) {
			
			if(v.getVoto()==punteggio) {
				
				risultato.add(v);
			}
			
						
		}
		
		return risultato;

	}
	
	public Libretto votiUguali(int punteggio) {
		Libretto risultato=new Libretto();
		for(Voto v:voti) {
			if(v.getVoto()==punteggio)
				risultato.add(v);
			
		}
		
		return risultato;
		
		
		
	}
	
	
}
