/**
 * 
 */
package day5_Duplicate;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

/**
 * @author Lenovo
 *
 */
public class PostMethod {

	@Test(enabled = false)
	public void addDataThroughPostMethod() {

		int statusCode = given().contentType(ContentType.JSON).accept(ContentType.JSON)
				.body("{\"BrandName\": \"AppleAdvanceVersion1\",\"Features\": {\"Feature\": [\"1284GB RAM\", \"32TB Hard Drive\"]},\"Id\": 104,\"LaptopName\": \"MacProAdvance1\"}")
				.post("http://localhost:8080/laptop-bag/webapi/api/add").statusCode();

		System.out.println("The status code of the laptop" +statusCode);
		
		Assert.assertEquals(statusCode, 200);
		
	}
	
	@Test
	public void getLaptopData(){
		
		String data = given().get(" http://localhost:8080/laptop-bag/webapi/api/all").body().asString();
		
		System.out.println(data);
		
		Assert.assertTrue(data.contains("104"));
	}

}
