Feature: Check Status Code and Status

  Scenario: Verify status returned by the API response
    Given the API is accessible
    When the user makes a request to the API
    Then the response status code should be valid
    And the response body should contain a valid status
