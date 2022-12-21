package apitesting.com.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

import org.testng.Assert;

public class TC02_GetWeatherDetails {

	Response resp;

	@When("^I send Parameters to get weather API \"([^\"]*)\" with Appi Id \"([^\"]*)\"$")
	public void i_send_Parameters_to_get_weather_API_with_Appi_Id(String city, String appIdInfo) throws Throwable {
		resp = given().param("q", city).param("appid", appIdInfo).when()
				.get("https://samples.openweathermap.org/data/2.5/weather");
		System.out.println(resp.asString());
	}

	@Then("^I Verify the status Code (\\d+)$")
	public void i_Verify_the_status_Code(int arg1) throws Throwable {
		Assert.assertEquals(resp.statusCode(), arg1);
	}
	// Get request - Response extracting

	@Then("^I Verify the today weather condition from description$")
	public void i_Verify_the_today_weather_condition_from_description() throws Throwable {
		String resp = given().param("q", "2172797")
				     .param("appid", "b6907d289e10d714a6e88b30761fae22")
				     .when()
				     .get("https://samples.openweathermap.org/data/2.5/weather")
				     .then().contentType(ContentType.JSON)
				     .extract()
				     // .path("weather[0].description");
				     .path("sys.country");
		Assert.assertEquals(resp, "GB");
		// System.out.println("Today's weather condition is : " + resp);

		System.out.println("The Country Code is : " + resp);
	}
	
	// Post Request - Sending request
	
	

	// @Given("^get the response of the weather Get Request$")
	// public void get_the_response_of_the_weather_Get_Request() throws Throwable {
	// resp =
	// given().when().get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
	// System.out.println(resp.asString());
	// }
	////
	//
	// @When("^I send Parameters to weather API \"([^\"]*)\"$")
	// public void i_send_Parameters_to_weather_API(String city) throws Throwable {
	// resp = given().param("q", city).param("appid",
	// appIdInfo).when().get("https://samples.openweathermap.org/data/2.5/weather");
	// System.out.println(resp.asString());
	// }
	//
	// @When("^I Send the Paramter for Appi ID \"([^\"]*)\"$")
	// public void i_Send_the_Paramter_for_Appi_ID(String arg1) throws Throwable {
	//
	// }
	//
	// @Then("^I Verify the status Code \"([^\"]*)\"$")
	// public void i_Verify_the_status_Code(String arg1) throws Throwable {
	//
	// }
	// @Then("^I Verify the Weather Condition today$")
	// public void i_Verify_the_Weather_Condition_today() throws Throwable {
	// // Write code here that turns the phrase above into concrete actions
	// throw new PendingException();
	// }

}
