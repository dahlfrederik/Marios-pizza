package mariospizza;

public class MariosPizza {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(1, "Kebab", 45);
        Pizza pizza2 = new Pizza(1, "Kebab", 45);
        Pizza pizza3 = new Pizza(1, "Hawai", 42);
        Pizza pizza4 = new Pizza(1, "Kebab", 55);
        MenuKort menukort = new MenuKort();
        menukort.addPizza(pizza1);
        menukort.addPizza(pizza2);
        menukort.addPizza(pizza3);
        menukort.addPizza(pizza4);
        menukort.lavMenuKort();

        Kunde kunde = new Kunde("Hallur", 41421421);
        Order order1 = new Order(kunde, 10);

        order1.addPizzaTilOrdrer(pizza1);
        order1.addPizzaTilOrdrer(pizza2);
        order1.addPizzaTilOrdrer(pizza3);
        order1.addPizzaTilOrdrer(pizza4);
        order1.skrivOrdrer();

        Kunde kunde2 = new Kunde("Frederik", 30366319);
        Order order2 = new Order(kunde2, 5);
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

        OrdreListe mariosOverblik = new OrdreListe();
        mariosOverblik.tilføjOrdrer(order1);
        mariosOverblik.tilføjOrdrer(order2);
        mariosOverblik.tilføjOrdrer(order3);
        mariosOverblik.sorterListeEfterAfhentning();

        System.out.println(mariosOverblik);

        Betaling betaling = new Betaling(order1, false);
        betaling.lavKvittering();

        Statistik stat = new Statistik(order1);
        stat.findMestKøbt();
    }
}
