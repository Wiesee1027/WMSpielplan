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
    private ArrayList<Integer>punkteliste;

    /**
     * Konstruktor für Objekte der Klasse Gruppen
     */
    public Gruppen()
    {
        mannschaften = new ArrayList<Team>(); 
        punkteliste=new ArrayList<Integer>();
    }
       public void ordne()
    {
        Collections.sort(punkteliste);   
    }

    public void ordneNachPunkten()
    {
        ergebnisse= new ArrayList<Team>();
        ordne();
        int i=4;
        for(Team team:mannschaften)
        {
           for(int in :punkteliste)
           {
               if(team.gibPunkte()==in)
               {
                   ergebnisse.add(team);
                  
                }
            }
        }
      
    }

    public void gibplatzeins()
    {

    }

    public void gibtplatz2()
    {

    }

    public int gibSize()
    {
        return mannschaften.size();   
    }

    public void hinzu(Team team)
    {
        mannschaften.add(team);
        punkteliste.add(team.gibPunkte());
    }
}
