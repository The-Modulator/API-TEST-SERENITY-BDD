Feature: Verify 162 record

  Scenario: Verify the API returns 162 currency pairs
    Given the API is accessible
    When the user makes a request to the API
    Then the response should contain 162 currency pairs
