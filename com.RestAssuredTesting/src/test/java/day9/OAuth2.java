package day9;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class OAuth2 {

	String OAuthToken = "a03cbeec8ffd7995a192e5a3fa4e022d57451319";

	@Test
	public void testEndPointWithOutToken() {

		Response response = given().post("http://coop.apps.symfonycasts.com/api/361/eggs-count");

		String data = response.body().asString();

		System.out.println(response.statusCode());

		System.out.println(data);

		JsonPath path = new JsonPath(data);

		String validation = path.get("error");

		Assert.assertEquals(validation, "access_denied", "Test Failed because validation are not matched");

		System.out.println(response.getTime());
	}

	@Test
	public void testEndPointWithToken() {

		Response response = given().auth().oauth2(OAuthToken)
				.post("http://coop.apps.symfonycasts.com/api/361/eggs-count");

		String data = response.body().asString();

		System.out.println(response.statusCode());

		System.out.println(data);

		System.out.println(response.getTime());

		JsonPath path = new JsonPath(data);

		String validation = path.get("success");

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
