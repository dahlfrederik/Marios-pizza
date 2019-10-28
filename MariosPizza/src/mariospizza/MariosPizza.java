package mariospizza;

public class MariosPizza {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(1, "Kebab", 45);
        Pizza pizza2 = new Pizza(2, "Pepperoni", 45);
        Pizza pizza3 = new Pizza(3, "Carbona", 42);
        Pizza pizza4 = new Pizza(4, "Silvia", 55);
        Pizza pizza5 = new Pizza(5, "Toronfo", 60);
        Pizza pizza6= new Pizza(6, "Amerikaner", 69);
        Pizza pizza7= new Pizza(7, "Bertil", 55);
        Pizza pizza8= new Pizza(8, "Victoria", 50);
        Pizza pizza9 = new Pizza(9, "Mafia", 120);
        Pizza pizza10= new Pizza(10, "Steve Jobs", 125);
        Pizza pizza11= new Pizza(11, "Hval", 99);
        Pizza pizza12= new Pizza(12, "Chili", 45);
        Pizza pizza13= new Pizza(13, "Mario", 75);
        Pizza pizza14= new Pizza(14, "Gollum", 25);
        Pizza pizza15= new Pizza(15, "Potter", 85);
        
        
        MenuKort menukort = new MenuKort();
        menukort.addPizza(pizza1);
        menukort.addPizza(pizza2);
        menukort.addPizza(pizza3);
        menukort.addPizza(pizza4);
        menukort.addPizza(pizza5);
        menukort.addPizza(pizza6);
        menukort.addPizza(pizza7);
        menukort.addPizza(pizza8);
        menukort.addPizza(pizza9);
        menukort.addPizza(pizza10);
        menukort.addPizza(pizza11);
        menukort.addPizza(pizza12);
        menukort.addPizza(pizza13);
        menukort.addPizza(pizza14);
        menukort.addPizza(pizza15);
        menukort.lavMenuKort();

        Kunde kunde = new Kunde("Hallur", 41421421);
        Order order1 = new Order(kunde, 10);

        order1.addPizzaTilOrdrer(pizza1);
        order1.addPizzaTilOrdrer(pizza2);
        order1.addPizzaTilOrdrer(pizza3);
        order1.addPizzaTilOrdrer(pizza1);
        order1.addPizzaTilOrdrer(pizza2);
        order1.addPizzaTilOrdrer(pizza2);
        order1.addPizzaTilOrdrer(pizza4);
        order1.addPizzaTilOrdrer(pizza2);
        order1.addPizzaTilOrdrer(pizza1);
        order1.addPizzaTilOrdrer(pizza2);
        order1.addPizzaTilOrdrer(pizza4);
        order1.addPizzaTilOrdrer(pizza2);
        order1.addPizzaTilOrdrer(pizza4);
        order1.addPizzaTilOrdrer(pizza2);
        order1.addPizzaTilOrdrer(pizza2);
        order1.addPizzaTilOrdrer(pizza2);
        order1.addPizzaTilOrdrer(pizza2);
        order1.addPizzaTilOrdrer(pizza4);
        order1.addPizzaTilOrdrer(pizza2);
        order1.addPizzaTilOrdrer(pizza4);
        order1.addPizzaTilOrdrer(pizza2);
        order1.addPizzaTilOrdrer(pizza4);
            
        order1.skrivOrdrer();

        Kunde kunde2 = new Kunde("Frederik", 30366319);
        Order order2 = new Order(kunde2, 5);
        order2.addPizzaTilOrdrer(pizza1);
        order2.addPizzaTilOrdrer(pizza1);
        order2.addPizzaTilOrdrer(pizza1);
        order2.addPizzaTilOrdrer(pizza1);
        order2.addPizzaTilOrdrer(pizza1);
        order2.addPizzaTilOrdrer(pizza2);
        order2.addPizzaTilOrdrer(pizza3);
        order2.addPizzaTilOrdrer(pizza4);

        Kunde kunde3 = new Kunde("Thor", 21413319);
        Order order3 = new Order(kunde3, 15);
        order3.addPizzaTilOrdrer(pizza1);
        order3.addPizzaTilOrdrer(pizza2);
        order3.addPizzaTilOrdrer(pizza3);
        order3.addPizzaTilOrdrer(pizza4);
        order3.addPizzaTilOrdrer(pizza4);
        order3.addPizzaTilOrdrer(pizza4);

        OrdreListe mariosOverblik = new OrdreListe();
        mariosOverblik.tilføjOrdrer(order1);
        mariosOverblik.tilføjOrdrer(order2);
        mariosOverblik.tilføjOrdrer(order3);
        mariosOverblik.sorterListeEfterAfhentning();

        System.out.println(mariosOverblik);

        Betaling betaling = new Betaling(order1, false);
        
        Pizza pop = order1.findMestPopulær();
        System.out.println(pop);

//        Pizza populær = mariosOverblik.findMestPopulærIAlleOrdre();
//        System.out.println(populær);
    }

}
