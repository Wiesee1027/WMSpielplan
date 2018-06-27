import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Ordnepunkt.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Ordnepunkt implements Comparator<Team>
{
public  Ordnepunkt()
{
    
}

    public int compare(Team t1,Team t2){
        return t1.gibPunkte()-(t2.gibPunkte());
    }


}
