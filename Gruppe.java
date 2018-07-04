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
        mannschaften.add(new Team("Korea",1));
        mannschaften.add(new Team("Deutschland",4));
        mannschaften.add(new Team("mexico",6));
        mannschaften.add(new Team("schweden",3));
    }

    /**
     * mit dieser methode sollst du spiele erstellen jedes team gegen jeden die spiele sollen random ausgelost werden
     */
    public ArrayList<Spiel> spieleErstellen()
    {

        gruppenSpiele=new ArrayList<Spiel>();
        gruppenSpiele.add(new Spiel(mannschaften.get(1),mannschaften.get(4)));
        gruppenSpiele.add(new Spiel(mannschaften.get(2),mannschaften.get(3)));
        gruppenSpiele.add(new Spiel(mannschaften.get(4),mannschaften.get(2)));
        gruppenSpiele.add(new Spiel(mannschaften.get(3),mannschaften.get(1)));
        gruppenSpiele.add(new Spiel(mannschaften.get(3),mannschaften.get(4)));
        gruppenSpiele.add(new Spiel(mannschaften.get(2),mannschaften.get(1)));
        return gruppenSpiele;
    }
    //hallo

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

    public void g()
    {
        for(Team t:mannschaften)
        { 
            System.out.println(t.gibName() + "punkte:"+ gibGesamtPunkte(t));
        }
    }

    public void spielhinzu(Spiel spiel)
    {
        gruppenSpiele.add(spiel);
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

    public void ordnen()
    {
        for(Team team:mannschaften)
        {
            if(gibGesamtPunkte(team)<gibGesamtPunkte(mannschaften.get(mannschaften.indexOf(team)+1)))
            {

            }

        }
    }
}

