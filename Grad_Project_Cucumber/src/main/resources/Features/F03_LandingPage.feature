Feature: Landing function
  Scenario: Validate that Hot sellers is displayed and each card contains price in $
    Given open URL magento in Browser
    When Scroll down to Hot Sellers Section
    Then Observe Radiant Tee card is displayed with price
    And Observe Breathe Tank card is displayed with price
    And Observe Argus Weather Tank card is displayed with price
    And Observe Hero Hoodie card is displayed with price
    And Observe Fusion Backpack card is displayed with price
    And Observe Push It Messenger Bag card is displayed with price
    And user close the tab of browser


  Scenario: Validate That each card contains “Add to Cart” button and clickable
    Given open URL magento in Browser
    When Scroll down to Hot Sellers Section
    Then Observe Radiant Tee card contains Add to Cart
    And Observe Breathe Tank card contains Add to Cart
    And Observe Argus Weather Tank card contains Add to Cart
    And Observe Hero Hoodie card contains Add to Cart
    And Observe Fusion Backpack card contains Add to Cart
    And Observe Push It Messenger Bag card contains Add to Cart
    And user close the tab of browser




  Scenario: Validate That Guest user can add product to cart
    Given open URL magento in Browser
    And Scroll down to Hot Sellers Section
    When user hover on card Breathe Easy Tank
    And Select Size M
    And Select white Color
    And user click on Add to Cart button
    And user wait six seconds later
    Then Product added to cart successfully
    And Cart icon should display number one
    And user close the tab of browser
