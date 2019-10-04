/**
 * 
 */
package day6_Duplicate;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.util.Map;

/**
 * @author Lenovo
 *
 */
public class JsonPathDemo2 {

	@Test
	public void verifyJsonExpression() {

		String data = given()
				.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22")
				.body().asString();

		System.out.println(data);

		JsonPath json = new JsonPath(data);

//		Object ob = json.getJsonObject("base");
		
		String ob = json.get("base");
		
//		Object lon = json.get("coord.lonf");
//		
//		System.out.println(lon);

		System.out.println(ob);

		Map<Object, Object> map = json.getMap("sys");

		System.out.println("The key of sys are:");

		for (Map.Entry<Object, Object> arr : map.entrySet()) {

			System.out.println(arr.getKey() + ":" + arr.getValue());

		}

	}

}
