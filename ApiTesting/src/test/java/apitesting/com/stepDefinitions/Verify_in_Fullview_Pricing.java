package apitesting.com.stepDefinitions;

import com.jayway.restassured.response.Response;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.jayway.restassured.RestAssured.given;

public class Verify_in_Fullview_Pricing {
    Response response;

    @Given("^Login to OneFps as Pricing Manager or Super User$")
    public void login_to_OneFps_as_Pricing_Manager_or_Super_User() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            response = given().when().get("https://epds.telangana.gov.in/FoodSecurityAct/");
            System.out.println("Get response is : " + response.asString());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Then("^User should able to login to the system successfully\\.$")
    public void user_should_able_to_login_to_the_system_successfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^Navigate to pricing -Fullview Pricing -select the site$")
    public void navigate_to_pricing_Fullview_Pricing_select_the_site() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^User should be navigating to Quickview Pricing Scfreen successfully$")
    public void user_should_be_navigating_to_Quickview_Pricing_Scfreen_successfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^Select cluser/ Site$")
    public void select_cluser_Site() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^Cluster / Site should be selected$")
    public void cluster_Site_should_be_selected() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^Check in Full view Pricing screen under product price section$")
    public void check_in_Full_view_Pricing_screen_under_product_price_section() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^User should be able to see at least (\\d+) products under product price section in full view pricing screen without using horizontal scroll bar$")
    public void user_should_be_able_to_see_at_least_products_under_product_price_section_in_full_view_pricing_screen_without_using_horizontal_scroll_bar(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }


}
