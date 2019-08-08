/**
 * 
 */
package day5;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

/**
 * @author Lenovo
 *
 */
public class GetRequestForLaptopBag {

	@Test
	public void getRequestForLaptopBags() {

		RequestSpecification req = given();

		Response res = req.contentType(ContentType.JSON).accept(ContentType.JSON)
				.get("http://localhost:8080/laptop-bag/webapi/api/all");

		int status = res.statusCode();

		System.out.println("The body is:" + res.body().asString());

		System.out.println("The status for the api is:" + status);

	}

}
