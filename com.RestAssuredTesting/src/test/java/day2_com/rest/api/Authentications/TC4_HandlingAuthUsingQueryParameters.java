/**
 * 
 */
package day2_com.rest.api.Authentications;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

/**
 * @author Lenovo
 *
 */
public class TC4_HandlingAuthUsingQueryParameters {

	@Test
	public void handlingAuthUsingQueryParmeters() {
		
		given()
		 .contentType("application/json")
		 .header("Authorization", "Bearer _DYfrzj8jB5mEoX9stdllFmrt9RxXsiG8ral")
		 .queryParam("first_name", "John")
		 .queryParam("gender", "male")
		 .when()
		 .get("https://gorest.co.in/public-api/users")
		 .then().log().all()
		 .assertThat()
		 .statusCode(200);
		
	}
	
}
