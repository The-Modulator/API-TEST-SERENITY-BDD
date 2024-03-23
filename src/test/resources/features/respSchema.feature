Feature: API Response JSON Schema

  Scenario: Verify API response matches JSON schema
    Given the API is accessible
    When the user makes a request to the API
    Then the response should match the JSON schema
