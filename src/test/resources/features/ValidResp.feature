Feature: Successful API Call

  Scenario: Verify API call is successful and returns valid price
    Given the API is accessible
    When the user makes a request to the API
    Then the response status code should be 200
    And the response body should contain a valid price


