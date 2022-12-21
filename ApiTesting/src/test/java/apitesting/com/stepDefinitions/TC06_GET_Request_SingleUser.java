package apitesting.com.stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;
import org.testng.Assert;

public class TC06_GET_Request_SingleUser {

	Response resp;

	@When("^Verify the Complete Response Body of GET User\\.$")
	public void verify_the_Complete_Response_Body_of_GET_User() throws Throwable {
		try {
			resp = given().when().get("https://reqres.in/api/users/2");
			System.out.println("-------------------------------------------------------");
			System.out.println("Reponse Body of GET - Single User is :" + resp.asString());
			System.out.println("-------------------------------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Then("^Verify the Status Code (\\d+) displayed or not\\.$")
	public void verify_the_Status_Code_displayed_or_not(int statusCode) throws Throwable {

		try {
			System.out.println("Response Status Code : "+ resp.getStatusCode());
			Assert.assertEquals(resp.getStatusCode(), statusCode, "Response Status Code Not Matching with Actual");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^Verify by extracting response body for field validations\\. id is (\\d+),$")
	public void verify_by_extracting_response_body_for_field_validations_id_is(int id) throws Throwable {

		try {
			int resp = given()
					.when()
					.get("https://reqres.in/api/users/2")
					.then()
					.contentType(ContentType.JSON)
					.extract()
					.path("data.id");
			System.out.println("Id is :"+ resp);
			Assert.assertEquals(resp, id, "Response Id is not matching with Actual Id");
		} catch (Exception e) {
                e.printStackTrace();
		}
	}

	@Then("^Verify email is \"([^\"]*)\"$")
	public void verify_email_is(String email) throws Throwable {
		try {
			String resp = given()
					.when()
					.get("https://reqres.in/api/users/2")
					.then()
					.contentType(ContentType.JSON)
					.extract()
					.path("data.email");
			System.out.println("email is :"+ resp);
			Assert.assertEquals(resp, email, "Response email is not matching with Actual Id");
		} catch (Exception e) {
                e.printStackTrace();
		}
	}

	@Then("^Verify firstname \"([^\"]*)\"$")
	public void verify_firstname(String firstname) throws Throwable {

		try {
			String resp = given()
					.when()
					.get("https://reqres.in/api/users/2")
					.then()
					.contentType(ContentType.JSON)
					.extract()
					.path("data.first_name");
			System.out.println("first_name is :"+ resp);
			Assert.assertEquals(resp, firstname, "Response firstname is not matching with Actual Id");
		} catch (Exception e) {
                e.printStackTrace();
		}
	}

	@Then("^Verify lastName is \"([^\"]*)\"$")
	public void verify_lastName_is(String lastName) throws Throwable {
		try {
			String resp = given()
					.when()
					.get("https://reqres.in/api/users/2")
					.then()
					.contentType(ContentType.JSON)
					.extract()
					.path("data.last_name");
			System.out.println("lastName is :"+ resp);
			Assert.assertEquals(resp, lastName, "Response last_name is not matching with Actual Id");
		} catch (Exception e) {
                e.printStackTrace();
		}
	}

	@Then("^Verify avatar is \"([^\"]*)\"$")
	public void verify_avatar_is(String arg1) throws Throwable {
		try {
			String resp = given()
					.when()
					.get("https://reqres.in/api/users/2")
					.then()
					.contentType(ContentType.JSON)
					.extract()
					.path("data.avatar");
			System.out.println("avatar is :"+ resp);
			Assert.assertEquals(resp, arg1, "Response avatar is not matching with Actual Id");
		} catch (Exception e) {
                e.printStackTrace();
		}
	}

	@Then("^Status Code should not be (\\d+) and (\\d+) and (\\d+)$")
	public void status_Code_should_not_be_and_and(int arg1, int arg2, int arg3) throws Throwable {

		try {
			
			Assert.assertNotEquals(resp.getStatusCode(), arg1);
			Assert.assertNotEquals(resp.getStatusCode(), arg2);
			Assert.assertNotEquals(resp.getStatusCode(), arg3);
			System.out.println("The Response status code Given from resp body is "+ resp.getStatusCode() + " it's not matching as expcted as "+ arg1+ "- "+ arg2+"- "+ arg3);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
