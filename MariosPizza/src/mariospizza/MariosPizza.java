
package mariospizza;


public class MariosPizza {
            public static void main(String[] args) {
                Pizza pizza1 = new Pizza(1, "Kebab", 45, 10); 
                Pizza pizza2 = new Pizza(1, "Kebab", 42, 65);
                Pizza pizza3 = new Pizza(1, "Hawai", 45, 18);
                Pizza pizza4 = new Pizza(1, "Kebab", 55, 12);
                MenuKort menukort = new MenuKort(); 
                menukort.addPizza(pizza1);
                menukort.addPizza(pizza2);
                menukort.addPizza(pizza3);
                menukort.addPizza(pizza4);
                menukort.lavMenuKort();
                
                Kunde kunde = new Kunde("Hallur", 41421421); 
                Order order = new Order(kunde); 

                order.addPizzaTilOrdrer(pizza1); 
                order.addPizzaTilOrdrer(pizza2); 
                order.addPizzaTilOrdrer(pizza3); 
                order.addPizzaTilOrdrer(pizza4); 
                order.skrivOrdrer();
                order.sorterListeEfterAfhentning(); 
                System.out.println(order);
                
//                Betaling betaling = new Betaling(order, false); 
//                betaling.lavKvittering();
//                
//               Statistik stat = new Statistik(order); 
//               stat.findMestKøbt(); 
            }
}
  
