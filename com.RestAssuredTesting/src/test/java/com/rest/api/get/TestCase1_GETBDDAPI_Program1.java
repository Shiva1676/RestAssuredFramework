/**
 * 
 */
package com.rest.api.get;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

/**
 * @author Lenovo
 *
 */

// Rest Assured Commands
/*given()
when()
then()
and()*/

public class TestCase1_GETBDDAPI_Program1 {
	
	@Test
	public void getAPITest() {
		
		// In this test case we have used Hamcrest library for validation 
		
		given().log().all()
	   .when()
	   .get("http://ergast.com/api/f1/2017/circuits.json")
	   .then().log().all()
	   .assertThat()
	   .body("MRData.CircuitTable.Circuits.circuitId", hasSize(20));
		
	}
	
	@Test
	public void getAPITestUsingTestNGAssertion() {
		
		// Using TestNG we have validated the body response
		
		Response res = given()
		.when().log().all()
		.get("http://ergast.com/api/f1/2017/circuits.json");
		
		int status = res.statusCode();
		
		Assert.assertEquals(200, status);
		
		System.out.println("The status code of the API is:"+ status);
		
	}
	
	
	
}
