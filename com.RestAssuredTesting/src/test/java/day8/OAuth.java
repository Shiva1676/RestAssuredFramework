/**
 * 
 */
package day8;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

/**
 * @author Lenovo
 *
 */
public class OAuth {

	@Test
	public void postingTweetInTwitter() {

		String response = given().log().all().auth().oauth("fIGVTiPRZVAHGeQEt74xQU2DB", "zIPEyQJ1BzIWgacahb4gtMyUlZJIdDHGkkvWohuJB2KxqSG5mc",
				"1152212823444873216-ZE3nBnjsxcydWBHiW6YBQpySeGJUUX", "55c5XWVuh87L0GW9CzJqsdFmgexgMaVgOKJFjoBVQftBz")
				.queryParam("status","ThisismyfirsttweetusingPostman")
				.post("https://api.twitter.com/1.1/statuses/update.json").body().asString();
		
		System.out.println(response);

	}

}
