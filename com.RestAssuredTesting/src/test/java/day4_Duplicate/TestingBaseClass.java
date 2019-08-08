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
public class TestingBaseClass {

	@BeforeSuite
	public void uriBasicAuth(){
		
		baseURI = "http://restapi.demoqa.com";
		
		RestAssured.authentication = basic("ToolsQA", "TestPassword");
	}
	
	
}
