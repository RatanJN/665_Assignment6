/**
 * Name: Ratan Jagath Naik
 * Course: CS-665 Software Design & Patterns
 * Date: 02/07/2024
 * File Name: BlackTea.java
 * Description: This class extends the Tea class to specifically cater to the preparation
 * and cost calculation of Black Tea. It embodies a concrete strategy within the Strategy
 * Pattern framework, illustrating a tailored approach to brewing Black Tea. By overriding
 * the brew and calculateCost methods, it specifies the unique brewing process and cost 
 * associated with Black Tea. This class exemplifies how design patterns can facilitate 
 * the modular and flexible design of a beverage preparation system, emphasizing the 
 * customization capabilities crucial for software development in the context of real-world
 * applications. It contributes to a broader system simulating a beverage machine, showcasing
 * practical design pattern usage for dynamic behavior and cost management in software projects.
 */

package edu.bu.met.cs665.tearecipe;

/**
 * Represents a Black Tea beverage, extending the Tea class to provide a specific brewing
 * and costing implementation.
 */
public class BlackTea extends Tea {
  /**
     * Brews Black Tea.
     * This method overrides the Tea class's brew method, incorporating specific steps
     * necessary for brewing Black Tea. It calls the superclass's brew method for general
     * brewing actions, then adds additional instructions particular to Black Tea preparation.
     */
  @Override
  public void brew() {
    super.brew(); // Invoke the general brew method of the superclass
    System.out.println("Brewing Black Tea"); // Additional instructions for Black Tea
    // Logic to brew Black Tea
  }

  /**
     * Calculates and returns the cost of Black Tea.
     * Overrides the calculateCost method to specify the cost associated with preparing 
     * Black Tea, reflecting its unique pricing within the beverage preparation system.
     *
     * @return double - the cost of Black Tea
     */
  @Override
  public double calculateCost() {
    return 1.75; // Example cost for Black Tea
  }
}
