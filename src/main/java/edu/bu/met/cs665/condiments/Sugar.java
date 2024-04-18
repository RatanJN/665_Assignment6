/**
 * Name: Ratan JagathNaik
 * Course: CS-665 Software Design & Patterns
 * Date: 02/07/2024
 * File Name: Sugar.java
 * Description: The Sugar class implements the CondimentStrategy interface, providing a concrete
 * strategy for adding sugar to beverages within the beverage preparation system. It encapsulates
 * the logic for managing the addition of sugar, including tracking the quantity added and enforcing
 * a maximum limit. This class exemplifies how the Strategy Pattern can be employed to modularize
 * and manage the behavior of condiment addition in a flexible and scalable manner. By implementing
 * the CondimentStrategy interface, Sugar allows for dynamic integration into the beverage 
 * preparation process, offering users the ability to customize their beverages with precise control
 * over condiment quantities and costs. This approach enhances the system's usability and 
 * adaptability, showcasing the effectiveness of design patterns in creating extensible and 
 * maintainable software solutions for complex, real-world problems.
 */

package edu.bu.met.cs665.condiments;

/**
 * Sugar condiment class that implements the CondimentStrategy for adding sugar to beverages.
 */
public class Sugar implements CondimentStrategy {
  private int condimentCount; // Tracks the number of sugar units added

  /**
     * Adds a unit of sugar to the beverage, up to a maximum limit.
     * This method overrides the addCondiment method from the CondimentStrategy interface,
     * providing specific logic to increment the sugar count, with a check to ensure the count
     * does not exceed the predefined limit.
     */
  @Override
  public void addCondiment() {
    if (condimentCount < 3) {
      System.out.println("Adding sugar"); // Adds sugar if below limit
      condimentCount++;
    } else {
      System.out.println("Maximum limit of sugar reached.");
    }
  }

  /**
     * Returns the current count of sugar added to the beverage.
     *
     * @return int - The number of sugar units added.
     */
  @Override
  public int getCondimentCount() {
    return condimentCount; // Returns the current sugar count
  }

  /**
     * Calculates and returns the cost associated with the added sugar.
     *
     * @return double - The cost of the sugar added to the beverage.
     */
  @Override
  public double calculateCost() {
    return 0.25; // Fixed cost per unit of sugar
  }
}
