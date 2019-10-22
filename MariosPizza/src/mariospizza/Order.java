

package mariospizza;

/**
 *
 * @author FrederikDahl
 */
public class Order {
    private Kunde kunde; 
    
    public double getTotalSum(){
        return -1; 
    }
    
    public String hvemHarBestilt(){
        return kunde.getNavn(); 
    }
}
