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
     * mit dieser methode sollst du spiele erstellen jedes team gegen jeden die spiele sollen random ausgelost werden
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

    public int gibAnzahlSpiele()
    {

        return gruppenSpiele.size();
    }

    public void ordne()
    {
        int x = 3;
        ArrayList<Team>tt=new ArrayList<Team>();
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

    public void g()
    {
        for(Team t:mannschaften)
        { 
            System.out.println(t.gibName() +  " punkte:" + gibGesamtPunkte(t));
        }
    }

    public void ergebnisse()
    {
        for(Spiel spiel:gruppenSpiele)
        {
            spiel.ergebniss();   
        }
    }

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

    // public void ordnen()
    // {
    // for(Team team:mannschaften)
    // {
    // if(gibGesamtPunkte(team)<gibGesamtPunkte(mannschaften.get(mannschaften.indexOf(team)+1)))
    // {

    // }

    // }
    // }
}

