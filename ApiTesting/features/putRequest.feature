Feature: This feature is to update the existing request

  @post1
  Scenario: POST_ verify Creating a new user
    When I send request with name and job "Pankaj" and "QA"
    Then I Verify the Created At
    Then I Verify the Response Code
