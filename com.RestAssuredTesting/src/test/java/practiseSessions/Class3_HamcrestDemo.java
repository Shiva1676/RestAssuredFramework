/**
 * 
 */
package practiseSessions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

import org.testng.annotations.Test;


/**
 * @author Lenovo
 *This script is used to handle the validations
 *Created By: Ganesh
 *Created On: 13-06-2019
 */
public class Class3_HamcrestDemo {

	@Test
	public void test1(){
		
		given()
		.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22")
		.then()
		.body("name", equalToIgnoringCase("London"));
		
	}
	
	@Test
	public void test2(){
		
		given().get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22")
		.then().body("weather[0].main", is("Drizzle"));
	}
	
	
}
