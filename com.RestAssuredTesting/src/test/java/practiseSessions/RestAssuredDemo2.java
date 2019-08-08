/**
 * 
 */
package practiseSessions;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

/**
 * @author Lenovo
 *
 */
public class RestAssuredDemo2 {

	@Test
	public void test1() {

		RequestSpecification req = given();

		Response res = req.get(
				"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");

		String bodyType = res.body().asString();

		String content = res.contentType();

		String getContent = res.getContentType();

		int statusCode = res.statusCode();

		System.out.println("The body type of API is:" + bodyType);

		System.out.println("The Content type of API is:" + content);

		System.out.println("The getContent type of the API is:" + getContent);

		System.out.println("The Status code of the application is:" + statusCode);
	}

}
