

package mariospizza;

import java.util.ArrayList;

/**
 *
 * @author FrederikDahl
 */
public class OrdreListe {
    private ArrayList<Order> ordreliste = new ArrayList<Order>(); 
    private Order order; 
    
    
    public OrdreListe(){
        
    }
    
    //Kan tilføjes til ordrelisten
    public void tilføjOrdrer(Order order) {
        ordreliste.add(order);
    } 
    //Kan fjernes når ordren er leveret 
    public void fjernOrdrer(Order order) {
        ordreliste.remove(order);
    } 
    
      //Denne metode er lavet med udgangspunkt i selection sort, som så er omformatteret til at gælde arraylister i stedet for Arrays. 
    public void sorterListeEfterAfhentning() {
        int n = ordreliste.size(); 
        for(int i = 0; i < n-1; i++){
            int mindste = i; 
            for (int j = i +1; j < n; j++)
                if(ordreliste.get(j).getTidTilAfhentning() < ordreliste.get(mindste).getTidTilAfhentning())
                    mindste = j; 
                    Order temp = ordreliste.get(mindste);
                    Order hentesFørst = ordreliste.get(i);
                    ordreliste.set(mindste,hentesFørst);
                    ordreliste.set(i, temp); 
                    
                    
                           
        }
         
    }
    @Override
    public String toString(){
        String ordreListe = "";
        
        for (Order order1 : ordreliste) {
              ordreListe += order1.toString(); 
        }
      
        
        return ordreListe; 
    }
    
}
