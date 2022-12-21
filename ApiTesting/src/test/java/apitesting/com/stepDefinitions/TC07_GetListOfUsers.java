package apitesting.com.stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.jayway.restassured.http.ContentType;

public class TC07_GetListOfUsers {
	Response resp;

	@When("^Verify the Complete Response Body of GET List of User\\.$")
	public void verify_the_Complete_Response_Body_of_GET_List_of_User() throws Throwable {
		resp = given().when().get("https://reqres.in/api/users?page=2");
		System.out.println(resp.asString());
	}

	@Then("^Verify the Status Code (\\d+) displayed or not for list of user$")
	public void verify_the_Status_Code_displayed_or_not_for_list_of_user(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(resp.getStatusCode(), arg1);
	}

	@Then("^Verify id field in response body$")
	public void verify_id_field_in_response_body(DataTable id) throws Throwable {

		try {
			
			for (Map<String, String> data : id.asMaps(String.class, String.class)) {
				
				for (int i = 0; i < data.size(); i++) {

					   String value = data.get("Id");
					   int finalInt = Integer.parseInt(value);
						int resp = given().when()
							.get("https://reqres.in/api/users?page=2")
							.then()
							.contentType(ContentType.JSON)
							.extract()
							.path("data["+i+"].id");
					System.out.println("Id value is :" + data.get("Id"));
					Thread.sleep(1000);
					//Assert.assertEquals(resp, finalInt);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@Then("^Verify email field from response body$")
	public void verify_email_field_from_response_body(DataTable email) throws Throwable {

		try {
			
			for (Map<String, String> data : email.asMaps(String.class, String.class)) {
				
				for (int i = 0; i <=data.size();) {
 
					   String value = data.get("Email");
					   
						String resp = given().when()
							.get("https://reqres.in/api/users?page=2")
							.then()
							.contentType(ContentType.JSON)
							.extract()
							.path("data["+i+"].email");
						i++;
					//System.out.println("Email value is :" + data.get("Email"));
					Thread.sleep(1000);
					System.out.println("resp is :"+resp + "feature data :"+value);
					Assert.assertEquals(resp, value);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		}

	@Then("^Verify firstname from response body$")
	public void verify_firstname_from_response_body(DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

	}

	@Then("^Verify lastName from response body$")
	public void verify_lastName_from_response_body(DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

	}

	@Then("^Verify avatar from the response body$")
	public void verify_avatar_from_the_response_body(DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

	}
}