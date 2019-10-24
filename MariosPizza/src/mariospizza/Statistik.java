

package mariospizza;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author FrederikDahl
 */
public class Statistik {
    //indeholde liste af ordrer og hvad der er mest populært 
    private Order order; 
    private int totalSalg, tæller;
    
    //TODO
    //FR som læser filen og gemmer den der kommer flest gange 
    public void læsFraOrdreListe(){
    Scanner scan = null; 
        try { 
            File odreliste = new File("Bestillingsliste.txt"); 
            scan = new Scanner(odreliste); 
            while (scan.hasNext()){
                //Tælle pizza her
                
             
            }
       
        } catch (FileNotFoundException ex) {
            System.out.println("FIL IKKE FUNDET");
        } finally {
            if(scan != null){
                scan.close();
            }
        }
    }
    
    
}

