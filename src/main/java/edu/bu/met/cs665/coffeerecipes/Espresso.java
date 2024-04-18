/**
 * Name: Ratan JagathNaik
 * Course: CS-665 Software Design & Patterns
 * Date: 02/07/2024
 * File Name: Espresso.java
 * Description: This class represents the Espresso coffee variant within the coffee recipe
 * hierarchy, extending the Coffee class to provide a specific implementation for brewing 
 * Espresso and calculating its cost. As a concrete implementation of the Coffee class, 
 * Espresso encapsulates the unique brewing process and pricing strategy for an Espresso 
 * beverage. This class serves as an example of applying the Strategy Pattern to allow for
 * dynamic selection of beverage types and their respective brewing processes and cost 
 * calculations. Through overriding the brew and calculateCost methods, it demonstrates 
 * how software design patterns can be utilized to create flexible and extendable software 
 * systems, particularly within the context of a beverage preparation application. It is 
 * integral to the broader simulation of a beverage machine, showcasing the adaptability 
 * and modular design possible with effective software engineering practices.
 */

package edu.bu.met.cs665.coffeerecipes;

/**
 * Defines the Espresso coffee class, specifying the brewing and pricing behavior for an Espresso.
 */
public class Espresso extends Coffee {
  /**
     * Brews an Espresso coffee.
     * This method overrides the generic brew method in the Coffee superclass, adding specific
     * steps that are necessary for brewing Espresso. It demonstrates how subclassing allows 
     * for customization of brewing procedures in a beverage preparation system.
     */
  @Override
  public void brew() {
    super.brew(); // Calls the general brewing method from Coffee class
    System.out.println("Brewing Espresso"); // Specific brewing instructions for Espresso
    // Logic to brew Espresso
  }

  /**
     * Calculates and returns the cost of an Espresso.
     * This override of the calculateCost method provides the price specific to an Espresso,
     * illustrating how different beverages can implement distinct cost calculations within 
     * a coherent system framework.
     *
     * @return double - the cost of an Espresso
     */
  @Override
  public double calculateCost() {
    return 2.50; // Example cost for Espresso
  }
}
