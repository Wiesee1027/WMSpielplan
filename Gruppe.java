import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Gruppen.
 * 
 * @author (Alex Wiese, Stepahn Strecker) 
 * @version (1.0 - 22.06.2018)
 */
public class Gruppe
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private ArrayList<Team> mannschaften;
    private String name;
    private ArrayList<Spiel> gruppenSpiele;

    /**
     * Konstruktor für Objekte der Klasse Gruppen
     */
    public Gruppe()
    {
        mannschaften = new ArrayList<Team>(); 
        gruppenSpiele=new ArrayList<Spiel>();
        mannschaften.add(new Team("Korea"));
        mannschaften.add(new Team("Deutschland"));
        mannschaften.add(new Team("mexico"));
        mannschaften.add(new Team("schweden"));
    }

    /**
     * Diese Methode erstellt die spiele nach einen bestimmten schema
     */
    public void spieleErstellen()
    {        
        gruppenSpiele.add(new Spiel(mannschaften.get(0),mannschaften.get(3)));
        gruppenSpiele.add(new Spiel(mannschaften.get(1),mannschaften.get(2)));
        gruppenSpiele.add(new Spiel(mannschaften.get(3),mannschaften.get(1)));
        gruppenSpiele.add(new Spiel(mannschaften.get(2),mannschaften.get(0)));
        gruppenSpiele.add(new Spiel(mannschaften.get(2),mannschaften.get(3)));
        gruppenSpiele.add(new Spiel(mannschaften.get(1),mannschaften.get(0)));
    }

    /**
     * diese Methode wird hier erstmal nicht benötigt da wir die teams schon im Konstruktor hinzufügen
     */
    public void hinzu(Team team)
    {
        mannschaften.add(team);

    }

   
    /**
     * Diese Methode verwendet das interface "OrdnePunkte" und ordnet die Mannschaften nach den punkten welsche durch berechnen der 
     * ergebnisse werden 
     */
    public void ordne()
    {
        int x = 3;
        ArrayList<Team>tt=new ArrayList<Team>();
        ergebnisse();
        for(Team t:mannschaften)
        {
            t.setzepunkte(gibGesamtPunkte(t));
        }
        Collections.sort(mannschaften, new Ordnepunkt());   
        while(tt.size()!=4)
        {
            tt.add(mannschaften.get(x));
            mannschaften.remove(x);
            x--;
        }
        mannschaften=new ArrayList<Team>(tt);
        int punkte =0;
        for(Team team:mannschaften)
        {
            if(team.gibPunkte()==punkte)
            {
                if(zaehleTore(team)>zaehleTore(mannschaften.get (mannschaften.indexOf(team)-1)))
                {
                    int index1 = mannschaften.indexOf(team)-1;
                    int index2 = mannschaften.indexOf(team);
                    mannschaften.remove(team);
                    Team t = mannschaften.get (mannschaften.indexOf(team)-1);
                    mannschaften.add(index1,team);
                    mannschaften.add(index2,t);

                }
                punkte=team.gibPunkte();
            }
            else
            {
                punkte=team.gibPunkte();
            }
        }
    }

    /**
     * diese methode gibt infos wie name und den punktestand auf der konsole aus
     */
    public void gebeInfoAus()
    {
        for(Team t:mannschaften)
        { 
            System.out.println(t.gibName() +  " punkte:" + gibGesamtPunkte(t));
        }
    }

    /**
     * liefert platz eins zurück
     */    
    public Team gibplatzeins()
    {
        return mannschaften.get(0);
    }

    /**
     * liefert platz zwei zurück
     */
    public Team gibtplatz2()
    {
        return mannschaften.get(1);
    }

    public int gibSize()
    {
        return mannschaften.size();   
    }

    /**
     * führt für alle spiele die methode ergebniss aus welsche das ergebniss random aus gibt
     */
    public void ergebnisse()
    {
        for(Spiel spiel:gruppenSpiele)
        {
            spiel.ergebniss();   
        }
    }

    /**
     * Diese Methode berechnet die punkte die in den spielen erzielt wurden
     */
    public int gibGesamtPunkte(Team team)
    {
        int punkte=0;

        for(Spiel spiel:gruppenSpiele)
        {
            if(spiel.gibHeimTeam().equals(team) || spiel.gibGastTeam().equals(team))
            {
                punkte = punkte + spiel.gibPunkte(team);

            }
        }
        return punkte;

    }

    public int gibAnzahlSpiele()
    {

        return gruppenSpiele.size();
    }

    public int zaehleTore(Team team)
    {
        for(Spiel spiel:gruppenSpiele)
        {
            return spiel.tore(team);
        }
        return 0;
    }
}

