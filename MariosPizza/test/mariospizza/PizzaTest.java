/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariospizza;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FrederikDahl
 */
public class PizzaTest {
    
    public PizzaTest() {
    }

    /**
     * Test of getPizzaNummer method, of class Pizza.
     */
    @Test
    public void testGetPizzaNummer() {
        System.out.println("getPizzaNummer");
        Pizza instance = null;
        int expResult = 0;
        int result = instance.getPizzaNummer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPizzaNummer method, of class Pizza.
     */
    @Test
    public void testSetPizzaNummer() {
        System.out.println("setPizzaNummer");
        int pizzaNummer = 0;
        Pizza instance = null;
        instance.setPizzaNummer(pizzaNummer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPizzaNavn method, of class Pizza.
     */
    @Test
    public void testGetPizzaNavn() {
        System.out.println("getPizzaNavn");
        Pizza instance = null;
        String expResult = "";
        String result = instance.getPizzaNavn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPizzaNavn method, of class Pizza.
     */
    @Test
    public void testSetPizzaNavn() {
        System.out.println("setPizzaNavn");
        String pizzaNavn = "";
        Pizza instance = null;
        instance.setPizzaNavn(pizzaNavn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPizzaPris method, of class Pizza.
     */
    @Test
    public void testGetPizzaPris() {
        System.out.println("getPizzaPris");
        Pizza instance = null;
        int expResult = 0;
        int result = instance.getPizzaPris();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPizzaPris method, of class Pizza.
     */
    @Test
    public void testSetPizzaPris() {
        System.out.println("setPizzaPris");
        int pizzaPris = 0;
        Pizza instance = null;
        instance.setPizzaPris(pizzaPris);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Pizza.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Pizza instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
