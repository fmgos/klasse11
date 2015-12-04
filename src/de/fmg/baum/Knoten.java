package de.fmg.baum;

import de.fmg.datenelement.v2.Datenelement;


/**
 * Verwaltet einen Knoten des Baums.
 * 
 * @author Arbeitskreis 
 * @version 1.0
 */
public class Knoten
{
    /** Referenz auf den linken Nachfolger */
    private Knoten linkerNachfolger;
    /** Referenz auf den rechten Nachfolger */
    private Knoten rechterNachfolger;
    /** Referenz auf das Datenelement */
    private Datenelement element;

    /**
     * Erzeugt einen Knoten mit den dem angegebenen Datenelement.
     * @param d Referenz auf das verwaltete Datenelement
     */
    public Knoten(Datenelement d)
    {
        linkerNachfolger = null;
        rechterNachfolger = null;
        element = d;
    }

    /**
     * Erzeugt einen Knoten mit den dem angegebenen Datenelement und den gegebenen Nachfolgern.
     * Dieser Konstruktor ist nur zu Testzwecken vorhanden.
     * @param d Referenz auf das verwaltete Datenelement
     * @param lnf linker Nachfolger
     * @param rnf rechter Nachfolger
     */
    public Knoten(Datenelement d, Knoten lnf, Knoten rnf)
    {
        linkerNachfolger = lnf;
        rechterNachfolger = rnf;
        element = d;
    }
    
    /**
     * Sucht im Baum nach dem gegebenen Datenelelement.
     * @param wert Referenz auf ein Datenelement mit dem Vergleichswert
     * @return Referenz auf das Datenelement, wenn der Wert gefunden wurde<br>null: sonst
     */
    public Datenelement suchen (Datenelement wert)
    {
        if (element.vergleichen(wert) == 0)
        {
            return element;
        }
        else
        {
            if (element.vergleichen(wert) < 0)
            {
                if (rechterNachfolger == null)
                {
                    return null;
                }
                else
                {
                    return rechterNachfolger.suchen (wert);
                }
            }
            else
            {
                if (linkerNachfolger == null)
                {
                    return null;
                }
                else
                {
                    return linkerNachfolger.suchen (wert);
                }
            }
        }
    }
    
    public void ausgeben(){
    	element.ausgeben();
    	
    	if (linkerNachfolger != null)
        {
            linkerNachfolger.ausgeben();
        }
    	if (rechterNachfolger != null)
        {
           rechterNachfolger.ausgeben();
        }
    }
}
