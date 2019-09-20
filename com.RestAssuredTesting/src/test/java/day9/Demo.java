package day9;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Demo {

	String OAuthToken = "";

	@Test
	public void generateToken() {

		Response res = given().log().all().formParam("client_id", "nslhub").formParam("client_secret", "nsl@hub1")
				.formParam("grant_type", "password").formParam("username", "kumar@nslhub.com")
				.formParam("password", "raju").post("https://ttf.nslhub.com:8082/nsl-app/oauth/token");

		String data = res.body().asString();

		System.out.println("Token generated:" + " " + data);

		JsonPath path = new JsonPath(data);

		OAuthToken = path.get("access_token");
		
		String token = path.get("token_type");

		System.out.println("Access token generated" + " "+ OAuthToken);

		System.out.println("Token type" + " " +token);
		
	}
}
