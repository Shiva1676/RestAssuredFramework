/**
 * 
 */
package demo;

import java.util.Map;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.path.json.JsonPath;

/**
 * @author Lenovo
 *
 */
public class Test1 {

	@Test
	public void testData() {

		String data = "{\"response\":{\"customer-contact-id\":\"502639\",\"demand\":\"false\"}}";

		// JsonPath path = new JsonPath(data);

		JsonPath path = new JsonPath(data);

		// Object ob = path.get("customer-contact-id");

		Map<Object, Object> map = path.getMap("response");

		for (Map.Entry<Object, Object> arr : map.entrySet()) {

			System.out.println(arr.getKey() + ":" + arr.getValue());

		}

		/*
		 * String json = "{\"Entry ID\" : \"654123\"}";
		 * 
		 * // When JsonPath jsonPath = JsonPath.from(json);
		 * 
		 * // Then // assertThat(jsonPath.getString("'Entry ID'"),
		 * not(isEmptyOrNullString()));
		 * 
		 * String data1 = jsonPath.getString(" 'Entry ID' ");
		 * 
		 * System.out.println(data1);
		 */
	}

}
