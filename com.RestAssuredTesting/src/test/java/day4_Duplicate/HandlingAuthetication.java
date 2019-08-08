/**
 * 
 */
package day4_Duplicate;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class HandlingAuthetication extends BaseClass_Authetications {

	@Test
	public void verifyAPI() {

		given().auth().basic("ToolsQA", "TestPassword").get("/authentication/CheckForAuthentication").then()
				.statusCode(200);

	}

}
