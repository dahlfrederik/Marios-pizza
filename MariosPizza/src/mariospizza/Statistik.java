

package mariospizza;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author FrederikDahl
 */
public class Statistik {
    //indeholde liste af ordrer og hvad der er mest populært 
    private Order order; 
    
    public Statistik(Order order){
        this.order = order; 
    }
     
    public Pizza findMestKøbt(){
        ArrayList<Pizza> orderliste = order.getOrderListe(); 
        Pizza hyppigst = orderliste.get(0); 
        Pizza tmp = orderliste.get(0); 
        int hyppigtAntal = 0; 
        
        //Loop som gennemløber hele ordrelisten og finder den mest købte pizza udfra navn. 
        //tmp værdi benyttes til at gemme pizzs midlertidigt og så sammenlignes tmp med nuværende indeks i arraylisten. 
        for (int i = 0 ; i < orderliste.size() ; i ++) {
            if(hyppigst.getPizzaNavn().equals(tmp.getPizzaNavn())){
                hyppigtAntal++; 
                tmp = orderliste.get(i); 
            } else {
                tmp = orderliste.get(i); 
            }  
           
        }  
        System.out.println("Den hyppigste pizza er: " + hyppigst + ", den er købt: " + hyppigtAntal + " gange");
        return hyppigst;    
    }
    
    public double findTotalSalg(){
        return order.getTotalPris();      
    }
    
    
}

