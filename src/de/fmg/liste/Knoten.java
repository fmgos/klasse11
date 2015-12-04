package de.fmg.liste;

import de.fmg.datenelement.Datenelement;

public class Knoten {
	
	private Knoten naechster;
	private Datenelement element;

	public Knoten(Knoten naechster, Datenelement element) {
		this.naechster = naechster;
		this.element = element;
	}

	public Knoten(Datenelement element2) {
		this.element = element;
	}

	public Datenelement datenGeben() {
		return element;
	}
	
	public Knoten nachfolgerGeben() {
		return naechster;
	}
	
	public void einf�gen(Datenelement element) {
		if (naechster == null){
			naechster = new Knoten(element);
		}else{
			naechster.einf�gen(element);
		}
	}

	public int anzahlAbHier() {
		if (naechster != null){
			return naechster.anzahlAbHier() + 1;
		}else{
			return 1;
		}
	}
	
	public void alleAusdrucken(){
		element.ausgeben();
		if (naechster != null)
			naechster.alleAusdrucken();
	}

	

	

}
