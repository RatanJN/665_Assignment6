/**
 * Name: Ratan JagathNaik
 * Course: CS-665 Software Design & Patterns
 * Date: 02/07/2024
 * File Name: LatteMacchiato.java
 * Description: The LatteMacchiato class extends the Coffee class, specializing in the preparation
 * and cost calculation of a Latte Macchiato. This class is an example of a concrete strategy within
 * the Strategy Pattern, offering a unique implementation for brewing a specific type of coffee. By
 * overriding the brew and calculateCost methods, LatteMacchiato provides detailed instructions for
 * making a Latte Macchiato and a specific cost calculation for this beverage. This implementation
 * showcases the adaptability and extendability of the beverage preparation system, illustrating how
 * design patterns can facilitate the development of flexible, modular software systems that easily
 * accommodate new requirements or changes. LatteMacchiato contributes to the broader functionality
 * of a simulated beverage machine, emphasizing the practical application of object-oriented design
 * principles and patterns in creating sophisticated, real-world software solutions.
 */

package edu.bu.met.cs665.coffeerecipes;

/**
 * Represents a Latte Macchiato in the coffee recipe hierarchy, extending the Coffee class.
 */
public class LatteMacchiato extends Coffee {
  /**
     * Brews a Latte Macchiato.
     * This method overrides the generic brew method in the superclass, adding specific brewing
     * instructions for a Latte Macchiato. It demonstrates the use of inheritance and method
     * overriding to provide a customized brewing process for different types of coffee beverages.
     */
  @Override
  public void brew() {
    super.brew(); // Invokes the generic brewing behavior from the Coffee class
    System.out.println("Brewing Latte Macchiato"); // Specific brewing instructions
    // Logic to brew Latte Macchiato
  }

  /**
     * Calculates and returns the cost of a Latte Macchiato.
     * Overrides the calculateCost method to specify the pricing for this particular 
     * coffee beverage, highlighting how different beverages can implement distinct 
     * cost calculations within a unified beverage preparation system.
     *
     * @return double - the cost of a Latte Macchiato
     */
  @Override
  public double calculateCost() {
    return 3.00; // Example cost for Latte Macchiato
  }
}
