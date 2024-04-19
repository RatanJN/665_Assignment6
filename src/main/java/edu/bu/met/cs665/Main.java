/**
 * Name: Ratan Jagath Naik
 * Course: CS-665 Software Design & Patterns
 * Date: 02/07/2024
 * File Name: Main.java
 * Description: This class serves as the entry point for the beverage machine application.
 * It demonstrates the usage of the Strategy Pattern in the context of a beverage preparation
 * system, specifically focusing on creating a customizable beverage by selecting a base drink
 * and adding various condiments. It showcases how to set up a beverage machine, choose a
 * beverage, add condiments, prepare the drink, and calculate the total cost. This example is
 * particularly useful for understanding how to apply design patterns in a real-world scenario,
 * providing a practical framework for software development tasks in the course. It emphasizes
 * the importance of JUnit tests for ensuring the reliability and functionality of each component
 * in the software design.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.coffeerecipes.Espresso;
import edu.bu.met.cs665.condiments.Milk;
import edu.bu.met.cs665.condiments.Sugar;
import edu.bu.met.cs665.machineandstrategy.BeverageMachine;

/**
 * Main class for the beverage machine application.
 */
public class Main {

  /**
     * Main method for running beverage preparation examples.
     * Acts as a development tool for testing the functionality of the beverage machine system
     * as the project progresses. It is essential for the iterative development process, allowing
     * for quick verification of code changes. However, it's important to complement these tests
     * with comprehensive JUnit tests to ensure each component functions correctly within the 
     * system.
    */
  public static void main(String[] args) {
    // Initialize the beverage machine
    BeverageMachine machine = new BeverageMachine();

    // Configure the machine with an Espresso beverage strategy
    machine.setBeverageStrategy(new Espresso());

    // Add condiments to the beverage: 4 units of milk and 3 units of sugar
    Milk milkStrategy = Milk.getInstance();
    Sugar sugarStrategy = Sugar.getInstance();

    // Loop to add multiple units of milk
    for (int i = 0; i < 4; i++) {
      machine.addCondimentStrategy(milkStrategy);
    }

    // Loop to add multiple units of sugar
    for (int i = 0; i < 3; i++) {
      machine.addCondimentStrategy(sugarStrategy);
    }

    // Execute the beverage preparation process
    machine.prepareDrink();

    // Output the total cost of the prepared beverage
    System.out.println("Total cost: $" + machine.calculateTotalCost());
  }
}
