/**
 * 
 */
package day7;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

/**
 * @author Lenovo
 *
 */
public class PayLoadThroughExternalFile {

	@Test
	public void testPayLoadThroughExternalFile(){
		
		File src = new File(System.getProperty("user.dir")+"/post.json");
		
		int statusCode = given().log().all()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(src)
		.post("http://localhost:8080/laptop-bag/webapi/api/add")
		.statusCode();
		
		System.out.println(statusCode);
	}
	
}
