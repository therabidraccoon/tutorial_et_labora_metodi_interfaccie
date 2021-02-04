package it.etlabora.testjava.figure.impl;

import it.etlabora.testjava.figure.IFigura;

public class Quadrato implements IFigura {

	public static final int NUM_LATI = 4;
	private int lunghezzaLato;

	@Override
	public int calcolaPerimetro() {
		int perimetro = lunghezzaLato * NUM_LATI;
		return perimetro;
	}
	
	public int getLunghezzaLato() {
		return lunghezzaLato;
	}

	public void setLunghezzaLato(int lunghezzaLato) {
		this.lunghezzaLato = lunghezzaLato;
	}

}
