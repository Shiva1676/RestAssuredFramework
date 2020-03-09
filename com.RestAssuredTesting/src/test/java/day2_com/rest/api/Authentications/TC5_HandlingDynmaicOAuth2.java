/**
 * 
 */
package day2_com.rest.api.Authentications;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * @author Lenovo
 *
 */
public class TC5_HandlingDynmaicOAuth2 {

	@Test
	public void handlingDynamicOAuth() {
	
		String oAuthToken =  " ";
		
		RequestSpecification request = given()
		.formParam("client_id", "RestAssuredAPI_OAUTH2.0_Aug")
		.formParam("client_secret", "27b8b4c22af7c0d5d39f7e2b7fa5d9a6")
		.formParam("grant_type", "client_credentials");
		
		Response response = request.post("http://coop.apps.symfonycasts.com/token");
		
		oAuthToken = response.jsonPath().getString("access_token");
		
		System.out.println("The access token is:"+ oAuthToken);
		
//		System.out.println(response.prettyPrint());
		
	}
	
}
