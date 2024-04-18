/**
 * Name: Ratan JagathNaik
 * Course: CS-665 Software Design & Patterns
 * Date: 02/07/2024
 * File Name: BeverageMachineTest.java
 * Description: This class conducts JUnit testing for the BeverageMachine, employing the Given-When-Then format
 * to clearly define test scenarios. Each test method is annotated with detailed comments explaining the setup
 * conditions (Given), the actions taken (When), and the expected outcomes (Then). This structured approach
 * ensures comprehensive validation of the beverage machine's functionality, including beverage brewing,
 * condiment addition, cost calculation, and adherence to operational constraints. The method definition comments
 * provide additional insight into the purpose and functionality being tested, facilitating easier understanding
 * and maintenance of the test suite. The BeverageMachineTest class is crucial for ensuring the reliability and
 * correctness of the beverage preparation system, highlighting the value of automated testing in software development.
 */

package edu.bu.met.cs665;

// These are the import statements required for JUnit testing and accessing the classes to be tested.
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import edu.bu.met.cs665.coffeerecipes.*;
import edu.bu.met.cs665.condiments.*;
import edu.bu.met.cs665.machineandstrategy.BeverageMachine;
import edu.bu.met.cs665.tearecipe.*;

/**
 * Tests the functionality of the BeverageMachine class, focusing on its ability to brew beverages,
 * add condiments, calculate costs, and enforce condiment limits. This suite of tests aims to cover
 * a broad spectrum of scenarios to ensure the machine operates correctly under various conditions.
 */
public class BeverageMachineTest {
	private BeverageMachine machine;

	/**
     * Sets up the test environment before each test. This method initializes the BeverageMachine instance.
     */
    @Before
    public void setUp() {
        machine = new BeverageMachine();
    }

    /**
     * Test to verify the correct calculation of the cost for an Espresso without any condiments.
     * Given: A new Espresso selection with no added condiments.
     * When: The total cost is calculated.
     * Then: The cost should exactly match the Espresso's base cost.
     */
    @Test
    public void testEspressoCost() {
        machine.setBeverageStrategy(new Espresso());
        assertEquals(2.50, machine.calculateTotalCost(), 0.0);
    }

    /**
     * Test to verify the correct calculation of the cost for a Latte Macchiato with one unit of milk added.
     * Given: A Latte Macchiato with one unit of milk added.
     * When: The total cost is calculated.
     * Then: The cost should include the price of the Latte Macchiato plus one unit of milk.
     */
    @Test
    public void testLatteMacchiatoWithMilkCost() {
        machine.setBeverageStrategy(new LatteMacchiato());
        Milk milk = new Milk();
        machine.addCondimentStrategy(milk);
        assertEquals(3.00, machine.calculateTotalCost(), 0.0);
    }

    /**
     * Test to verify the total cost calculation of a Green Tea with two units of sugar.
     * Given: A Green Tea with two units of sugar added.
     * When: The total cost is calculated.
     * Then: The cost should account for the Green Tea plus two sugar additions.
     */
    @Test
    public void testGreenTeaWithSugarCost() {
        machine.setBeverageStrategy(new GreenTea());
        Sugar sugar = new Sugar();
        // Adding sugar twice
        for(int i=0;i<2;i++) {
        	machine.addCondimentStrategy(sugar); 
        }
        assertEquals(1.5, machine.calculateTotalCost(), 0.01);
    }

    /**
     * Test to verify that the system enforces the maximum limit for milk addition.
     * Given: Attempting to add more than the maximum allowed milk units.
     * When: The condiment count is retrieved.
     * Then: The count should not exceed the maximum limit of 3.
     */
    @Test
    public void testMaximumMilkAddition() {
        Milk milk = new Milk();
        for (int i = 0; i < 5; i++) { // Exceeding the limit intentionally
            milk.addCondiment();
        }
        assertEquals(3, milk.getCondimentCount());
    }

    /**
     * Test to ensure that attempting to brew a beverage without setting a beverage strategy does not cause an error.
     * Given: No beverage strategy is set in the BeverageMachine.
     * When: Attempting to prepare a drink without selecting a beverage.
     * Then: No cost should be calculated, and no exception should be thrown.
     */
    @Test
    public void testBrewingWithoutBeverageStrategy() {
        // No beverage strategy is set
        machine.prepareDrink(); // This should not throw an error but prompt for beverage selection
        assertEquals(0.0, machine.calculateTotalCost(), 0.0);
    }
}
