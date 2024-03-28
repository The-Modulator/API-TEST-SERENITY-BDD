Feature: Verify currency pairs
  Scenario: Verify that the API returns 162 pairs
    Given the API is accessible
    When the user makes a request to the API
    Then the API must return 162 currency pair