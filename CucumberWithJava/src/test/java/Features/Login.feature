Feature: Login Functionality
  In order to do internet banking
  As a valid Para Bank customer
  I want to login successfully

  Scenario Outline: Login Successful
    Given I am in the login page of Para Bank application
    When I enter valid <username> and <password> with <userFullName>
    Then I should be taken to the Overview page


    Examples:
      |username |password |userFullName|
      | "john" | "demo" |"Mark Lambert"|
      | "john" | "demo" |"Mark Lambert" |


