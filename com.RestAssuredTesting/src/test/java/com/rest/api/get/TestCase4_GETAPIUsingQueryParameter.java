/**
 * 
 */
package com.rest.api.get;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

/**
 * @author Lenovo
 * This script is all about how to handle Query parameter
 * Created by: Ganesh
 * Created on: 22-02-2020
 */
public class TestCase4_GETAPIUsingQueryParameter {

	
	@Test
	public void tc1_validateValue() {
		
		given()
		.when()
		.get("http://md5.jsontest.com?text=test")
		.then().log().all()
		.assertThat()
		.body("md5", equalTo("098f6bcd4621d373cade4e832627b4f6"));
		
	}
	
	
	@Test
	public void tc2_getAPIUsingQueryParameter() {
		
		int code = given().param("text", "test")
		.when()
		.get("http://md5.jsontest.com")
		.statusCode();
		
		System.out.println("The status code for the test case2 is:" +code);
	}
	
}
