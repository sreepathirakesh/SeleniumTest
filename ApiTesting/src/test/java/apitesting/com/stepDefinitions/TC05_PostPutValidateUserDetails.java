package apitesting.com.stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import apitesting.com.userdata.UserData;

import static com.jayway.restassured.RestAssured.*;

import org.testng.Assert;


public class TC05_PostPutValidateUserDetails {
	UserData userdata ;
	Response resp;
	@When("^I send request with name and job \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_send_request_with_name_and_job_and(String arg1, String arg2) throws Throwable {
	 userdata  = new UserData();
	 userdata.setName(arg1);
	 userdata.setJob(arg2);
	 resp = given()
			 .body(userdata)
			 .when()
			 .contentType(ContentType.JSON)
			 .post("https://reqres.in/api/users");
System.out.println("Response data is " + resp.asString());	
	}

	@Then("^I Verify the Created At$")
	public void i_Verify_the_Created_At() throws Throwable {
	   String resp = given()
				 .body(userdata)
				 .when()
				 .contentType(ContentType.JSON)
				 .post("https://reqres.in/api/users")
				 .then()
				 .extract()
				 .path("createdAt");
				 
		 System.out.println("CreatedAt " + resp);
	}

	@Then("^I Verify the Response Code$")
	public void i_Verify_the_Response_Code() throws Throwable {
	  Assert.assertEquals(resp.getStatusCode(), 201);
	}
}
