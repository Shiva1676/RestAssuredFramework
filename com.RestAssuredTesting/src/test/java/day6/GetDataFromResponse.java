/**
 * 
 */
package day6;

import static io.restassured.RestAssured.given;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

/**
 * @author Lenovo
 *
 */
public class GetDataFromResponse {

	@Test
	public void myJsonExpressionTest() {

		Response res = given().get(
				"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");

		JsonPath json = new JsonPath(res.body().asString());

		String cityname = json.get("name");

		System.out.println(cityname);

		String weatherInfo = json.get("weather[0].main");

		System.out.println(weatherInfo);

		Map<Object, Object> map = json.getMap("main");

		for (Map.Entry<Object, Object> var : map.entrySet()) {

			System.out.println("Key is:" + var.getKey() + ":" + var.getValue());

		}

	}

}
