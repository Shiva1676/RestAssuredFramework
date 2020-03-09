/**
 * 
 */
package day2_com.rest.api.Authentications;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

/**
 * @author Lenovo This script is all about how to handle basic Authentications
 *         Created by: Ganesh 
 *         Created on: 23-02-2020
 */
public class TC1_BasicAuth {

	@Test
	public void testBasicAuth() {

		// Note: When we are using Basic auth we have to use preemptive method for sure

		given().auth().preemptive().basic("ToolsQA", "TestPassword")
				.get("http://restapi.demoqa.com/authentication/CheckForAuthentication").then().log().all().assertThat()
				.statusCode(200);

	}

}
