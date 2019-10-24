

package mariospizza;

/**
 *
 * @author FrederikDahl
 */
public class Order {
    private Kunde kunde; 
    private MenuKort menukort; 
    
    public double getSamletPris(){
        return -1; 
    }
    
    public String getKundeNavn(){
        return kunde.getNavn(); 
    }
    
    //TODO toString for menukort 
    public String getPizza(){
        return menukort.toString(); 
    }
    
    //TODO: Skal lave txt fil via filewriter og bufferedwriter som bruger toString. 
    public void printOrdrer(){
        
    }
    
    @Override
    public String toString(){
        return kunde.toString() + menukort.toString(); 
    }
}
