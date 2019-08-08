/**
 * 
 */
package practiseSessions;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

/**
 * @author Lenovo
 *
 */
public class Class4_BasicAuthetication {

	@Test
	public void testAuthetication(){
		
		int statusCode = given()
				.get("http://restapi.demoqa.com/authentication/CheckForAuthentication")
				.statusCode();
		
		System.out.println(statusCode);
		
		
	}
	
}
