Feature: LoginFeature
  This feature deals with login functionality

  Scenario: Login with correct userName an password
    Given I navigate to the login page
    And I enter the following data for login
      | userName | password       |
      | admin    | actualPassword |
    And I click login button
    Then I should see the userForm page

#  Scenario Outline: Login with correct userName an password using scenario outline
#    Given I navigate to the login page
#    And I enter <userName> and <password>
#    And I click login button
#    Then I should see the userForm page
#    Examples:
#      | userName  | password      |
#      | testUser1 | testPassword1 |
#      | testUser2 | testPassword2 |
#      | testUser3 | testPassword3 |