Feature: Authentication page

  Scenario: Login with already existing user
    Given I click sign in header button
    And I verify Authentication page is 'displayed'
    When I enter new user email in login email field at Authentication page
    And I enter Password in login password field as 'P@ssword' at Authentication page
    And I click 'Sign in' button at Authentication page
    Then I verify Alert at Authentication page with following text:
      | There is 1 error       |
      | Authentication failed. |
    When I enter email as 'existingtestuser@test.com' in login email field at Authentication page
    And I enter Password in login password field as 'P@ssword' at Authentication page
    And I click 'Sign in' button at Authentication page
    Then I verify Home page is 'displayed'

  Scenario: Recover password with already existing user
    Given I click sign in header button
    And I verify Authentication page is 'displayed'
    When I click Forgot your password button at Authentication page
    Then I verify Forgot your password panel is 'displayed'
    When I enter email as 'existingtestuser@test.com' at Forgot your password panel
    And I click 'Retrieve Password' button at Forgot your password panel
    Then I verify Alert at Forgot your password page with following text:
      | A confirmation email has been sent to your address: |


  Scenario: Create a new account
    Given I click sign in header button
    And I verify Authentication page is 'displayed'
    When I enter email as 'existingtestuser@test.com' at Authentication page
    And I click 'Create an account' button at Authentication page
    Then I verify Alert at Authentication page for Create user panel with following text:
      | An account using this email address has already been registered. Please enter a valid password or request a new one. |
    When I enter new user email in create account panel at Authentication page
    And I click 'Create an account' button at Authentication page
    Then I verify Create an account panel is 'displayed'
    When I click 'Register' button at Create an account panel
    Then I verify Alert at Create an account panel with following text:
      | There are 8 errors                                                               |
      | You must register at least one phone number.                                     |
      | lastname is required.                                                            |
      | firstname is required.                                                           |
      | passwd is required.                                                              |
      | address1 is required.                                                            |
      | city is required.                                                                |
      | The Zip/Postal code you've entered is invalid. It must follow this format: 00000 |
      | This country requires you to choose a State.                                     |
    When I fill Create an account form with following data:
      | firstName   | testName       |
      | secondName  | testSecondName |
      | password    | P@ssword       |
      | address     | test 8         |
      | city        | Test           |
      | state       | Alabama        |
      | zipCode     | 11111          |
      | mobilePhone | 1232323333     |
    And I click 'Register' button at Create an account panel
    Then I verify Home page is 'displayed'


