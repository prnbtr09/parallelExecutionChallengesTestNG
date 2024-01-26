Feature: Login to Sauce Demo

  @ParallelExecution
  Scenario: Validate login functionality with invalid credentials
    Given user has launched url "https://www.saucedemo.com/"
    And user has entered username "standard_user" and password "secret_sauce"
    And User click on Login

  @ParallelExecution
  Scenario: Validate login functionality with invalid credentials
    Given user has launched url "https://www.saucedemo.com/"
    And user has entered username "standard_user" and password "secret_sauce"
    And User click on Login

  @ParallelExecution
  Scenario: Validate login functionality with invalid credentials
    Given user has launched url "https://www.saucedemo.com/"
    And user has entered username "standard_user" and password "secret_sauce"
    And User click on Login




