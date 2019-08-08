/**
 * 
 */
package day4_Duplicate;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

/**
 * @author Lenovo
 *
 */
public class BaseClass_Auth_Advance {

	@BeforeSuite
	public void setUp(){
		
		baseURI = "http://restapi.demoqa.com";
		
		RestAssured.authentication = RestAssured.basic("ToolsQA", "TestPassword");
		
	}
	
}
