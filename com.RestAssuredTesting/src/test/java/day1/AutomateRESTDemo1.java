/**
 * 
 */
package day1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

/**
 * @author Lenovo
 *
 */
public class AutomateRESTDemo1 {

	@Test 
	public void test1(){
		
		int responseCode = RestAssured.
		given().
		get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22")
	    .statusCode();
		
		System.out.println("Response code" +responseCode);
		
		Assert.assertEquals(responseCode, 200);
		
		
	}

}
