@ProfileUpdate
Feature: Profile Updation

  Scenario: Verify by updating the first name
    Given User logged in to the Shopping Portal
    When User clicks on My Personal Information
    And User updates the First Name
    And User signs out from the page
