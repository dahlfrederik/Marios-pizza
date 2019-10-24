

package mariospizza;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


/**
 * TIL MARIO
 * @author Frederik, Hallur, Josef og Thor
 */
public class Order {
    private Kunde kunde; 
    private ArrayList<Pizza> bestillingsliste = new ArrayList<Pizza>();
    
    public Order(Kunde kunde){
        this.kunde = kunde; 
        
    }
    
    public double getTotalPris(){
        double totalPris = 0; 
        for (Pizza pizza : bestillingsliste) {
            totalPris += pizza.getPizzaPris(); 
        }
        return totalPris; 
    }
    
    public void addPizzaTilOrdrer(Pizza pizza) {
        bestillingsliste.add(pizza);
    } 
    
    public void removePizzaTilOrdrer(Pizza pizza) {
        bestillingsliste.remove(pizza);
    }
    
    public void skrivOrdrer(){
        BufferedWriter bw = null;
        try { 
            File pizzaliste = new File("Bestillingsliste.txt");
            bw = new BufferedWriter(new FileWriter(pizzaliste, true)); 
            bw.write(toString()); 
            bw.newLine(); 
            
        } catch (IOException ex) {
                System.out.println("FIL IKKE FUNDET");
        } finally {
            try {
                bw.close();
            } catch (IOException ex) {
                System.out.println("BUFFEREDWRITER IKKE LUKKET");
            }
        }
    }
    
    @Override
    public String toString(){
        String totalMenu = "";
        totalMenu += "KVITTERING" + "\n"; 
        totalMenu += "*****************" + "\n"; 
        totalMenu += "Kundens navn: " + kunde.getNavn() + "\n";
        totalMenu += "Kundens nummer: " + kunde.getNummer() + "\n"; 
        
        
        for (Pizza total : bestillingsliste) {
            totalMenu += " Pizza: " + total.getPizzaNavn() + ", pizzaens pris " + total.getPizzaPris() +  ", Afhentes om: " + total.getTidTilAfhentning() + " min" + "\n";  
        }
        
        totalMenu += "\n Samlet pris: " + getTotalPris() + " kr" + "\n"; 
        return totalMenu;
    }
}
