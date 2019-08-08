/**
 * 
 */
package practiseSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

/**
 * @author Lenovo
 *
 */
public class Class4_Authetication {

	@Test
	public void autheticationTest(){
		
		int code = given()
		.auth()
		.basic("ToolsQA", "TestPassword")
		.get("http://restapi.demoqa.com/authentication/CheckForAuthentication").statusCode();
		
		System.out.println(code);
		
		Assert.assertEquals(code, 200);
		
	}

}
