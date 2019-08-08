/**
 * 
 */
package day4;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

/**
 * @author Lenovo
 *
 */
public class TestLocalWebApplication extends BaseClass {

	@Test
	public void testLocalService() {

		Response resp = given().get();

		System.out.println(resp.body().asString());

		System.out.println(resp.getStatusCode());

	}

	@Test
	public void testLocalService1() {

		Response resp = given().get();

		System.out.println(resp.body().asString());

		System.out.println(resp.getStatusCode());

	}
}
