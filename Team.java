import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Teams.
 * 
 * @author (Alex Wiese, Stepahn Strecker) 
 * @version (1.0 - 22.06.2018)
 */
public class Team
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private ArrayList<Spieler> spieler;
    private Person trainer;
    private int tore;
    private int gegentore;
    private int punkte;
    

    /**
     * Konstruktor für Objekte der Klasse Teams
     */
    public Team(String name, int anzahlSpieler)
    {
        this.name = name;
    }

    public String gibName()
    {
        return name;
    }
    
    public Person gibTrainer()
    {
        return trainer;   
    }
    
    public Spieler gibSpieler(String position)
    {
        for(Spieler s:spieler)
        {
            if(s.gibPostion().equals(position))
            {
             return s;   
            }
        }
        return null;
    }
    
    public int gibPunkte()
    {
       return punkte; 
    }
    
    
}
