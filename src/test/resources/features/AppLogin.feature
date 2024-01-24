@regression
Feature: Testing Api Login Functionality

  Scenario Outline: Testing Happy Path App Login and validate Information
    Then User calls App Login end point and validates '<message>' from response payload
    Examples:
      | message                |
      | Logged in successfully |

  Scenario Outline: Testing negative scenarios for Login Functionality
    Then User calls App Login end point '<email>','<password>' and validates the '<message>' from response payload
    Examples:
      | email                       | password   | message                    |
      | testemplosdyee@example.com  | 1234567890 | Wrong credentials provided |
      | testemployee@example.com    | 45454545   | Wrong credentials provided |
      | testemplo545yee@example.com | 45454545   | Wrong credentials provided |