/**
 * 
 */
package day3;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

/**
 * @author Lenovo
 *
 */
public class JsonPathDemo {

	@Test
	public void test1() {

		String data = given().get(
				"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22")
				.body().asString();
		
		JsonPath json = new JsonPath(data);
		
		String weather_des = json.get("weather[0].description");
		
		String weather_main = json.get("weather[0].main");
		
		double lon_value = json.getDouble("coord.lon");
		
		String name = json.get("name");
		
		System.out.println(weather_des+ "---"+weather_main+ "---"+ " " +lon_value + "---"+ name);
		
		
        
	}

}
