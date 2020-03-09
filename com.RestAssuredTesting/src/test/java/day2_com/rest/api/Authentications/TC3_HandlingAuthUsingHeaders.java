/**
 * 
 */
package day2_com.rest.api.Authentications;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

/**
 * @author Lenovo
 * This script is all about how to handle authentication using headers
 * Note: When you're handling using headers don't forget to give "Bearer"
 * Created by: Ganesh
 * Created on: 23-02-202
 */
public class TC3_HandlingAuthUsingHeaders {
	
	
	@Test
	public void testAuthUsingHeaders() {
		
	given()
	 .contentType("application-json")
	 .header("Authorization", "Bearer _DYfrzj8jB5mEoX9stdllFmrt9RxXsiG8ral")
	 .when()
	 .get("https://gorest.co.in/public-api/users/23")
	 .then().log().all()
	 .assertThat()
	 .statusCode(200);
		
	}

}
