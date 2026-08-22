Feature: Test Automation Practice Application

  Background:
    Given user opens the Test Automation Practice application

  Scenario: Enter data in the data entry form
    When user enters name "John Doe"
    And user enters email "john.doe@test.com"
    And user enters phone number "9876543210"
    And user enters address "Bangalore, Karnataka"
    And user selects gender 