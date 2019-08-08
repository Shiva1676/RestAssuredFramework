/**
 * 
 */
package day4;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class HandleAuthetication {

	@Test
	public void test1() {

		given().auth().basic("ToolsQA", "TestPassword")
				.get("http://restapi.demoqa.com/authentication/CheckForAuthentication").then().assertThat()
				.statusCode(200);

	}

	// Passing wrong credentials
	@Test
	public void test2() {

		given().auth().basic("ToolsQA1", "TestPassword")
				.get("http://restapi.demoqa.com/authentication/CheckForAuthentication").then().assertThat()
				.statusCode(200);

	}

}
