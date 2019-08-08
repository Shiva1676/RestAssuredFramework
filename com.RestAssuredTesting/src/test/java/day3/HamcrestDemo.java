/**
 * 
 */
package day3;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class HamcrestDemo {

	@Test
	public void test1() {

		given().get(
				"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22")
				.then().body("name", equalToIgnoringCase("london"));

	}

	@Test
	public void test2() {

		given().get(
				"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22")
				.then().body("name", equalToIgnoringCase("USA"));

	}

	@Test
	public void test3() {

		given().get(
				"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22")
				.then().body("weather[0].description", is("light intensity drizzle"));

	}

	@Test
	public void test4() {

		given().get(
				"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22")
				.then().body("weather[0].main", equalToIgnoringCase("Drizzle"));

	}

}
