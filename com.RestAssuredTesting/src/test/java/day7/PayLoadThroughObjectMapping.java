
package day7;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PayLoadThroughObjectMapping {

	@Test
	public void test() {

		JSONObject obj = new JSONObject();

		obj.put("BrandName", "Apple4");

		obj.put("Id", 4);

		obj.put("LaptopName", "AppleSuperLook4");

		JSONObject nested = new JSONObject();

		// JSONObject child = new JSONObject();

		List<String> child_array = new ArrayList<String>();

		child_array.add("32GB RAM");

		child_array.add("2TB Hard Drive");

		// int i =0;

		/*
		 * for(String arr: child_array){
		 * 
		 * child.put(i, arr);
		 * 
		 * i = i+1; }
		 */

		nested.put("Feature", child_array);

		obj.put("Features", nested);

		RestAssured.given().log().all().contentType(ContentType.JSON).accept(ContentType.JSON).body(obj)
				.post("http://localhost:8080/laptop-bag/webapi/api/add").then().assertThat().statusCode(200);

	}
}
