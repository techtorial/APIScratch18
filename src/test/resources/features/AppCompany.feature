@regression
Feature: Testing Company End point

  Scenario Outline:Happy Path Company end point and validate information
    Then User calls company end point and validates '<message>','<company_name>','<company_email>','<company_phone>'
    Examples:
      | message                               | company_name | company_email     | company_phone |
      | Application data fetched successfully | techtorial   | company@email.com | 1234567891    |
