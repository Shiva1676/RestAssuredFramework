/**
 * 
 */
package day9;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import java.io.File;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

/**
 * @author Lenovo
 *
 */
public class Cookies_Demo {

	String cookieName = "";

	String cookieValue = "";

	@Test
	public void testCookies() {

		String path_data = System.getProperty("user.dir") + "/PostDataFolder/JIRA.json";

		File src = new File(path_data);

		Response res = given().log().all().contentType(ContentType.JSON).body(src)
				.post("http://localhost:8085/rest/auth/1/session");

		String data = res.body().asString();

		System.out.println("Token generated:" + " " + data);

		JsonPath path = new JsonPath(data);

		cookieName = path.get("session.name");

		cookieValue = path.get("session.value");

		System.out.println(cookieName);

		System.out.println(cookieValue);

	}

}
