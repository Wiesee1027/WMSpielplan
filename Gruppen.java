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

    public void ordneNachPunkten()
    {
        ergebnisse = new ArrayList<Team>();
        Iterator<Team> it = mannschaften.iterator(); 
        int x = 0;
        int y = 0;
        while(it.hasNext())
        {
            Team team = it.next();
            Team letzter = null;
            if(team.gibPunkte()==0)
            {
                letzter=team;
            }
            if(team.gibPunkte()<x)
            {
                x=team.gibPunkte();
            }
            y++;
            ergebnisse.add(mannschaften.get(y));
            it.remove();
            y=0;
            ergebnisse.add(team);
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
    }
}
