/**
 * 
 */
package com.rest.api.get;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


/**
 * @author Lenovo
 *
 */
public class TestCase3_GETAPIWithBaseURIAndMultipleAssertion {

	@Test
	public void testAPI() {
		
		RestAssured.baseURI = "http://ergast.com";
		given().log().all()
		.when()
		.get("/api/f1/2017/circuits.json")
		.then()
		.assertThat()
		.statusCode(200)
		.and()
		.contentType(ContentType.JSON)
		.and()
		.header("Content-Length", equalTo(4551));
		
		
	}
	
}
