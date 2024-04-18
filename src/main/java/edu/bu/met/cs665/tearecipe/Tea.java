/**
 * Name: Ratan JagathNaik
 * Course: CS-665 Software Design & Patterns
 * Date: 02/07/2024
 * File Name: Tea.java
 * Description: The Tea class serves as an abstract base for different tea varieties within
 * the beverage preparation system, implementing both BeverageStrategy and PricingStrategy 
 * interfaces. This design allows the Tea class to provide a common framework for the brewing
 * process of tea, while also requiring concrete subclasses to define their specific cost 
 * calculation methods. By implementing these interfaces, Tea encapsulates the core 
 * functionalities required for any tea beverage within the system, promoting code reusability 
 * and flexibility. This approach exemplifies the Strategy Pattern's application in creating
 * modular software systems that can easily adapt to new requirements or changes. The Tea 
 * class underscores the importance of abstract classes in object-oriented design and patterns, 
 * facilitating the extension of the system to accommodate a wide variety of tea types without
 * duplicating the common logic.
 */

package edu.bu.met.cs665.tearecipe;

import edu.bu.met.cs665.machineandstrategy.BeverageStrategy;
import edu.bu.met.cs665.machineandstrategy.PricingStrategy;

/**
 * Abstract class representing the general category of tea beverages.
 * Implements BeverageStrategy and PricingStrategy to provide a common brewing method
 * and enforce the implementation of cost calculation in subclasses.
 */
public abstract class Tea implements BeverageStrategy, PricingStrategy {
  /**
     * Generic brewing method for tea.
     * This overridden method from the BeverageStrategy interface provides a basic brewing
     * procedure for tea, applicable to all tea types. It demonstrates the use of abstraction
     * in defining general behaviors that can be inherited and possibly overridden by subclasses
     * for specific types of tea.
     */
  @Override
  public void brew() {
    System.out.println("Brewing tea"); // Basic brewing instruction for tea
  }
  // Note: PricingStrategy's calculateCost method must be implemented by concrete subclasses.
}
