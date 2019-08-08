/**
 * 
 */
package day7;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

/**
 * @author Lenovo
 *
 */
public class PayLoadThroughObjectMappingXML {

	@Test
	public void test(){
		
		Laptop laptop = new Laptop();
		
		laptop.setBrandName("Apple18");
		laptop.setId("18");
		laptop.setLaptopName("AppleSuperLook99");
		
		RestAssured
		.given()
		.contentType(ContentType.XML)
		.accept(ContentType.XML)
		.body(laptop)
		.post("http://localhost:8080/laptop-bag/webapi/api/add")
		.then().assertThat().statusCode(200);
		
	}
	
	
}
