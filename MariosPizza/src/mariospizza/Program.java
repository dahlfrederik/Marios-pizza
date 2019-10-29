package mariospizza;

/**
 * @author Josef, Thor, Hallur og Frederik
 */
public class Program {

    private Pizza pizza1, pizza2, pizza3, pizza4, pizza5, pizza6, pizza7, pizza8, pizza9, pizza10, pizza11, pizza12, pizza13, pizza14, pizza15;
    private Kunde kunde1, kunde2, kunde3; 
    private Order order1, order2, order3; 
    private OrdreListe mariosOverblik; 
    private Betaling betaling1, betaling2, betaling3; 
    
    public Program() {
        start(); 
    }

    public void start() {
        lavPizza();
        lavMenukort(); 
        lavKunder(); 
        lavOrdrer(); 
        lavOdreListe(); 
        lavBetaling(); 
    }

    public void lavPizza() {
        pizza1 = new Pizza(1, "Kebab", 45);
        pizza2 = new Pizza(2, "Pepperoni", 45);
        pizza3 = new Pizza(3, "Carbona", 42);
        pizza4 = new Pizza(4, "Silvia", 55);
        pizza5 = new Pizza(5, "Toronfo", 60);
        pizza6 = new Pizza(6, "Amerikaner", 69);
        pizza7 = new Pizza(7, "Bertil", 55);
        pizza8 = new Pizza(8, "Victoria", 50);
        pizza9 = new Pizza(9, "Mafia", 120);
        pizza10 = new Pizza(10, "Steve Jobs", 125);
        pizza11 = new Pizza(11, "Hval", 99);
        pizza12 = new Pizza(12, "Chili", 45);
        pizza13 = new Pizza(13, "Mario", 75);
        pizza14 = new Pizza(14, "Gollum", 25);
        pizza15 = new Pizza(15, "Potter", 85);
    }

    public void lavMenukort() {
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
    }
    
    public void lavKunder(){
         kunde1 = new Kunde("Hallur", 41421421);
         kunde2 = new Kunde("Frederik", 30366319);
         kunde3 = new Kunde("Thor", 21413319);
    }
    
    public void lavOrdrer(){
        order1 = new Order(kunde1, 10);
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
        order2 = new Order(kunde2, 5);
        order2.addPizzaTilOrdrer(pizza1);
        order2.addPizzaTilOrdrer(pizza1);
        order2.addPizzaTilOrdrer(pizza1);
        order2.addPizzaTilOrdrer(pizza1);
        order2.addPizzaTilOrdrer(pizza1);
        order2.addPizzaTilOrdrer(pizza2);
        order2.addPizzaTilOrdrer(pizza3);
        order2.addPizzaTilOrdrer(pizza4);
        order2.skrivOrdrer();
        order3 = new Order(kunde3, 15);
        order3.addPizzaTilOrdrer(pizza1);
        order3.addPizzaTilOrdrer(pizza2);
        order3.addPizzaTilOrdrer(pizza3);
        order3.addPizzaTilOrdrer(pizza4);
        order3.addPizzaTilOrdrer(pizza4);
        order3.addPizzaTilOrdrer(pizza4);
        order3.skrivOrdrer();
    }
    
    public void lavOdreListe(){
        mariosOverblik = new OrdreListe();
        mariosOverblik.tilføjOrdrer(order1);
        mariosOverblik.tilføjOrdrer(order2);
        mariosOverblik.tilføjOrdrer(order3);
        mariosOverblik.sorterListeEfterAfhentning();
    }
    
    public void lavBetaling(){
         betaling1 = new Betaling(order1, false);
         betaling2 = new Betaling(order2, true);
         betaling3 = new Betaling(order3, true);
         betaling1.lavKvittering();
         betaling2.lavKvittering();
         betaling3.lavKvittering(); 
         
    }
    
}
