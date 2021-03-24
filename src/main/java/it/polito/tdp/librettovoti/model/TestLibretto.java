package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libretto libretto=new Libretto();
		System.out.println("Libretto voti test:");
		
		Voto voto1=new Voto("Analisi1", 30, LocalDate.of(2019, 2, 15));
		libretto.add(voto1);
		libretto.add(new Voto("Fisica 1", 28, LocalDate.of(2019, 7, 15)));
		libretto.add(new Voto("Informatica", 24, LocalDate.of(2019, 9, 15)));
		
		System.out.println(libretto);//stampa l'uid di libretto. dobbiamo formattare un modo per stampare il libretto. non deve essere test a sapere come stamparlo, ma il libretto deve dirci come stamparsi
		
	}

}
