/**
 * 
 */
package day7_Duplicate;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

/**
 * @author Lenovo
 *
 */
public class PutDemo {

	@Test
	public void putMethod() {

		int code = given().contentType(ContentType.JSON).accept(ContentType.JSON)
				.body("{\"BrandName\": \"AppleLatestModel\",\"Features\": {\"Feature\": [\"64GB RAM\",\"6TB Hard Drive\"]},\"Id\": 109,\"LaptopName\":\"MacPro9\"}")
				.put("http://localhost:8080/laptop-bag/webapi/api/update").statusCode();

		System.out.println(code);

	}

}
