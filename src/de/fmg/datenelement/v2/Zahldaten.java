package de.fmg.datenelement.v2;


/**
 * Datenelemente mit einer Ganzzahl als Wert.
 * 
 * @author Arbeitskreis
 * @version 1.0
 */
public class Zahldaten extends Datenelement
{
    /** Der Wert des Elements */
    private int wert;
   
    
    /**
     * Legt das Datenelement mit dem gegebenen Wert an.
     * @param w Wert des Datenelements
     */
    public Zahldaten(int w)
    {
        wert = w;
    }
    
    /**
     * Vergleicht das vorhandene Datenelement mit dem &uuml;bergebenen.
     * @param wert Referenz auf den Vergleichswert
     * @return -1: das aktuelle Element ist kleiner als das Vergleichselement<br>
     *          0: das aktuelle Elelemt hat den gleichen Wert wie das Vergleichselement<br>
     *          1: das aktuelle Element ist gr&ouml;&szlig;er als das Vergleichselement
     */
    public int vergleichen(Datenelement wert)
    {
        int vergleich;
        vergleich = ((Zahldaten) wert).wert;
        
        //oder auch
        Zahldaten vgl = (Zahldaten)wert;
        int vgl1 = vgl.wert;
        
        if (this. wert == vergleich)
        {
            return 0;
        }
        else if (this. wert < vergleich)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
    
    @Override
    /**
     * Gibt die relevante Information des Datenelements auf die Konsole aus.
     */
    public void ausgeben()
    {
        System. out. println ("Das Datenelement hat den Wert: " + wert);
    }
}
