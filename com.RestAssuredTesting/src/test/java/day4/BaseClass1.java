/**
 * 
 */
package day4;

import static io.restassured.RestAssured.baseURI;

import org.testng.annotations.BeforeSuite;

/**
 * @author Lenovo
 *
 */
public class BaseClass1 {

	@BeforeSuite
	public void setUp() {

		baseURI = "http://restapi.demoqa.com";

	}

}
