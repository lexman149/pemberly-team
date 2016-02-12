/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pemberleyGame.control;

import byui.cit260.pemberleyGame.model.Inventory;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mbp
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcInventoryWeight method, of class InventoryControl.
     */
    @Test
    public void testCalcInventoryWeight() {
        System.out.println("calcInventoryWeight");
        
        /****************
         * Test Case #1
        *************/
        System.out.println("\tTestCase#1");
        
        //input values for test case 1
        double currentWeight = 15.0;
        double newWeight = 2.0;
        int newItemQuantity = 2;
//        Inventory inventory = inventoryOne;
        
        // create instance of InventoryControl class
        InventoryControl instance = new InventoryControl();
        
        double expResult = 19; // expected output returned value
        
        // call function to run test
        double result = instance.calcInventoryWeight(currentWeight, newWeight, newItemQuantity);
        
        //compare expected return value with the actual value returned
        assertEquals(expResult, result, 0.0);
        
        
        /****************
         * Test Case #2
        *************/
        System.out.println("\tTestCase#2");
        
        //input values for test case 2
        currentWeight = 16.0;
        newWeight = 2.0;
        newItemQuantity = -1;        
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.calcInventoryWeight(currentWeight, newWeight, newItemQuantity);
        
        //compare expected return value with the actual value returned
        assertEquals(expResult, result, 0.0);
        
        /****************
         * Test Case #3
        *************/
        System.out.println("\tTestCase#3");
        
        //input values for test case 3
        currentWeight = 16.0;
        newWeight = 2.0;
        newItemQuantity = 10;        
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.calcInventoryWeight(currentWeight, newWeight, newItemQuantity);
        
        //compare expected return value with the actual value returned
        assertEquals(expResult, result, 0.0);
        
         /****************
         * Test Case #4
        *************/
        System.out.println("\tTestCase#4");
        
        //input values for test case 4
        currentWeight = 16.0;
        newWeight = 8.0;
        newItemQuantity = 2;        
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.calcInventoryWeight(currentWeight, newWeight, newItemQuantity);
        
        //compare expected return value with the actual value returned
        assertEquals(expResult, result, 0.0);   
        
         /****************
         * Test Case #5
        *************/
        System.out.println("\tTestCase#5");
        
        //input values for test case 5
        currentWeight = 20.0;
        newWeight = 2.0;
        newItemQuantity = 0;        
        
        expResult = 20; // expected output returned value
        
        // call function to run test
        result = instance.calcInventoryWeight(currentWeight, newWeight, newItemQuantity);
        
        //compare expected return value with the actual value returned
        assertEquals(expResult, result, 0.0);
        
        /****************
         * Test Case #6
        *************/
        System.out.println("\tTestCase#6");
        
        //input values for test case 6
        currentWeight = 10.0;
        newWeight = 1.0;
        newItemQuantity = 9;        
        
        expResult = 19; // expected output returned value
        
        // call function to run test
        result = instance.calcInventoryWeight(currentWeight, newWeight, newItemQuantity);
        
        //compare expected return value with the actual value returned
        assertEquals(expResult, result, 0.0); 
        
        /****************
         * Test Case #7
        *************/
        System.out.println("\tTestCase#7");
        
        //input values for test case 7
        currentWeight = 0.0;
        newWeight = 20.0;
        newItemQuantity = 1;        
        
        expResult = 20; // expected output returned value
        
        // call function to run test
        result = instance.calcInventoryWeight(currentWeight, newWeight, newItemQuantity);
        
        //compare expected return value with the actual value returned
        assertEquals(expResult, result, 0.0);              
    }
    
}