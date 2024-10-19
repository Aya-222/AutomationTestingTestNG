Feature: Wishlist Function
  Scenario: Validate that Guest user can’t add any product to Wishlist
    Given open URL magento Chrome Browser
    And Scroll down to Hot Sellers last Section
    When user Hover on Radiant Tee card
    And user click on Add to Wishlist button Radiant Tee
    And user can wait six seconds
    Then User should be navigated to login page
    And user exits from browser


  Scenario: Validate That Logged in user can add any product to Wishlist
    Given open URL magento Chrome Browser
    And user clicks sign button home page
    And user input valid Email
    And user input valid password
    And user clicks on sign in button
    And user can wait six seconds
    And Scroll down to Hot Sellers last Section
    When user Hover on Radiant Tee card
    And user click on Add to Wishlist button Radiant Tee
    Then Item added to wishlist successfully
    And Radiant Tee added to wishlist successfully
    And user exits from browser



