/**
 * 
 */
package day4;

import static io.restassured.RestAssured.baseURI;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

/**
 * @author Lenovo
 *
 */
public class BaseClass2 {

	@BeforeSuite
	public void setUp() {

		baseURI = "http://restapi.demoqa.com";

		RestAssured.authentication = RestAssured.basic("ToolsQA", "TestPassword");

	}

}
