Feature: Is to get the List of Users from the Server

  @GET_ListUsers
  Scenario: Verify the GET - List Of User Request with reponse
    When Verify the Complete Response Body of GET List of User.
    Then Verify the Status Code 200 displayed or not for list of user
    Then Verify id field in response body
      | Id |
      |  4 |
      |  5 |
      |  6 |
    Then Verify email field from response body
      | Email                    |  |
      | eve.holt@reqres.in       |  |
      | charles.morris@reqres.in |  |
      | tracey.ramos@reqres.in   |  |
    Then Verify firstname from response body
      | first_name |
      | Eve        |
      | Charles    |
      | Tracey     |
    Then Verify lastName from response body
    |last_name|
      | Holt   |
      | Morris |
      | Ramos  |
    Then Verify avatar from the response body
      | avatar                                                              |
      | https://s3.amazonaws.com/uifaces/faces/twitter/marcoramires/128.jpg |
      | https://s3.amazonaws.com/uifaces/faces/twitter/stephenmoon/128.jpg  |
      | https://s3.amazonaws.com/uifaces/faces/twitter/bigmancho/128.jpg    |
