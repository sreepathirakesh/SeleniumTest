Feature: The purpose of this feature file to automate the single user of get Request

  @GET_SingleUser
  Scenario: Verify the GET - Single User Request with reponse
    When Verify the Complete Response Body of GET User.
    Then Verify the Status Code 200 displayed or not.
    Then Verify by extracting response body for field validations. id is 2,
    Then Verify email is "janet.weaver@reqres.in"
    Then Verify firstname "Janet"
    Then Verify lastName is "Weaver"
    Then Verify avatar is "https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg"
    Then Status Code should not be 500 and 400 and 201
