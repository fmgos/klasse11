package de.fmg.baum;

import org.junit.Test;

import de.fmg.datenelement.v2.*;


/**
* The test class Baumaufbau.
*
* @author  (your name)
* @version (a version number or a date)
*/
public class Baumaufbau extends junit.framework.TestCase
{
    private Knoten knoten4;
    private Knoten knoten12;
    private Knoten knoten23;
    private Knoten knoten33;
    private Knoten knoten7;
    private Knoten knoten28;
    private Knoten knoten18;
    private Baum baum;

    /**
    * Default constructor for test class Baumaufbau
    */
    public Baumaufbau(){
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    public void setUp(){
        knoten4 = new Knoten(new Zahldaten(4));
        knoten12 = new Knoten(new Zahldaten(12));
        knoten23 = new Knoten(new Zahldaten(23));
        knoten33 = new Knoten(new Zahldaten(33));
        knoten7 = new Knoten(new Zahldaten(7), knoten4, knoten12);
        knoten28 = new Knoten(new Zahldaten(28), knoten23, knoten33);
        knoten18 = new Knoten(new Zahldaten(18), knoten7, knoten28);
        baum = new Baum(knoten18);
        baum.suchen(new Zahldaten(12));
        baum.suchen(new Zahldaten(29));
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }
    
    @Test
    public void testTestSuchen()
    {
        assertNotNull(Baum.suchen(new Zahldaten(12)));
        assertNull(Baum.suchen(new Zahldaten(32)));
    }
}
