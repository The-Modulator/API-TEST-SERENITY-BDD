Feature: Check the status code and status of the API response
  Scenario: check status
    Given the API is accessible
    When the user makes a request to the API
    Then the response status code should be valid
    And the response body should contain a valid status