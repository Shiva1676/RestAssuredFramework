/**
 * 
 */
package day2_com.rest.api.Authentications;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

/**
 * @author Lenovo
 *This script is all about how to handle authenication in Oauth2.0
 * Created by: Ganesh
 * Created on: 23-02-2020
 * /public-api/users?first_name=john
 */

public class TC2_OAuth2 {


	@Test
	public void test_OAuth2() {
		
		given()
		 .auth()
		 .oauth2("_DYfrzj8jB5mEoX9stdllFmrt9RxXsiG8ral")
		 .when()
		 .get("https://gorest.co.in/public-api/users/123")
		 .then().log().all()
		 .assertThat()
		 .statusCode(200);

	}
	
	
	@Test
	public void test_QueryParameters() {
		
		given()
		 .auth()
		 .oauth2("_DYfrzj8jB5mEoX9stdllFmrt9RxXsiG8ral")
		 .param("first_name", "john")
		 .when()
		 .get("https://gorest.co.in/public-api/users")
		 .then().log().all()
		 .assertThat()
		 .statusCode(200);
	}
	
}
