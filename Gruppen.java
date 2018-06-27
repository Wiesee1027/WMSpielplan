import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Gruppen.
 * 
 * @author (Alex Wiese, Stepahn Strecker) 
 * @version (1.0 - 22.06.2018)
 */
public class Gruppen
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private ArrayList<Team> mannschaften;
    private String name;
    private ArrayList<Team> ergebnisse;


    /**
     * Konstruktor für Objekte der Klasse Gruppen
     */
    public Gruppen()
    {
        mannschaften = new ArrayList<Team>(); 
    }
    
    
       public void ordne()
    {
        Collections.sort(mannschaften, new Ordnepunkt());   
    }   
      
    

    public Team gibplatzeins()
    {
        return mannschaften.get(3);
    }

    public Team gibtplatz2()
    {
        return mannschaften.get(2);
    }

    public int gibSize()
    {
        return mannschaften.size();   
    }

    public void hinzu(Team team)
    {
        mannschaften.add(team);
    }
}
