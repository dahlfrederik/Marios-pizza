

package mariospizza;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author Frederik, Hallur, Josef og Thor
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
    
    public void skrivOrdrer(MenuKort menukort){
        BufferedWriter bw = null;
        try { 
            File pizzaliste = new File("PizzaListe.txt");
            bw = new BufferedWriter(new FileWriter(pizzaliste)); 
            bw.write("test");
            bw.write(menukort.toString()); 
            
            
        } catch (IOException ex) {
                System.out.println("fuck");
        } finally {
            try {
                bw.close();
            } catch (IOException ex) {
                System.out.println("fuck");
            }
        }
 
    }
    
    @Override
    public String toString(){
        return kunde.toString() + menukort.toString(); 
    }
}
