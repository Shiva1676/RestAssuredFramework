/**
 * 
 */
package day8;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

/**
 * @author Lenovo
 *
 */
public class OAuth_Get {
	
	@Test
	public void postingTweetInTwitter() {

		Response response = given().log().all().auth().oauth("fIGVTiPRZVAHGeQEt74xQU2DB", "zIPEyQJ1BzIWgacahb4gtMyUlZJIdDHGkkvWohuJB2KxqSG5mc",
				"1152212823444873216-ZE3nBnjsxcydWBHiW6YBQpySeGJUUX", "55c5XWVuh87L0GW9CzJqsdFmgexgMaVgOKJFjoBVQftBz")
				.get("https://api.twitter.com/1.1/statuses/user_timeline.json?count=5");
		
		System.out.println(response.body().asString());

	}
}
