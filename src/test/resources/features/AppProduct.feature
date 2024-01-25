@regression
Feature: Testing App Product End Points(POST,UPDATE,DELETE)

  Scenario Outline:Testing Happy Path Post Product end point and validates information
    Then User calls App Product End point with '<name>','<price>','<description>','<purchase_allow>' and validates '<message>'
    Examples:
      | name             | price | description   | purchase_allow | message                       |
      | Ahmet New Laptop | 545   | My New Laptop | 0              | Resource created successfully |
