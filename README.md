# ShaftEngine Parallel Test with ThreadLocal

This repository demonstrates the usage of **ShaftEngine** for automated testing with **TestNG** in a parallel execution setup. The tests utilize the **Page Object Model (POM)** design pattern, and the test execution is parallelized using **ThreadLocal** to ensure thread safety across test methods.

## Project Structure

- **`src/main/java`**:
  - **Page Object Classes**: Contains classes representing the UI elements on the pages (LoginPage, HomePage) and methods to interact with them.
  
- **`src/test/resources/testDataFiles`**:
  - **HTML Files**: Contains the `LoginPage.html` and `HomePage.html` files used for testing. These files are located under the `test/resources/testDataFiles` directory.
  - **Test Data JSON**: A sample `TestData.json` file with the required test data for authentication and verification during the tests.

## Setup and Dependencies

The repository uses **ShaftEngine** for browser automation

### Install Dependencies

Ensure you have the necessary dependencies in your `pom.xml` (for Maven)

For more Information visit the following Repository:

[SHAFT_ENGINE](https://github.com/ShaftHQ/SHAFT_ENGINE)

