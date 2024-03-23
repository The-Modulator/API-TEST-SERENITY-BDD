Feature: USD Price against AED

  Scenario: Verify USD price against AED is in range 3.6 - 3.7
    Given the API is accessible
    When the user requests USD price against AED
    Then the response should contain a price within the range of 3.6 - 3.7
