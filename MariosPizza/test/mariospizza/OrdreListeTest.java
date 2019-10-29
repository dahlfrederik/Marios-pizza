
package mariospizza;

/**
 * @author Josef, Thor, Hallur og Frederik 
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class OrdreListeTest {

    private final Pizza PIZZA1 = new Pizza(1, "Kebab", 45);
    private final Pizza PIZZA2 = new Pizza(2, "Pepperoni", 45);
    private final Pizza PIZZA3 = new Pizza(3, "Carbona", 42);
    private final Pizza PIZZA4 = new Pizza(4, "Silvia", 55);

    @Test
    public void testSorterListeEfterAfhentning() {
        //Arrange 
        Kunde kunde1 = new Kunde("Hallur", 41421421);
        Order order1 = new Order(kunde1, 10);
        Kunde kunde2 = new Kunde("Josef", 41232134);
        Order order2 = new Order(kunde2, 52);
        Kunde kunde3 = new Kunde("Thor", 1232145);
        Order order3 = new Order(kunde3, 8);
        Kunde kunde4 = new Kunde("Frederik", 30366319);
        Order order4 = new Order(kunde4, 23);
        OrdreListe orderliste = new OrdreListe();
        orderliste.tilføjOrdrer(order1);
        orderliste.tilføjOrdrer(order2);
        orderliste.tilføjOrdrer(order3);
        orderliste.tilføjOrdrer(order4);

        //act 
        orderliste.sorterListeEfterAfhentning();
        String forventet = "Thor";
        String ikkeforventet = "Josef";
        String resultat = kunde3.getNavn();

        //Assert
        //Rigtig resultat 
        assertEquals(forventet, resultat);
        //Forkert resultat 
        assertNotEquals(ikkeforventet, resultat);
    }

    @Test
    public void testFindMestPopulærIAlleOrdre() {
        //Arrange 
        Kunde kunde1 = new Kunde("Thor", 21413319);
        Order order1 = new Order(kunde1, 15);
        order1.addPizzaTilOrdrer(PIZZA1);
        order1.addPizzaTilOrdrer(PIZZA2);
        order1.addPizzaTilOrdrer(PIZZA3);
        order1.addPizzaTilOrdrer(PIZZA4);
        order1.addPizzaTilOrdrer(PIZZA4);
        order1.addPizzaTilOrdrer(PIZZA4);
        Kunde kunde2 = new Kunde("Josef", 41232134);
        Order order2 = new Order(kunde2, 12);
        order2.addPizzaTilOrdrer(PIZZA1);
        order2.addPizzaTilOrdrer(PIZZA2);
        order2.addPizzaTilOrdrer(PIZZA2);
        order2.addPizzaTilOrdrer(PIZZA2);
        order2.addPizzaTilOrdrer(PIZZA3);
        order2.addPizzaTilOrdrer(PIZZA1);
        order2.addPizzaTilOrdrer(PIZZA3);
        OrdreListe ordreliste = new OrdreListe();
        ordreliste.tilføjOrdrer(order1);
        ordreliste.tilføjOrdrer(order2);
        
        //act
        String forventet1 = "Pepperoni";
        String ikkeforventet = "Kebab"; 
        String resultat = ordreliste.findMestPopulærIAlleOrdre().getPizzaNavn();
       
        //assert
        //Rigtig resultat
        assertEquals(resultat, forventet1);
        assertNotEquals(resultat,ikkeforventet); 
        
    }

}
