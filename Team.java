
/**
 * Beschreiben Sie hier die Klasse Teams.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Team
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private int anzahlSpieler;

    /**
     * Konstruktor für Objekte der Klasse Teams
     */
    public Team(String name, int anzahlSpieler)
    {
        this.name = name;
        this.anzahlSpieler = anzahlSpieler;
    }

    public String gibName(){
        return name;
    }
    
    public int gibAnzahlSpieler(){
        return anzahlSpieler;
    }
    
    public int spielerVerletzt(){
        int anzahl = 0;
        return anzahl;
        //return gibanzahlSpieler() + anzahl;
    }
}
