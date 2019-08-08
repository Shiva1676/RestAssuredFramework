/**
 * 
 */
package demo;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

/**
 * @author Lenovo
 *
 */
public class JsonObjectDemo {

	@Test
	public void test() {
		// TODO Auto-generated method stub

		JSONObject json = new JSONObject();

		json.put("BrandName", "Apple99");

		json.put("Id", "199");

		json.put("LaptopName", "MacPro9");

		JSONObject nested = new JSONObject();

		ArrayList<Object> list = new ArrayList<Object>();

		list.add("6GB");

		list.add("64TB Hard Drive");

		nested.put("Feature", list);

		json.put("Features", nested);

		int code = given().contentType(ContentType.JSON).accept(ContentType.JSON).body(json)
				.post("http://localhost:8080/laptop-bag/webapi/api/add").statusCode();

		System.out.println("The status code:" + code);

	}

}
