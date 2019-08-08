/**
 * 
 */
package day3_Duplicate;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalToIgnoringCase;

import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class HowToHandleHeaders {

	/*
	 * @Test(enabled = false) public void getHeaders() {
	 * 
	 * Response res = given().get(
	 * "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22"
	 * );
	 * 
	 * String body = res.body().asString();
	 * 
	 * System.out.println(
	 * "**********************************************************");
	 * 
	 * System.out.println(body);
	 * 
	 * Headers head = res.getHeaders();
	 * 
	 * List<Header> list = head.asList();
	 * 
	 * System.out.println(list);
	 * 
	 * System.out.println(res); }
	 * 
	 */
	@Test
	public void verfiyContent() {

		given().get(
				"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22")
				.then().body("name", equalToIgnoringCase("london"));

	}

	@Test
	public void verifyCoord() {

		given().get(
				"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22")
				.then().body("base", equalToIgnoringCase("stations"));
	}

	@Test
	public void verifyWeather() {

		given().get(
				"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22")
				.then().body("weather[0].main", equalToIgnoringCase("Drizzle"));

		System.out.println("*************");

		given().get(
				"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22")
				.then().body("weather[0].description", equalToIgnoringCase("light intensity drizzle"));
	}

}
