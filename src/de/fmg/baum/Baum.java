package de.fmg.baum;

import de.fmg.datenelement.v2.Datenelement;


/**
 * Verwaltet den Baum als Ganzes.
 * 
 * @author Arbeitskreis
 * @version 1.0
 */
public class Baum
{
    /** Referenz auf die Wurzel des Baums */
    private Knoten wurzel;

    /**
     * Legt einen leeren Baum an.
     */
    public Baum()
    {
        wurzel = null;
    }

    /**
     * Legt einen Baum mit angegebener Wurzel an.
     * Dieser Konstruktor ist nur zu Testzwecken vorhanden.
     * @param w Referenz auf den WurzelKnoten
     */
    public Baum(Knoten w)
    {
        wurzel = w;
    }
    
    /**
     * Sucht im Baum nach dem gegebenen Datenelelement.
     * @param <Datenelement>
     * @param wert Referenz auf ein Datenelement mit dem Vergleichswert
     * @return Referenz auf das Datenelement, wenn der Wert gefunden wurde<br>null: sonst
     */
    public Datenelement suchen (Datenelement wert)
    {
        if (wurzel == null)
        {
            return null;
        }
        else
        {
            return wurzel.suchen (wert);
        }
    }
    
    public void alleAusgeben(){
    	if (wurzel != null){
    		wurzel.ausgeben();
    	}
    }
}
