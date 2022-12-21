package apitesting.com.stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;

public class TC03_POST_UsersList {
	
	Response resp;
	@When("^I Send the request with body to target server$")
	public void i_Send_the_request_with_body_to_target_server() throws Throwable {
         // Uri: https://reqres.in/api/users
		String resp = given()
				 .body("{\r\n" + 
				 		"    \"name\": \"Pankaj\",\r\n" + 
				 		"    \"job\": \"Test Analyst\"\r\n" + 
				 		"}")
				 .when()
				 .contentType(ContentType.JSON)
				 .post("https://reqres.in/api/users")
				 
				 .then()
				 .extract()
				 .path("id");
		 System.out.println("---------------");
				 
		 System.out.println("User Id is : "+resp);
		 
	 
	}

	@Then("^I Verify the response code$")
	public void i_Verify_the_response_code() throws Throwable {
		resp = given()
				 .body("{\r\n" + 
				 		"    \"name\": \"Pankaj\",\r\n" + 
				 		"    \"job\": \"Test Analyst\"\r\n" + 
				 		"}")
				 .when()
				 .contentType(ContentType.JSON)
				 .post("https://reqres.in/api/users");
System.out.println("Response code is " + resp.getStatusCode());	    
	}


}
