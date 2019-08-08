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
public class PostingDataUsingXML {

	
	@Test
	public void test(){
		
		Laptop laptop = new Laptop();
		
		laptop.setBrandName("DELL");
		laptop.setId("100");
		laptop.setLaptopName("DELLAdvanceModel");
		
		int statusCode = given()
		.contentType(ContentType.XML)
		.accept(ContentType.XML)
		.body(laptop)
		.post("http://localhost:8080/laptop-bag/webapi/api/add")
		.statusCode();
		
		System.out.println("The status code while sending the data:" +statusCode);
		
		
		
	}
	
}
