/**
 * Name: Ratan JagathNaik
 * Course: CS-665 Software Design & Patterns
 * Date: 02/07/2024
 * File Name: Coffee.java
 * Description: The Coffee class serves as an abstract foundation for various coffee-based 
 * beverages within the beverage preparation system, implementing both the BeverageStrategy
 * and PricingStrategy interfaces. This dual implementation underscores the class's role in
 * standardizing the brewing process for coffee while also establishing a framework for the
 * cost calculation of coffee beverages. By providing a generic brewing method, the Coffee 
 * class allows for a consistent preparation approach across different coffee variants, with
 * flexibility for subclass-specific brewing details. The requirement for subclasses to 
 * implement their own cost calculation method fosters a modular and scalable system design. 
 * This abstract class exemplifies the use of design patterns to create adaptable and 
 * maintainable software architectures, facilitating the easy introduction of new coffee
 * types and pricing strategies within the broader context of a dynamic beverage preparation
 * system.
 */

package edu.bu.met.cs665.coffeerecipes;

import edu.bu.met.cs665.machineandstrategy.BeverageStrategy;
import edu.bu.met.cs665.machineandstrategy.PricingStrategy;

/**
 * Abstract class Coffee, providing a template for coffee beverage preparation.
 * Implements BeverageStrategy for brewing and PricingStrategy for cost calculation,
 * setting the stage for concrete coffee variants to detail specific brewing processes and pricing.
 */
public abstract class Coffee implements BeverageStrategy, PricingStrategy {
  /**
     * Generic method to brew coffee, to be utilized or overridden by subclasses.
     * This implementation offers a basic brewing instruction applicable to all coffee types,
     * ensuring a unified approach to coffee preparation across the system.
     */
  @Override
  public void brew() {
    System.out.println("Brewing coffee"); // Basic brewing behavior for coffee
  }
  // Note: The calculateCost method from the PricingStrategy interface must be implemented.
}
