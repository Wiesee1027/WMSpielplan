import java.util.Random;
/**
 * Beschreiben Sie hier die Klasse Spiel.
 * 
 * @author (Alex Wiese, Stepahn Strecker) 
 * @version (1.0 - 22.06.2018)
 */
public class Spiel
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Team heim;
    private Team aus;
    private int toreHeim;
    private int toreAus;

    /**
     * Konstruktor für Objekte der Klasse Spiel
     */
    public Spiel(Team heim,Team aus)
    {
        this.heim=heim;
        this.aus=aus;

    }

    public Team gibGewinner(int heimer, int auser)
    {
        if(heimer < auser)
        {
            return  heim;
        }
        return aus;  
    }
    
    public Team gibHeimTeam()
    {
     return heim;   
    }
    public Team gibGastTeam  ()
    {
     return aus;
    }

    public int gibPunkte(Team team)
    {
        if(team.equals(heim))
        {
            if(toreHeim>toreAus)
            {
                return 3;
            }
            if(toreHeim==toreAus)
            {

                return 1;
            }
        }
        if(team.equals(aus))
        {
            if(toreAus>toreHeim)
            {
                return 3;
            }
            if(toreHeim==toreAus)
            {

                return 1;
            }
        }
        return 0;
    }
    public void ergebniss()
    {
        Random ran = new Random();
        
        toreHeim=ran.nextInt(5);
        toreAus=ran.nextInt(5);
        
    }

}
