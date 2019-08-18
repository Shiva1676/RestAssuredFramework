/**
 * 
 */
package practiseSessions;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

/**
 * @author Lenovo
 *
 */
public class Class1_QueryParameters {

	@Test
	public void test() {

		int statusCode = given().param("q", "AAA")
				.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22")
				.statusCode();

		System.out.println(statusCode);
	}
}
