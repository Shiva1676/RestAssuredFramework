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
public class HandleAuthetication2 extends BaseClass1{

	@Test(enabled=false)
	public void test1(){
		
		given()
		.auth()
		.basic("ToolsQA", "TestPassword")
		.get("/authentication/CheckForAuthentication")
		.then().assertThat().statusCode(200);
		
		
	}

	// Passing wrong credentials
	@Test
	public void test2(){
		
		given()
		.auth()
		.basic("ToolsQA1", "TestPassword")
		.get("/authentication/CheckForAuthentication")
		.then().assertThat().statusCode(200);
		
		
	}
	
}
