package de.fmg.kompositum;

import de.fmg.datenelement.Datenelement;


public class Listenelement {
	
	private Knoten erster;

	public boolean isEmpty(){
		return erster == null;
	}

	public Knoten anfangGeben(){
		return erster;
	}

	public void anfangEinfuegen(Datenelement element){
		//Knoten n = new Knoten(erster, element);
		//erster = n;
		//kurz:
		erster = new Knoten (erster, element);
	}
	
	public void endeEinfuegen (Datenelement element){
		if (erster != null)
			erster.einfuegen(element);
		else
			anfangEinfuegen(element);
	}
	
	public int anzahlGeben(){
		if (erster == null)
			return 0;
		else
			return erster.anzahlAbHier();
	}
	
	public Datenelement anfangEnfernen(){
		Datenelement entfernt;
		if (erster != null){
			entfernt = erster.datenGeben();
			erster = erster.nachfolgerGeben();
		} else {
			entfernt = null;
		}
		return entfernt;
	}
	
	public void alleAusgeben(){
		if (erster != null)
			erster.alleAusdrucken();
		else
			System.out.println("Keine Elemente in der Liste!");
	}

}
