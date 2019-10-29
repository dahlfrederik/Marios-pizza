
package mariospizza; 
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * @author Josef, Thor, Hallur og Frederik 
 */
public class BetalingTest {
    
    @Test
    public void TestBetalingsForm(){
        Kunde kunde1 = new Kunde("Hallur", 41421421);
        Order order1 = new Order(kunde1,10); 
        Betaling betaling1 = new Betaling(order1, false);
        Betaling betaling2 = new Betaling(order1, true);
        
        String resultat1 = betaling1.betalingsForm(false);
        String resultat2 = betaling2.betalingsForm(true);
        String forventet1 = "kontant"; 
        String forventet2 = "kort"; 
        
        assertEquals(resultat1,forventet1); 
        assertEquals(resultat2,forventet2);   
    }

}
