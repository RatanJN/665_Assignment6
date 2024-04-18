/**
 * Name: Ratan JagathNaik
 * Course: CS-665 Software Design & Patterns
 * Date: 02/07/2024
 * File Name: Milk.java
 * Description: The Milk class is a concrete implementation of the CondimentStrategy interface,
 * designed to add milk to beverages within a flexible beverage preparation system. It controls
 * the process of milk addition, tracking the amount added and enforcing a cap to ensure
 * appropriate condiment proportions. This class illustrates the application of the Strategy
 * Pattern to condiment management, allowing for dynamic customization of beverages with varying
 * milk volumes. Implementing the CondimentStrategy interface enables the Milk class to seamlessly
 * integrate into the beverage creation process, providing users with the option to personalize
 * their drink orders. This modular design principle underscores the utility of design patterns
 * in developing software systems that are both scalable and maintainable, capable of adapting
 * to evolving user needs and preferences with minimal modifications to the underlying architecture.
 */

package edu.bu.met.cs665.condiments;

/**
 * Implements the CondimentStrategy for adding milk to beverages.
 */
public class Milk implements CondimentStrategy {

  private int condimentCount; // Holds the count of milk units added

  /**
     * Adds a unit of milk to the beverage, respecting a predefined maximum limit.
     * This method provides the logic for incrementing the milk count upon each addition,
     * ensuring that the total does not surpass the established threshold.
     */
  @Override
  public void addCondiment() {
    if (condimentCount < 3) {
      System.out.println("Adding milk"); // Proceeds with addition if under the limit
      condimentCount++;
    } else {
      System.out.println("Maximum limit of milk reached."); // Indicates that the limit has been met
    }
  }

  /**
     * Retrieves the total number of milk units added to the beverage.
     *
     * @return int - The count of milk added.
     */
  @Override
  public int getCondimentCount() {
    return condimentCount; // Returns the milk count
  }

  /**
     * Calculates and returns the cost associated with the milk added to the beverage.
     *
     * @return double - The additional cost incurred by milk addition.
     */
  @Override
  public double calculateCost() {
    return 0.50; // Cost per unit of milk
  }

}
