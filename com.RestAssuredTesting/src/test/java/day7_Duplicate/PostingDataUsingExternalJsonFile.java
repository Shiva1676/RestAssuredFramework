/**
 * 
 */
package day7_Duplicate;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

/**
 * @author Lenovo
 *
 */
public class PostingDataUsingExternalJsonFile {

	@Test
	public void postingData(){
		
		File src = new File(System.getProperty("user.dir")+ "/PostDataFolder/post.json");
		
		int code = given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(src)
		.post("http://localhost:8080/laptop-bag/webapi/api/add")
		.statusCode();
		
		System.out.println("The data of code is:"+code);
		
	}
	
}
