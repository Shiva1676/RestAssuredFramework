/**
 * 
 */
package day7_Duplicate;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

/**
 * @author Lenovo
 *
 */
public class PostingDataUsingJsonObject {

	
	
	@Test
	public void postData() {

		JSONObject json = new JSONObject();

		json.put("BrandName", "Lenovo129");

		json.put("Id", "129");

		json.put("LaptopName", "LenovoTheBestInMarket");

		JSONObject nested = new JSONObject();

		List<String> child_array = new ArrayList<String>();

		child_array.add("128GB RAM");

		child_array.add("8TB Hard Drive");
		
		nested.put("Feature", child_array);

		json.put("Features", nested);

		int code = given().log().all().contentType(ContentType.JSON).accept(ContentType.JSON).body(json)
				.post("http://localhost:8080/laptop-bag/webapi/api/add").statusCode();

		System.out.println("Posting data status code is:" + code);

	}

}
