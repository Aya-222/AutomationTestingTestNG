Feature: Login function
  Scenario: User can login with valid credential
    Given user open browser URL website
    And user clicks sign button
    When user enters valid Email
    And user enter valid password
    And user clicks login button
   Then user can login successfully URL
    And user wait six seconds
    And user can shows Welcome first name and last name
    And Close browser


