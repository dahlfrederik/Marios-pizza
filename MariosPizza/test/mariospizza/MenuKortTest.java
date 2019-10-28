/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariospizza;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FrederikDahl
 */
public class MenuKortTest {
    private MenuKort menukort; 
    
    public MenuKortTest() {
    }
    
    @Test
    public void testLavMenuKort() throws FileNotFoundException{
        //arrange 
        Pizza pizza1 = new Pizza(1, "Kebab", 45);
        Pizza pizza2 = new Pizza(2, "Pepperoni", 45);
        Pizza pizza3 = new Pizza(3, "Carbona", 42);
        MenuKort menukort = new MenuKort();
        menukort.addPizza(pizza1);
        menukort.addPizza(pizza2);
        menukort.addPizza(pizza3);
        
        //Act
        menukort.lavMenuKort();
        
        File file = new File("Menukort.txt");

        Scanner scan = new Scanner(file);

        String næste;
        int tæller = 0; 
        //Der er 9 linjer i toString metoden. 
        int forventetAntalLinjer = 12;

        while (scan.hasNextLine()) {
            næste = scan.nextLine();
            tæller++; 
        }
        scan.close();
        
        //Assert
        assertEquals(forventetAntalLinjer, tæller);
    }
    
}
