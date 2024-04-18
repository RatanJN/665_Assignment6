/**
 * Name: Ratan Jagath Naik
 * Course: CS-665 Software Design & Patterns
 * Date: 02/07/2024
 * File Name: Americano.java
 * Description: This class extends the Coffee class to implement the specifics of brewing
 * an Americano coffee, including its brewing process and cost calculation. It serves as 
 * a concrete strategy in the Strategy Pattern, providing a specific algorithm for brewing
 * an Americano. This class demonstrates the application of object-oriented principles and
 * design patterns to model a real-world beverage preparation system, focusing on the 
 * customization and flexibility offered by design patterns in software development. 
 * The brew method is overridden to include steps specific to making an Americano, and
 * the calculateCost method provides the cost calculation unique to this beverage.
 * It is part of a larger system that simulates a beverage machine, offering insights into
 * the practical uses of design patterns in a software project.
 */

package edu.bu.met.cs665.coffeerecipes;

/**
 * Represents an Americano coffee, extending the Coffee class to provide a specific implementation
 * for brewing and costing an Americano beverage.
 */
public class Americano extends Coffee {
  /**
     * Brews an Americano coffee.
     * Overrides the brew method of the Coffee class to include steps specific to brewing 
     * an Americano. It first calls the brew method of the superclass to perform the common 
     * brewing process, and then executes additional steps specific to an Americano.
     */
  @Override
  public void brew() {
    super.brew(); // Call the common brew method of the superclass
    System.out.println("Brewing Americano"); // Additional step specific to Americano
    // Logic to brew Americano
  }

  /**
     * Calculates and returns the cost of an Americano coffee.
     * Overrides the calculateCost method to provide the pricing specific to an Americano.
     *
     * @return double - the cost of an Americano
     */
  @Override
  public double calculateCost() {
    return 2.00; // Example cost for Americano
  }
}
