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
public class BaseClass {

	@BeforeSuite
	public void setUp(){
		
		baseURI = "http://localhost:8080/laptop-bag/";
	}
	
}
