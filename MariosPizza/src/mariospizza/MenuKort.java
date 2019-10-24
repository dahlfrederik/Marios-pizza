package mariospizza;

import java.util.ArrayList;


public class MenuKort {

    //evt indeholde "pizzaer"
    private ArrayList<Pizza> menukort = new ArrayList<Pizza>();; 
    
    public MenuKort(){
        
    }

    public void addPizza(Pizza pizza) {
        menukort.add(pizza);
    }

    public void removePizza(Pizza pizza) {
        menukort.remove(pizza);
    }
    
    public ArrayList getMenuKort(){
        return menukort; 
    }

    @Override
    public String toString() {
        String totalMenu = "";

        for (Pizza total : menukort) {
            totalMenu += total.getPizzaNummer() + " " + total.getPizzaNavn() + " " + total.getPizzaPris();
        }
        return totalMenu;
    }
    
    
}
