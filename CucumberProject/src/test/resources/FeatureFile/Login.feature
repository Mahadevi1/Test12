#Date: 18/5/21
#@TestFeature
Feature: feature to test login functionality

  #LoginSteps
  @Regressiontest @Smoketest
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When enter username and password
    And clicks on login button
    Then user is navigated to home page

  #GoogleSearch
  @Regressiontest
  Scenario: Valididate Google search is working
    Given browser is open
    And user is on google search page
    When user enters a text in search box
    And click on enter
    Then user is navigated to search result

  #LoginTest
  @Smoketest
  Scenario Outline: Valididate Guru99 site login successfully or not
    Given Launch the browser
    When User open <URL>
    And user enter <userID> and <password>
    And click on login button
    And navigated to home page
    Then Print home page title
    And User click on logout
    Then close the browser

    Examples: 
      | URL                                 | userID     | password |
      | http://demo.guru99.com/V1/index.php | mngr327372 | renYtAm  |
