Feature: Register function
  Scenario: User can register with valid credential
    Given User open browser Website URL
    And user open signup website
    When user enters valid first name
    And user enters last name
    And user enters email
    And user enters valid password
    And user click create button
    Then user cannot login URL successfully required passward
    And message displayed under mendatory fields
    And user Close browser


    Scenario: User can register with valid field
      Given User open browser Website URL
      And user open signup website
      When user enters valid first name
      And user enters last name
      And user enters email
      And user enters valid password
      And user enters confirm passward dosnot match
      And user click create button
      Then user cannot login URL successfully required passward
      And message displayed under confirm password field
      And user Close browser


  Scenario: User can register with valid credential
    Given User open browser Website URL
    And user open signup website
    When user enters valid first name
    And user enters last name
    And user enters email
    And user enters valid password
    And user enters valid match confirm passward
    And user click create button
    Then user can login successfully navigate account page
    And verify user can show contact information first name
    And verify user can show contact information last name
    And verify user can show contact information Email
    And user Close browser