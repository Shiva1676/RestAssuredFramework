/**
 * 
 */
package day6_Duplicate;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

/**
 * @author Lenovo
 *
 */
public class JsonXpathExpression {

	@Test
	public void verifyGoogleMap(){
		
		int code = given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body("{\"BrandName\": \"Apple\",\"Features\": {\"Feature\": [\"1284GB RAM\", \"32TB Hard Drive\"]},\"Id\": 109,\"LaptopName\": \"MacPro\"}")
		.post("http://localhost:8080/laptop-bag/webapi/api/add").statusCode();	
		
	System.out.println("The code of data adding:" +code);
		
	}
	
}
