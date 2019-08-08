package day9;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class OAuth2 {

	@Test
	public void testEndPoint() {

		Response response = given().post("http://coop.apps.symfonycasts.com/api/361/eggs-count");

		System.out.println(response.statusCode());

		System.out.println(response.body().asString());

		System.out.println(response.getTime());
	}

}
