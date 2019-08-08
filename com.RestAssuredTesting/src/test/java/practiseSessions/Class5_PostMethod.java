/**
 * 
 */
package practiseSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

/**
 * @author Lenovo
 *
 */
public class Class5_PostMethod {

	@Test
	public void test() {

		int statusCode = given().contentType(ContentType.JSON).accept(ContentType.JSON)
				.body("{\"BrandName\": \"AppleLatestModel\",\"Features\": {\"Feature\": [\"24GB RAM\",\"6TB Hard Drive\"]},\"Id\": 111,\"LaptopName\":\"MacPro\"}")
				.post("http://localhost:8080/laptop-bag/webapi/api/add").statusCode();
		
		System.out.println("The status code is:"+statusCode);
        
		Assert.assertEquals(statusCode, 200);
		
		
	}
}
