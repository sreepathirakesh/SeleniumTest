Feature: This feature is to validate the post request
@post
  Scenario: Verify Post User request
    When I Send the request with body to target server
    Then I Verify the response code
