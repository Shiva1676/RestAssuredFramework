/**
 * 
 */
package verizonCompany;

import org.testng.annotations.Test;

import junit.framework.Assert;

import static io.restassured.RestAssured.*;

/**
 * @author Lenovo
 *
 */
public class RestAssured_GetMethod {

	@Test
	public void verifyGetMethod() {

		int statusCode = given()
				.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22")
				.statusCode();
		
		System.out.println(statusCode);

		Assert.assertEquals(400, statusCode);

	}

}
