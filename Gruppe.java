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
    private ArrayList<Team> ergebnisse;


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
    
    
       public void ordne()
    {
        Collections.sort(mannschaften, new Ordnepunkt());   
    } 
    
    
    // public void ordneNachPunkten()
    // {
       // int x = 0;
       // Iterator<Team> it = mannschaften.iterator();
       
       // while(it.hasNext())
       // {
         // Team t = it.next(); 
         // if(t.gibPunkte()<x)
         // {
             // ergebnisse.add(t);
             // x=t.gibPunkte();
             // it.remove();
         // }
            
        // }
    // }    
    
    


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
          System.out.println(t.gibName());
    }
}
}

