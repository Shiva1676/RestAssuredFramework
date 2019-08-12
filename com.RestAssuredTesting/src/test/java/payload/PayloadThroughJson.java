/**
 * 
 */
package payload;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

/**
 * @author Lenovo
 *
 */
public class PayloadThroughJson {

	@Test

	public void postingData() {

		String path = System.getProperty("user.dir") + "/post.json";

		File src = new File(path);

		int status = given().contentType(ContentType.JSON).accept(ContentType.JSON).body(src)
				.post("http://localhost:8080/laptop-bag/webapi/api/add").statusCode();

		System.out.println(status);

		// Assert.assertTrue(200);
	}

}
