/**
 * 
 */
package day3_ResponseSpecBuilderAndPostAPI;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpecBuilderTest {

	ResponseSpecBuilder response = new ResponseSpecBuilder();

	ResponseSpecification respSpec = response.expectContentType(ContentType.JSON).expectStatusCode(200).build();

	@Test
	public void reponseSpecBuilderTest() {

		RestAssured.baseURI = "https://gorest.co.in/";
		
		given()
		 .header("Authorization" , "Bearer fKSHO8AAN7QIn0COT1dsbgXOx7Yg2RCdpNVX")
		 .when()
		 .get("/public-api/users") 
		 .then().log().all()
		 .assertThat()
		 .spec(respSpec);
		 

	}

}
