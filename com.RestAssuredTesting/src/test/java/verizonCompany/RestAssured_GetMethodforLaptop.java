/**
 * 
 */
package verizonCompany;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * @author Lenovo
 *
 */
public class RestAssured_GetMethodforLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RequestSpecification req = given();

		Response res = req.contentType(ContentType.JSON).accept(ContentType.JSON)
				.get("http://localhost:8080/laptop-bag/webapi/api/all");

		int status = res.statusCode();

		String data = res.body().asString();

		System.out.println("The body is:" + data);

		System.out.println("The status for the api is:" + status);

		JsonPath path = new JsonPath(data);

//		String BrandName = path.get("$..BrandName");
		
		Object BrandName = path.getJsonObject("BrandName");

		 Object id = path.getJsonObject("Id");
		
		 Object laptopName = path.getJsonObject("LaptopName");

		System.out.println(BrandName);
		
		System.out.println(id);
		
		System.out.println(laptopName);

	}

}
