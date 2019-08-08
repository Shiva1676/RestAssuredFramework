/**
 * 
 */
package day7;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

/**
 * @author Lenovo
 *
 */
public class PutDemo {

	@Test
	public void putData() {

		int code = given().contentType(ContentType.JSON).accept(ContentType.JSON)
				.body("{\"BrandName\": \"AppleLatestModel\",\"Features\": {\"Feature\": [\"64GB RAM\",\"6TB Hard Drive\"]},\"Id\": 63,\"LaptopName\":\"MacPro9\"}")
				.put("http://localhost:8080/laptop-bag/webapi/api/update").statusCode();

		System.out.println(code);
		 
	}

	/*@Test
	public void postData() {

		int code = given().contentType(ContentType.JSON).accept(ContentType.JSON)
				.body("{\"BrandName\": \"Apple36\",\"Features\": {\"Feature\": [\"128GB RAM\",\"32TB Hard Drive\"]},\"Id\": 36,\"LaptopName\":\"MacPro19\"}")
				.post("http://localhost:8080/laptop-bag/webapi/api/add").statusCode();

		System.out.println(code);
		 
	}

*/	
}
