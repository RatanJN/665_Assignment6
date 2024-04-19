
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Ratan Jagath Naik          |
| Date         | 04/19/2024                 |
| Course       | Spring 2024                |
| Assignment # | 6                          |

# Assignment Overview

Developed a software application for a fully automated beverage vending machine. The software manages brewing processes for various coffee and tea beverages (Espresso, Americano, Latte Macchiato, Black Tea, Green Tea, Yellow Tea). Users can add milk and sugar, selecting 0 to 3 units each, with a maximum limit of 3 units per condiment. Implementation includes unit tests for functionality, and optionally calculates final beverage prices based on preset base prices ($2 for coffee, $0.50 per condiment).

# GitHub Repository Link:
https://github.com/RatanJN/665_Assignment6.git

# Implementation Description 


For each assignment, please answer the following:

- Explain the level of flexibility in your implementation, including how new object types can
be easily added or removed in the future.


The implementation showcases significant flexibility through the use of the Strategy and Singleton design patterns, alongside interfaces (BeverageStrategy, CondimentStrategy, and PricingStrategy). This structure allows for easy addition or removal of new beverage types or condiments without altering the core logic of the BeverageMachine class. For instance, introducing a new beverage like Cappuccino or a new condiment such as CinnamonStrategy can be accomplished by simply creating new classes that implement the respective interfaces. This modular approach ensures that extending the system's capabilities can be done with minimal impact on existing functionality. 

- Discuss the simplicity and understandability of your implementation, ensuring that it is
easy for others to read and maintain.


The system's architecture is designed for clarity and ease of maintenance. Each class and interface has a well-defined role, adhering to the principle of single responsibility. For example, beverage preparation is managed by BeverageStrategy, pricing by PricingStrategy, and condiment management by CondimentStrategy. Such clear separation of concerns enhances the understandability of the code, making it straightforward for new developers or contributors to quickly become acquainted with the system's operations. The use of descriptive naming conventions for classes and methods further aids in understanding the intended functionality of each component.

- Describe how you have avoided duplicated code and why it is important.


In this implementation, code duplication is minimized through strategic use of interfaces and abstract classes. The CondimentStrategy interface standardizes the method through which condiments are handled, thereby eliminating the need for repetitive code for each type of condiment. The Singleton pattern employed for Milk and Sugar ensures that there is a single instance of each condiment, with shared behavior defined once and reused across the application. This approach not only promotes code reuse but also ensures consistency and maintainability, as changes to shared behavior need to be implemented just once.

- If applicable, mention any design patterns you have used and explain why they were
chosen.


The Strategy Pattern plays a crucial role in this project, enabling the dynamic selection of algorithms at runtime. The BeverageStrategy and CondimentStrategy interfaces allow different beverages and condiments to be treated as interchangeable algorithms. The BeverageMachine acts as the context, seamlessly switching between these strategies based on runtime decisions. Additionally, the Singleton Pattern is utilized for condiment classes like Milk and Sugar, ensuring a single, globally accessible instance of each, which is essential for managing state effectively across multiple drink preparations. These patterns were chosen to enhance flexibility, reduce duplication, and maintain consistent state management, critical aspects for a scalable and robust beverage preparation system.

These revised answers reflect the advanced structure and thoughtful design patterns implemented in your project, emphasizing the enhanced flexibility, simplicity, and strategic use of design patterns to optimize code efficiency and maintainability.


# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




