package de.fmg.liste;
import de.fmg.datenelement.*;

public class Main {

	public static void main(String[] args) {

		Dokumentarfilm doku1 = new Dokumentarfilm("Plastik Planet", false);
		Dokumentarfilm doku2 = new Dokumentarfilm("Das Meer", true);
		DreiDFilm hdr = new DreiDFilm("Herr der Ringe", 10.00, true, 16);
		DreiDFilm hobbit = new DreiDFilm("Der Hobbit", 12.00, true, 12);
		DreiDFilm hobbit2 = new DreiDFilm("Der Hobbit 2", 12.00, true, 12);
		DreiDFilm hobbit3 = new DreiDFilm("Der Hobbit 3", 12.00, true, 12);
		
		Listenelement liste = new Listenelement();
		liste.alleAusgeben();
		
		liste.endeEinfügen(doku1);
		liste.alleAusgeben();
		
		liste.anfangEnfernen();
		liste.alleAusgeben();
		
		liste.anfangEinfuegen(hobbit3);
		liste.anfangEinfuegen(hobbit2);
		liste.anfangEinfuegen(hobbit);
		liste.anfangEinfuegen(doku1);
		liste.alleAusgeben();
		System.out.println(liste.anzahlGeben());
		
		

	}

}
