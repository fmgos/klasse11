package de.fmg.datenelement;


public class DreiDFilm extends Datenelement{
	
	private double preis;
	private boolean brille;
	private int fsk;

	public DreiDFilm(String name, double preis, boolean brille, int fsk) {
		super(name);
		this.preis = preis;
		this.brille = brille;
		this.fsk = fsk;
	}

	@Override
	public void ausgeben() {
		System.out.println("Der 3D-Film " + name + " kostet " + preis + "€ und ist frei ab " + fsk +" Jahren.");
		System.out.print(" Für den Besuch ist ");
		if (brille)
			System.out.println("eine Brille nötig.");
		else
			System.out.println("keine Brille nötig.");
	}

}
