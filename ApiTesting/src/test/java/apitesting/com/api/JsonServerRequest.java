package apitesting.com.api;

import org.testng.annotations.Test;


import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;
public class JsonServerRequest {
	
	@Test
	public void getMethodExample() {
		Response resp = given().when().
				get("https://reqres.in/api/users/2");
		  System.out.println("Get response is : " + resp.asString());
		  System.out.println("Get Response Code :" + resp.getStatusCode());
		  System.out.println("Get Content Type : "+ resp.getContentType());
	
		
	}

}
