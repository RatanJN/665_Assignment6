/**
 * Name: Ratan JagathNaik
 * Course: CS-665 Software Design & Patterns
 * Date: 02/07/2024
 * File Name: BeverageMachine.java
 * Description: The BeverageMachine class encapsulates the functionality of a beverage 
 * preparation system, integrating the Strategy Pattern for beverage and condiment selection.
 * It allows for dynamic configuration of beverage recipes and the addition of condiments,
 * facilitating the preparation of customized drinks. The class demonstrates how design 
 * patterns can enhance flexibility and extensibility in software systems, particularly in 
 * applications requiring dynamic behavior based on user preferences or inputs. By employing
 * strategies for both beverage brewing and condiment addition, it showcases a modular approach 
 * to software design, where changes in the brewing process or pricing strategy can be made 
 * with minimal impact on the overall system architecture. This class is central to the 
 * simulation of a beverage machine, illustrating practical applications of design patterns 
 * in managing complex software development challenges.
 */

package edu.bu.met.cs665.machineandstrategy;

import edu.bu.met.cs665.condiments.CondimentStrategy;
// Necessary imports for handling lists and condiment strategies
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Represents the BeverageMachine, responsible for configuring and operating a beverage
 * preparation system.
 */
public class BeverageMachine {
  //Uses has a relationship in both the strategy below
  private BeverageStrategy beverageStrategy; // Strategy for brewing beverages
  private List<CondimentStrategy> condimentStrategies; // List of strategies for adding condiments
  private Set<CondimentStrategy> usedCondiments; // To track which condiments were actually used
  
  /**
     * Constructor for BeverageMachine, initializes the list of condiment strategies.
     */
  public BeverageMachine() {
    this.condimentStrategies = new ArrayList<>(); // Initialize the list of condiments
    this.usedCondiments = new HashSet<>(); // Initialize the set of used condiments
  }

  /**
     * Sets the strategy for brewing a beverage.
     *
     * @param beverageStrategy The strategy to be used for brewing the beverage.
     */
  public void setBeverageStrategy(BeverageStrategy beverageStrategy) {
    // Reset only the used condiments
    resetCondimentCounts();
    this.beverageStrategy = beverageStrategy; // Assigns the specified brewing strategy
  }

  /**
     * Adds a condiment strategy to the list.
     *
     * @param condimentStrategy The condiment strategy to be added.
     */
  public void addCondimentStrategy(CondimentStrategy condimentStrategy) {
    this.condimentStrategies.add(condimentStrategy); // Adds the specified condiment strategy
  }

  /**
     * Prepares the drink by executing the beverage and condiment strategies.
     * It brews the beverage using the selected strategy and adds any configured condiments.
     * If no beverage strategy is selected, it prompts the user to select one before proceeding.
     */
  public void prepareDrink() {
    if (beverageStrategy == null) {
      System.out.println("Please select a beverage strategy.");
      return;
    }

    beverageStrategy.brew(); // Brew the beverage using the selected strategy

    // Add condiments using the added strategies
    for (CondimentStrategy strategy : condimentStrategies) {
      strategy.addCondiment();
      usedCondiments.add(strategy);
    }
    
  }
  
  private void resetCondimentCounts() {
    for (CondimentStrategy strategy : usedCondiments) {
      strategy.resetCondimentCount(); // Directly call reset on each used condiment
    }
    usedCondiments.clear(); // Clear the set after resetting
  }

  /**
     * Calculates the total cost of the prepared drink, including the base beverage and
     * any added condiments.
     *
     * @return double - The total cost of the drink.
     */
  public double calculateTotalCost() {
    double totalCost = 0.0; // Initialize total cost
    // Add cost of the beverage
    if (beverageStrategy instanceof PricingStrategy) {
      totalCost += ((PricingStrategy) beverageStrategy).calculateCost();
    }
    // Add cost of condiments
    for (CondimentStrategy strategy : condimentStrategies) {
      totalCost += strategy.calculateCost() * strategy.getCondimentCount();
    }
   
    return totalCost; // Return the total cost
  }
}
