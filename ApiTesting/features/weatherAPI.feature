Feature: This feature is to test weather API

  @smoke
  Scenario: verify the current weather in London
    When I send Parameters to get weather API "London" with Appi Id "b6907d289e10d714a6e88b30761fae22"
    Then I Verify the status Code 200
    Then I Verify the today weather condition from description
    Then I Verify the Ciuntry Code "GB"
