/**
 * 
 */
package day3;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

/**
 * @author Lenovo
 *
 */
public class AutomateRestDemmo {

	@Test
	public void test1() {

		Response resp = given().get(
				"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");

		String encoding = resp.getHeader("content-encoding");

		String serverInfo = resp.getHeader("server");

		String contentType = resp.getHeader("content-type");

		System.out.println("The content-encoding:" + encoding);

		System.out.println("The server Info:" + serverInfo);

		System.out.println("The content type is:" + contentType);

	}

	@Test
	public void test2() {

		Response resp = given().get(
				"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");

		Headers header = resp.getHeaders();

		List<Header> allInfo = header.asList();

		System.out.println(allInfo);

	}

}
