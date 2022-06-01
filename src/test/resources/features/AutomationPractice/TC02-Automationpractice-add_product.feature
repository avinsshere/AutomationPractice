Feature:TC02-AutomationPractice- to add product and confirm order

  Scenario Outline: Login to AutomationPractice application
    Given Open chrome and start Application
    When User is able to click on sign in button and divert to sign in page
    And User is able to login as registered details as <email> <pass>
    And User is able to click on sign in button
    Then Navigate to my-account page verify the correct <firstName> and <lastName> is displayed
    Examples:
      | email                     | pass         | firstName | lastName |
      | avinashr15rider@gmail.com | Password@123 | Avinash   | Shere    |


  Scenario Outline: Add Products to Cart and Confirm the Submit Order
    Given user is able to click on Dresses and search for another dress
    When user is able to click on another dress <productName>
    And User is able to select quantity as <quantity> and size as <size>
    And user is able to click on Add to cart
    And User is able to click on proceed to checkout
    And Verify that product details is correct as <productName> <quantity>
    And User choose payment option as pay by bank wire
    Then User confirm the order
    Examples:
      | productName   | quantity | size |
      | Printed Dress | 3        | M    |

  Scenario: Logout from Automation practice Application
    Given User is on main page
    When User is able to sign out
    Then User is on my account page