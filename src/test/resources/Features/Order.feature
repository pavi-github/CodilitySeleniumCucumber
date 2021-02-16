@Order
Feature: Order and Verify T-Shirt

  Scenario: Verify the Placed Order
    Given User logged in to the Shopping Portal
    When User adds the selected T-Shirt for checkout
    And User fills all required fields to place the order
    Then Verify the Order History for the placed order
    And User signs out from the page




    