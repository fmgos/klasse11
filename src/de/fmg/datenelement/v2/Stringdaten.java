package de.fmg.datenelement.v2;


/**
 * Datenelemente mit einer Zeichenkette als Wert.
 * 
 * @author Arbeitskreis
 * @version 1.0
 */

import java.text.Collator;

public class Stringdaten extends Datenelement
{
    /** Der Wert des Elements */
    private String wert;
    /** Vergleichsobjekt */
    private Collator coll;
    
    /**
     * Legt das Datenelement mit dem gegebenen Wert an.
     * @param w Wert des Datenelements
     */
    public Stringdaten(String w)
    {
        wert = w;
        coll = Collator.getInstance ();
    }
    
    /**
     * Vergleicht das vorhandene Datenelement mit dem &uuml;bergebenen.
     * @param wert der Vergleichswert
     * @return -1: das aktuelle Element ist kleiner als das Vergleichselement<br>
     *          0: das aktuelle Elelemt hat den gleichen Wert wie das Vergleichselement<br>
     *          1: das aktuelle Element ist gr&ouml;&szlig;er als das Vergleichselement
     */
    public int vergleichen(Datenelement wert)
    {
        return coll.compare (this.wert, ((Stringdaten)wert).wert);
    }
    
    @Override
    /**
     * Gibt die relevante Information des Datenelements auf die Konsole aus.
     */
    public void ausgeben()
    {
        System.out.println ("Das Datenelement hat den Wert: " + wert);
    }

	
}
