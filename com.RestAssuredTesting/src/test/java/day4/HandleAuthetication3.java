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
public class HandleAuthetication3 extends BaseClass2{

	@Test
	public void test1(){
		
		 given()
		.get("/authentication/CheckForAuthentication")
		.then().assertThat().statusCode(200);
		
		
	}

	// Passing wrong credentials
	@Test
	public void test2(){
		
		given()
		.get("/authentication/CheckForAuthentication")
		.then().assertThat().statusCode(401);
		
		
	}
	
}
