/**
 * 
 */
package day4_Duplicate;

import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

/**
 * @author Lenovo
 *
 */
public class BaseClass {

	@BeforeSuite
	public void baseURI() {

		baseURI = "http://localhost:8080/";
	}

}
