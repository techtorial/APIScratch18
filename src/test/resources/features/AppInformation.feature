@regression
Feature: Testing General App Information

  Scenario Outline: Testing Happy Path App information end point call and validate information
    Then User validates '<message>','<companyName>','<companyEmail>',and '<companyWebsite>' from App response payload
    Examples:
      | message                               | companyName | companyEmail      | companyWebsite                |
      | Application data fetched successfully | techtorial  | company@email.com | https://techtorialacademy.com |
