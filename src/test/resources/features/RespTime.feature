Feature: API Response Time

  Scenario: Verify API response time is adequate
    Given the API is accessible
    When the user makes a request to the API
    Then the response time should not be less than 3 seconds
