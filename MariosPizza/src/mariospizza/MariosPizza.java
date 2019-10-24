
package mariospizza;


public class MariosPizza {
            public static void main(String[] args) {
                Pizza pizza1 = new Pizza(1, "Margarita", 45, 10); 
                Pizza pizza2 = new Pizza(2, "Hawaii m dres", 52, 30); 
                Pizza pizza3 = new Pizza(3, "Pep med d", 65, 40); 
                MenuKort menukort = new MenuKort(); 
                menukort.addPizza(pizza1);
                menukort.addPizza(pizza2);
                menukort.addPizza(pizza3);
                Order order = new Order(); 
                order.skrivOrdrer(menukort);
                System.out.println(menukort);
            }
}
  
