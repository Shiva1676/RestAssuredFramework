/**
 * 
 */
package verizonCompany;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

/**
 * @author Lenovo
 *
 */
public class RestAssured_PostMethodforLaptopBag {

	@Test
	public void verifyLaptop() {

		String path = System.getProperty("user.dir") + "/post.json";

		File src = new File(path);

		int code = given().contentType(ContentType.JSON).accept(ContentType.JSON).body(src)
				.post("http://localhost:8080/laptop-bag/webapi/api/add").statusCode();

		System.out.println(code);

	}
}
