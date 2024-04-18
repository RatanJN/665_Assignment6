/**
 * Name: Ratan JagathNaik
 * Course: CS-665 Software Design & Patterns
 * Date: 02/07/2024
 * File Name: BeverageStrategy.java
 * Description: The BeverageStrategy interface forms a foundational element of the beverage 
 * preparation system's architecture, embodying the Strategy Pattern by defining a uniform 
 * method for brewing beverages. This interface facilitates the implementation of various 
 * brewing strategies for different types of beverages, ensuring that each beverage type 
 * can encapsulate its specific brewing process. By adhering to this interface, beverage 
 * classes guarantee a consistent approach to beverage preparation, allowing the system 
 * to dynamically select and apply different brewing strategies at runtime. This design 
 * enhances the system's flexibility and scalability, enabling the easy addition of new 
 * beverage types without modifying the existing system structure. It highlights the 
 * importance of interfaces in designing extensible systems that can adapt to evolving 
 * requirements through the strategic application of design patterns and principles.
 */

package edu.bu.met.cs665.machineandstrategy;

/**
 * Interface for defining brewing strategies within the beverage preparation system.
 * Classes implementing this interface are required to provide their specific 
 * implementation of the brew method, catering to the unique requirements of brewing 
 * different beverage types.
 */
public interface BeverageStrategy {
  /**
     * Brews the specific type of beverage.
     * This method signature mandates that implementing classes define the exact brewing 
     * process for the beverage they represent, encapsulating the brewing logic within 
     * each specific beverage strategy. This approach allows for a high degree of modularity
     * and flexibility in the beverage preparation system, facilitating the addition of new 
     * beverage types with minimal impact on the system's overall design.
     */
  void brew();
}
