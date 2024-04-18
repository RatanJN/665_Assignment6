/**
 * Name: Ratan JagathNaik
 * Course: CS-665 Software Design & Patterns
 * Date: 02/07/2024
 * File Name: YellowTea.java
 * Description: This class represents the Yellow Tea variety, extending the base Tea class to 
 * incorporate the specific brewing process and cost calculation for Yellow Tea. It acts as a 
 * concrete strategy within the framework of a beverage preparation system, illustrating the 
 * application of the Strategy Pattern to provide distinct behaviors for brewing different 
 * types of tea. By overriding the brew and calculateCost methods, the YellowTea class specifies
 * the unique preparation steps and pricing for Yellow Tea, highlighting the benefits of design
 *  patterns in creating flexible and modular software solutions. This class is part of a
 * broader beverage machine simulation, demonstrating how design patterns can be employed to 
 * effectively manage the complexity and variability inherent in software design and development.
 */

package edu.bu.met.cs665.tearecipe;

/**
 * Defines the Yellow Tea class, which extends Tea to provide specific brewing instructions 
 * and cost calculations for Yellow Tea.
 */
public class YellowTea extends Tea {
  /**
     * Brews Yellow Tea.
     * This method overrides the generic brew method provided by the Tea superclass, adding
     * the specific steps required for brewing Yellow Tea. It exemplifies how method overriding
     * allows for the customization of general procedures to fit specific needs, a key concept
     * in the application of design patterns for software development.
     */
  @Override
  public void brew() {
    super.brew(); // Invokes the general brewing method from the Tea class
    System.out.println("Brewing Yellow Tea"); // Implements specific brewing steps for Yellow Tea
    // Logic to brew Yellow Tea
  }

  /**
     * Calculates and returns the cost of Yellow Tea.
     * By overriding the calculateCost method, this class specifies the unique pricing 
     * for Yellow Tea within the beverage preparation system, showcasing the system's 
     * flexibility in handling different pricing strategies through a cohesive approach.
     *
     * @return double - the cost of Yellow Tea
     */
  
  @Override
  public double calculateCost() {
    return 2.00; // Example cost for Yellow Tea
  }
}
