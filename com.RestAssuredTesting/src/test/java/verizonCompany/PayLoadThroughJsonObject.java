/**
 * 
 */
package verizonCompany;

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
public class PayLoadThroughJsonObject {

	@Test
	public void postData(){
		
		
		JSONObject json = new JSONObject();
		
		json.put("BrandName", "Apple143");
		json.put("Id", "143");
		json.put("LaptopName", "MacPro");
		
		JSONObject nested = new JSONObject();
		
		List<String> nestedData = new ArrayList<String>();
		
		nestedData.add("32GB RAM");
		nestedData.add("128TB Hard Drive");
		
		nested.put("Feature", nestedData);
		
		json.put("Features", nested);
		
		int code = given()
				.log()
				.all()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(json)
				.post("http://localhost:8080/laptop-bag/webapi/api/add")
				.statusCode();
		
		System.out.println(code);
		
	}

}
