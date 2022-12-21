Feature: Purpose of this feature is to test GET request for users

  @tag1
  Scenario: GET Request for single user
    Given Get the Response for single user
    Then I Verify the Response Code as 200
    Then I Verify the Reponse Status Code as "HTTP/1.1 200 OK"
    Then I Verify the Reponse Type as "application/json; charset=utf-8"
