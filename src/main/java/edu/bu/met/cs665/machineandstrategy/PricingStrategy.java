/**
 * Name: Ratan JagathNaik
 * Course: CS-665 Software Design & Patterns
 * Date: 02/07/2024
 * File Name: PricingStrategy.java
 * Description: The PricingStrategy interface defines a crucial component of the beverage 
 * preparation system, establishing a standard method for calculating the cost of a beverage. 
 * This interface is integral to the Strategy Pattern implementation within the system, 
 * allowing for flexible and dynamic pricing strategies for different types of beverages 
 * and condiments. By defining a common calculateCost method, the PricingStrategy interface
 * ensures that all beverage and condiment classes implementing this interface provide their
 * unique cost calculation logic. This design principle promotes decoupling between the 
 * beverage preparation logic and the pricing logic, facilitating easy adjustments and 
 * extensions to pricing strategies without affecting the core beverage brewing functionalities.
 * It exemplifies the application of design patterns to achieve modular, maintainable, and 
 * extensible software architectures, particularly in systems requiring dynamic behavior and 
 * complex interactions.
 */

package edu.bu.met.cs665.machineandstrategy;

/**
 * Interface for defining pricing strategies in the beverage preparation system.
 * This interface requires implementing classes to provide their specific cost calculation logic,
 * enabling dynamic and flexible pricing for beverages and condiments.
 */
public interface PricingStrategy {
  /**
     * Calculates and returns the cost of a beverage or condiment.
     * This method must be implemented by any class representing a beverage or condiment within
     * the system, providing a way to calculate and retrieve the cost associated with that item.
     *
     * @return double - The calculated cost of the beverage or condiment.
     */
  double calculateCost();
}
