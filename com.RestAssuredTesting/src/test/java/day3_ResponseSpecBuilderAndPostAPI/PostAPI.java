/**
 * 
 */
package day3_ResponseSpecBuilderAndPostAPI;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
/**
 * @author Lenovo This script is all about how to send the data through post
 *         call Created by: Ganesh Created on: 29-02-2020
 */
public class PostAPI {

	@Test
	public void testPostAPI() {

		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		given().contentType(ContentType.JSON).body("{\"username\" : \"admin\", \"password\" : \"password123\"}").when()
				.log().all().post("/auth").then().log().all().assertThat().statusCode(200);

	}

	@Test
	public void testPostAPIUsingJsonFile() {

		RestAssured.baseURI = "https://restful-booker.herokuapp.com";

		Object tokenID = given().contentType(ContentType.JSON).body(new File(System.getProperty("user.dir") + "/Credentials.json"))
				.when().log().all().post("/auth").then().log().all().extract().path("token");
		
		System.out.println(tokenID);
		
		Assert.assertNotNull(tokenID);
		
		

	}
	
	@Test
	public void reteriveTokenID() {
		
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		
		String data = given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(new File(System.getProperty("user.dir")+"/Credentials.json"))
		.post("/auth").asString();
		
		JsonPath path = new JsonPath(data);
		
		Object tokenID = path.get("token");
		
		System.out.println("The tokenID is:" + tokenID);
		
	}
	

}
