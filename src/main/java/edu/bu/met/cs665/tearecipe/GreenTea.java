/**
 * Name: Ratan JagathNaik
 * Course: CS-665 Software Design & Patterns
 * Date: 02/07/2024
 * File Name: GreenTea.java
 * Description: The GreenTea class extends the Tea class, focusing on the specificities
 * of brewing Green Tea and its associated cost. It provides a concrete strategy for the
 * preparation of Green Tea within the context of a beverage preparation system utilizing
 * the Strategy Pattern. By overriding the brew and calculateCost methods, GreenTea delineates
 * the unique steps and pricing involved in making this type of tea. This class exemplifies
 * the application of object-oriented design principles and patterns to encapsulate the 
 * variability in beverage preparation, facilitating easy extension and modification. It
 * contributes to a larger system that simulates a beverage machine, showcasing the practical
 * application of design patterns to manage complexity and enhance the modularity of software 
 * systems.
 */

package edu.bu.met.cs665.tearecipe;

/**
 * Represents a Green Tea beverage, extending the Tea class to provide specific brewing 
 * instructions and cost calculation.
 */
public class GreenTea extends Tea {
  /**
     * Brews Green Tea.
     * Overrides the brew method in the Tea superclass to apply brewing steps unique to
     * Green Tea. This method showcases how subclassing and method overriding can be used
     * to adapt general procedures to specific cases, a fundamental concept in software 
     * design and pattern implementation.
     */
  @Override
  public void brew() {
    super.brew(); // Calls the generic brewing method of Tea class
    System.out.println("Brewing Green Tea"); // Additional brewing steps for Green Tea
    // Logic to brew Green Tea
  }

  /**
     * Calculates and returns the cost of Green Tea.
     * By overriding the calculateCost method, this class provides the cost specific to 
     * Green Tea, demonstrating the adaptability of the system to account for various 
     * product pricing strategies within a unified framework.
     *
     * @return double - the cost of Green Tea
     */
  @Override
  public double calculateCost() {
    return 1.50; // Example cost for Green Tea
  }
}
