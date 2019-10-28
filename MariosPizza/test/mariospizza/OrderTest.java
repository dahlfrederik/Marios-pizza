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
import org.junit.Before;

/**
 *
 * @author FrederikDahl
 */
public class OrderTest {
    
    @Test
    public void testSkrivOrdreTest() throws FileNotFoundException{
        //arrange 
        Kunde kunde1 = new Kunde("Hallur", 41421421);
        Order order1 = new Order(kunde1,10); 
        Pizza pizza1 = new Pizza(1, "Kebab", 45);
        Pizza pizza2 = new Pizza(2, "Pepperoni", 45);
        Pizza pizza3 = new Pizza(3, "Carbona", 42);
        order1.addPizzaTilOrdrer(pizza1);
        order1.addPizzaTilOrdrer(pizza2);
        order1.addPizzaTilOrdrer(pizza3);
        
        //Act
        order1.skrivOrdrer();
        //Tester på en fil skrevet til test formål 
        File file = new File("Test.txt");

        Scanner scan = new Scanner(file);

        String næste;
        int tæller = 0; 
        //Der er 8 linjer i toString metoden. 
        int forventetAntalLinjer = 11;

        while (scan.hasNextLine()) {
            næste = scan.nextLine();
            tæller++; 
        }
        scan.close();
        //Assert
        assertEquals(forventetAntalLinjer, tæller);
    }
    
    public void testGetTotalPris(){
        //arrange 
        Pizza pizza1 = new Pizza(1, "Kebab", 45);
        Pizza pizza2 = new Pizza(2, "Pepperoni", 45);
        Kunde kunde1 = new Kunde("Hallur", 41421421);
        Order order1 = new Order(kunde1,10); 
        order1.addPizzaTilOrdrer(pizza1);
        order1.addPizzaTilOrdrer(pizza2); 
        //act 
        double resultat = order1.getTotalPris();
        int forventetTotal = 90; 
        //assert
        assertEquals(resultat, forventetTotal,0.01); 
    }
    
    @Test
    public void testFindMestPopulær(){
        //Arrange 
        Pizza pizza1 = new Pizza(1, "Kebab", 45);
        Pizza pizza2 = new Pizza(2, "Pepperoni", 45);
        Pizza pizza3 = new Pizza(3, "Carbona", 42);
        Pizza pizza4 = new Pizza(4, "Silvia", 55);
        Kunde kunde3 = new Kunde("Thor", 21413319);
        Order order3 = new Order(kunde3, 15);
        order3.addPizzaTilOrdrer(pizza1);
        order3.addPizzaTilOrdrer(pizza2);
        order3.addPizzaTilOrdrer(pizza3);
        order3.addPizzaTilOrdrer(pizza4);
        order3.addPizzaTilOrdrer(pizza4);
        order3.addPizzaTilOrdrer(pizza4);
        
        //act
        String forventet1 = "Silvia"; 
        String resultat = order3.findMestPopulær().getPizzaNavn(); 
        String forventet2 = "Carbona"; 
        
        //assert
        //Rigtig resultat
        assertEquals(resultat,forventet1); 
        //Forkert resultat 
        assertNotEquals(resultat,forventet2); 
        
        
    }
    
}
    
    
    

