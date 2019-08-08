/**
 * 
 */
package day5;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

/**
 * @author Lenovo
 *
 */
public class PostRequestDemo {

	@Test
	public void postLaptop() {

		int code = given().contentType(ContentType.JSON).accept(ContentType.JSON)
				.body("{\"BrandName\": \"Apple\",\"Features\": {\"Feature\": [\"16GB RAM\",\"2TB Hard Drive\"]},\"Id\": 110,\"LaptopName\":\"Latitude\"}")
				.post("http://localhost:8080/laptop-bag/webapi/api/add").statusCode();

		System.out.println(code);
		 
	}

	@Test(enabled=false)
	public void getAllDetails(){
		
		String data = given().get("http://localhost:8080/laptop-bag/webapi/api/all").body().asString();

		System.out.println(data);
		
		Assert.assertTrue(data.contains("109"));
		
	}
	
}
