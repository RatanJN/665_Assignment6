/**
 * Name: Ratan Jagath Naik
 * Course: CS-665 Software Design & Patterns
 * Date: 02/07/2024
 * File Name: CondimentStrategy.java
 * Description: The CondimentStrategy interface extends the PricingStrategy interface to 
 * define a strategy for adding condiments to beverages in the beverage preparation system.
 * It specifies the methods that any concrete condiment strategy must implement, including 
 * adding a condiment to a beverage and retrieving the count of a specific condiment added.
 * This interface is a key component of the Strategy Pattern implementation within the system,
 * allowing for dynamic customization of beverages with various condiments. By extending the 
 * PricingStrategy interface, it ensures that any condiment strategy also provides a method 
 * for calculating the additional cost associated with the condiment, thereby integrating 
 * condiment addition with cost calculation. This design facilitates a modular and flexible 
 * approach to extending the beverage machine's functionality, showcasing the application of 
 * design patterns to achieve a scalable and maintainable software architecture.
 */

package edu.bu.met.cs665.condiments;

import edu.bu.met.cs665.machineandstrategy.PricingStrategy;

/**
 * Defines the strategy for adding condiments to beverages within the beverage preparation system.
 * Extends the PricingStrategy interface to include cost calculation for condiments.
 */
public interface CondimentStrategy extends PricingStrategy {
  /**
     * Adds a condiment to a beverage. Implementations should define how the condiment is added,
     * including any limitations or conditions for adding condiments.
     */
  void addCondiment();

  /**
     * Retrieves the count of the specific condiment added to a beverage. Implementations should
     * return the current count of the condiment, allowing for accurate cost calculation and
     * customization feedback.
     *
     * @return int - The count of the condiment added.
     */
  int getCondimentCount();
}
