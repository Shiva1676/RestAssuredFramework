/**
 * 
 */
package day1;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * @author Lenovo
 *
 */
public class AutomateRESTDemo2 {

	@Test
	public void test1() {

		/*
		 * int responseCode = given(). get(
		 * "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22")
		 * .statusCode();
		 * 
		 * System.out.println("Response code" +responseCode);
		 * 
		 * Assert.assertEquals(responseCode, 200);
		 */

		RequestSpecification req = given();

		Response res = req.get(
				"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");

		int statusCode = res.statusCode();

		System.out.println(statusCode);

		String str = res.asString();

		System.out.println(str);
		
		String respBody = res.body().asString();
		
		System.out.println("The body of the content:"+respBody);
		
		
		long responseTime = res.getTime();
		
		System.out.println("The response time of the application is:"+responseTime);

		String contentType = res.getContentType();
		
		System.out.println("The content type of the application is:"+ contentType);
		
	}
	
	
	@Test
	public void test2(){
		
		String resp = RestAssured.given().get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").body().asString();
		
		System.out.println("The body of the response is:"+resp);
		
		
	}

}
