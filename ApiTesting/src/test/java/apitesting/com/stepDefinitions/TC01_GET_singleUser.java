package apitesting.com.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

import org.testng.Assert;

public class TC01_GET_singleUser {

	Response response;

	@Given("^Get the Response for single user$")
	public void get_the_Response_for_single_user() throws Throwable {

		try {
			response = given().when().get("https://reqres.in/api/users/2");
			System.out.println("Get response is : " + response.asString());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("^I Verify the Response Code as (\\d+)$")
	public void i_Verify_the_Response_Code_as(int code) throws Throwable {

		try {
			Assert.assertEquals(response.getStatusCode(), code);
		} catch (Exception e) {
			
		}
	}

	@Then("^I Verify the Reponse Status Code as \"([^\"]*)\"$")
	public void i_Verify_the_Reponse_Status_Code_as(String arg1) throws Throwable {

		try {
			Assert.assertEquals(response.getStatusLine(), arg1);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("^I Verify the Reponse Type as \"([^\"]*)\"$")
	public void i_Verify_the_Reponse_Type_as(String arg1) throws Throwable {
		try {
			Assert.assertEquals(response.getContentType(), arg1);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
