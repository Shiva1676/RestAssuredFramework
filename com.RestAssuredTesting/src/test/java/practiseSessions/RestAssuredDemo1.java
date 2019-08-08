/**
 * 
 */
package practiseSessions;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

/**
 * @author Lenovo
 *
 */
public class RestAssuredDemo1 {

	@Test
	public void testMethod(){
		
		int statusCode = RestAssured
				        .given()
				        .get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22")
				        .statusCode();
		
		System.out.println("The status code of the appURL is:" + statusCode);
	}
	
}
