package de.fmg.kompositum;

import de.fmg.datenelement.Datenelement;

public class Knoten {
	
	private Knoten naechster;
	private Datenelement element;

	public Knoten(Knoten naechster, Datenelement element) {
		this.naechster = naechster;
		this.element = element;
	}

	public Knoten(Datenelement element2) {
		this.element = element2;
	}

	public Datenelement datenGeben() {
		return element;
	}
	
	public Knoten nachfolgerGeben() {
		return naechster;
	}
	
	public void einfuegen(Datenelement element) {
		if (naechster == null){
			naechster = new Knoten(element);
		}else{
			naechster.einfuegen(element);
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
