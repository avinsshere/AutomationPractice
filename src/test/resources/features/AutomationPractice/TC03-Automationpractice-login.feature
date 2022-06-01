Feature:TC03-AutomationPractice- Validate the login functionality with negative data

  Scenario Outline: Validate the Login functionality with negative data
    Given Open chrome and start Application
    When User is able to click on sign in button and divert to sign in page
    And User is able to login as registered details as <email> <pass>
    Then User is able to click on sign in button
    Then User verify the <errorMsg>
    Examples:
      | email                     | pass         | errorMsg                   |
      | avinashr15rider@gmail.com | Password     | Authentication failed.     |
      | avinashr15@gmail.com      | Password@123 | Authentication failed.     |
      | avinashr15@gmail          | Password@123 | Invalid email address.     |
      |                           | Password@123 | An email address required. |
      | avinashr15rider@gmail.com |              | Password is required.      |