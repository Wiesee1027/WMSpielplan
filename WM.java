import java.util.*;
/**
 * Beschreiben Sie hier die Klasse WM.
 * 
 * @author (Alex Wiese, Stepahn Strecker) 
 * @version (1.0 - 22.06.2018)
 */
public class WM
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private ArrayList<Team>teams;
    private ArrayList<Gruppen> gruppen;
    private ArrayList<Spiel>achtelfinale;
    private ArrayList<Spiel>viertelfinale;
    private ArrayList<Spiel>Halbfinale;
    private Spiel finale;
    private Spiel spielUmPlatzDrei;

    /**
     * Konstruktor für Objekte der Klasse WM
     */
    public WM()
    {
        teams = new ArrayList<Team>();
        gruppen = new ArrayList<Gruppen>();
    }

    public void achtelAuslosen()
    {

    }

    public void probe()
    {
        int x = 32;
        while(x!=0)
        {
            teams.add(new Team());
            x--;
        }
    }

    public void gruppenErstellen()
    {
        int x = teams.size()/4;
        gruppen.add(new Gruppen());
        while(gruppen.size()!=x)
        {
            gruppen.add(new Gruppen()) ; 
        }
    }

    public void gruppenauslosen()
    {
        gruppenErstellen();
        Random ran = new Random();
        int y= 0;

        while(!teams.isEmpty())
        {

            Gruppen gruppe = gruppen.get(y);
            while(gruppe.gibSize()<4)
            {
                int x = ran.nextInt(teams.size());
                gruppe.hinzu(teams.get(x));
                teams.remove(x);
            }
            y++;
        }
    }

}