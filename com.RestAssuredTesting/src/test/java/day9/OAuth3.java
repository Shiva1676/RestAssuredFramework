package day9;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class OAuth3 {

	String OAuthToken = "";

	@Test(priority = 0)
	public void generateToken() {

		Response res = given().log().all().formParam("client_id", "RestAssuredAPI_OAUTH2.0_Aug")
				.formParam("client_secret", "27b8b4c22af7c0d5d39f7e2b7fa5d9a6")
				.formParam("grant_type", "client_credentials").post("http://coop.apps.symfonycasts.com/token");

		String data = res.body().asString();

		System.out.println("Token generated" + data);

		JsonPath path = new JsonPath(data);

		OAuthToken = path.get("access_token");

		System.out.println("Access token generated" + " " + OAuthToken);

	}

	@Test(priority = 1)
	public void testEndPointWithOutToken() {

		Response response = given().log().all().post("http://coop.apps.symfonycasts.com/api/361/eggs-count");

		String data = response.body().asString();

		System.out.println(response.statusCode());

		System.out.println(data);

		JsonPath path = new JsonPath(data);

		String validation = path.get("error");

		Assert.assertEquals(validation, "access_denied", "Test Failed because validation are not matched");

		System.out.println(response.getTime());
	}

	@Test(priority = 2)
	public void testEndPointWithToken() {

		Response response = given().log().all().auth().oauth2(OAuthToken)
				.post("http://coop.apps.symfonycasts.com/api/361/eggs-count");

		String data = response.body().asString();

		System.out.println(response.statusCode());

		System.out.println(data);

		System.out.println(response.getTime());

		JsonPath path = new JsonPath(data);

		String validation = path.get("success").toString();

		Assert.assertEquals(validation, "true", "Test Failed because validation are not matched");

	}

	@Test
	public void testEndPointWithToken1() {

		// For this URL(Chicken feed) we haven't given permissions

		Response response = given().auth().oauth2(OAuthToken)
				.post("http://coop.apps.symfonycasts.com/api/361/chickens-feed");

		System.out.println(response.statusCode());

		System.out.println(response.body().asString());

		System.out.println(response.getTime());
	}

}
