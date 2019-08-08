/**
 * 
 */
package day4_Duplicate;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

/**
 * @author Lenovo
 *
 */
public class TestLocalWebApplication extends BaseClass{

	@Test
	public void test() {

		Response data = given().get("laptop-bag/webapi/api/ping/{Mohan}");

		System.out.println(data.body().asString());

	}

}
