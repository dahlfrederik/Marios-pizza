package mariospizza;

import java.util.ArrayList;


public class MenuKort {

    //evt indeholde "pizzaer"
    private ArrayList<Pizza> menukort = new ArrayList<Pizza>();

    public void addPizza(Pizza pizza) {
        menukort.add(pizza);
    }

    public void removePizza(Pizza pizza) {
        menukort.remove(pizza);
    }

    @Override
    public String toString() {
        String totalMenu = "";

        for (Pizza total : menukort) {
            totalMenu = +total.getPizzaNummer() + " " + total.getPizzaNavn() + " " + total.getPizzaPris();
        }
        return totalMenu;
    }
}
