

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse SpielTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class SpielTest
{
    private Team team1;
    private Team team2;
    private Spiel spiel1;

    /**
     * Konstruktor fuer die Test-Klasse SpielTest
     */
    public SpielTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
        spiel1 = new Spiel(team1, team2);
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testeGewinner()
    {
        Team Gewinner = spiel1.gibGewinner(2, 3);
        assertEquals("Belgien", Gewinner.gibName());
    }
}

