/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariospizza;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FrederikDahl
 */
public class OrdreListeTest {
    
    public OrdreListeTest() {
    }

    /**
     * Test of tilføjOrdrer method, of class OrdreListe.
     */
    @Test
    public void testTilføjOrdrer() {
        System.out.println("tilf\u00f8jOrdrer");
        Order order = null;
        OrdreListe instance = new OrdreListe();
        instance.tilføjOrdrer(order);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fjernOrdrer method, of class OrdreListe.
     */
    @Test
    public void testFjernOrdrer() {
        System.out.println("fjernOrdrer");
        Order order = null;
        OrdreListe instance = new OrdreListe();
        instance.fjernOrdrer(order);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderListe method, of class OrdreListe.
     */
    @Test
    public void testGetOrderListe() {
        System.out.println("getOrderListe");
        OrdreListe instance = new OrdreListe();
        ArrayList<Order> expResult = null;
        ArrayList<Order> result = instance.getOrderListe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sorterListeEfterAfhentning method, of class OrdreListe.
     */
    @Test
    public void testSorterListeEfterAfhentning() {
        System.out.println("sorterListeEfterAfhentning");
        OrdreListe instance = new OrdreListe();
        instance.sorterListeEfterAfhentning();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findMestPopulærIAlleOrdre method, of class OrdreListe.
     */
    @Test
    public void testFindMestPopulærIAlleOrdre() {
        System.out.println("findMestPopul\u00e6rIAlleOrdre");
        OrdreListe instance = new OrdreListe();
        Pizza expResult = null;
        Pizza result = instance.findMestPopulærIAlleOrdre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class OrdreListe.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        OrdreListe instance = new OrdreListe();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
