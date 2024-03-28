Feature: API response time
  Scenario: Verify if the API response time is valid
    Given the API is accessible
    When the user makes a request to the API
    Then API response time is not less than 3 seconds