package apitesting.com.stepDefinitions;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;

public class TC04_Put_UserDetails {
	
	Response resp;
	@When("^PUT - I Send the request with body to target server$")
	public void put_I_Send_the_request_with_body_to_target_server() throws Throwable {
         // Uri: https://reqres.in/api/users
		String resp = given()
				 	.body("{\r\n" + 
				 		"    \"name\": \"morpheus\",\r\n" + 
				 		"    \"job\": \"zion resident\"\r\n" + 
				 		"}")
				 .when()
				 .contentType(ContentType.JSON)
				 .put("https://reqres.in/api/users/2")
				 
				 .then()
				 .extract()
				 .path("updatedAt");
		 System.out.println("---------------");
				 
		 System.out.println("User is updated date : "+resp);
		 
	   // to read the reponse body you can use Response object which is resp.
		 // to extract the response body use string object.
	}
	@Then("^I Verify the response code for PUT REquest$")
	public void i_Verify_the_response_code_for_PUT_REquest() throws Throwable {
		resp = given()
				 .body("{\r\n" + 
				 		"    \"name\": \"morpheus\",\r\n" + 
				 		"    \"job\": \"zion resident\"\r\n" + 
				 		"}")
				 .when()
				 .contentType(ContentType.JSON)
				 .put("https://reqres.in/api/users/2");
System.out.println("Response code is " + resp.getStatusCode());	    
	}
	
	


}

