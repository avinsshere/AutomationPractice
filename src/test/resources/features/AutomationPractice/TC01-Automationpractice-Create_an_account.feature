Feature:TC01-AutomationPractice- Create an Account and validate registration

  Scenario: Navigate the user to Create user account page on AutomationPractice Application
    Given Open chrome and start Application
    When User is able to click on sign in button and divert to sign in page
    And User is able to provide email
    And Click on Create an Account button
    Then Navigate to Create an Account Page


  Scenario Outline: Enter details and create new user account
    Given User is on Create an Account Page
    When User is able to click title as Mr
    And User is able to provide firstName as <firstName>
    And User is able to provide lastName as <lastName>
    And User is able to provide passWord as <password>
    And User is able to provide address as <address>
    And User is able to provide city as <city>
    And User is able to provide state as California
    And User is able to provide zip code as <zipCode>
    And User is able to provide mobile number as <mobile>
    And User is able to provide an alias address as <alias>
    And User click on Register button
    Then User is able to sign out
    Examples:
      | firstName | lastName | password     | address           | city       | zipCode | mobile     | alias           |
      | Sam       | Joe      | Password@123 | Pune solapur Road | Calefornia | 123456  | 1234567890 | same as current |