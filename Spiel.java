
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
    
    /**
     * Konstruktor für Objekte der Klasse Spiel
     */
    public Spiel()
    {
        
    }

   public Team gibGewinner(int heimer, int auser)
   {
       if(heimer<auser)
       {
         return  heim;
        }
       
     return aus;  
    }
}
