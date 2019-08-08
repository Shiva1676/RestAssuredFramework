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
public class HandleAuthetication1 extends BaseClass_Auth_Advance {

	@Test
	public void VerifyAPITest(){
		
		given().get("/authentication/CheckForAuthentication").then().statusCode(200);
		
		
	}
	
}
