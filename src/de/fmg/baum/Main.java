package de.fmg.baum;

import org.junit.Test;

import de.fmg.datenelement.v2.Zahldaten;

public class Main {

	public static void main(String[] args) {

		 	Knoten knoten4;
		    Knoten knoten12;
		    Knoten knoten23;
		    Knoten knoten33;
		    Knoten knoten7;
		    Knoten knoten28;
		    Knoten knoten18;
		    Baum baum;

		    
		    
		    knoten4 = new Knoten(new Zahldaten(4));
		    knoten12 = new Knoten(new Zahldaten(12));
		    knoten23 = new Knoten(new Zahldaten(23));
		    knoten33 = new Knoten(new Zahldaten(33));
		    knoten7 = new Knoten(new Zahldaten(7), knoten4, knoten12);
		    knoten28 = new Knoten(new Zahldaten(28), knoten23, knoten33);
		    knoten18 = new Knoten(new Zahldaten(18), knoten7, knoten28);
		    baum = new Baum(knoten18);
		    baum.alleAusgeben();
		    System.out.println(baum.suchen(new Zahldaten(12)));
		    System.out.println(baum.suchen(new Zahldaten(29)));
		    
	}

}
