/**
 * 
 */
package day4_Duplicate;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

/**
 * @author Lenovo
 *
 */
public class TestingAPI extends TestingBaseClass{

	@Test(enabled = false)
	public void testAPI() {

		int code = given().get("/authentication/CheckForAuthentication").getStatusCode();
		
		System.out.println("The status code of the api is:"+ code);
		
		Assert.assertEquals(code, 200);

	}

	
	
	@Test
	public void testAPI1() {

//		int code = given().get("/authentication/CheckForAuthentication").getStatusCode();
		
		int code = given().auth().basic("ToolsQA1", "TestPassword").get("/authentication/CheckForAuthentication").getStatusCode();
		
		System.out.println("The status code of the api is:"+ code);
		
		Assert.assertEquals(code, 200);

	}
	
}
