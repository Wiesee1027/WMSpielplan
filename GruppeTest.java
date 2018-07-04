





import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse GruppeTest.
 *
 * @author  (Stephan,Alex)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class GruppeTest
{
    private Gruppe gruppe1;

    

   
    

    /**
     * Konstruktor fuer die Test-Klasse GruppeTest
     */
    public GruppeTest()
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
        gruppe1 = new Gruppe();
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
    public void testeErster()
    {
        assertEquals(4, gruppe1.gibSize());
        gruppe1.ordne();
        Team Erster = gruppe1.gibplatzeins();
        assertEquals(6, Erster.gibPunkte());
        assertEquals("mexico", Erster.gibName());
    }

    @Test
    public void testeZweiter()
    {
        assertEquals(4, gruppe1.gibSize());
        gruppe1.ordne();
        Team Zweiter = gruppe1.gibtplatz2();
        assertEquals("Deutschland", Zweiter.gibName());
        assertEquals(4, Zweiter.gibPunkte());
    }
}
