/**
 * 
 */
package demo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

/**
 * @author Lenovo
 *
 */
public class PayLoadThroghXML {

	@Test
	public void test() {

		Laptop laptop = new Laptop();

		laptop.setBrandName("IBM");

		laptop.setId("665");

		laptop.setLaptopName("IBMPro");

		int code = given().log().all().contentType(ContentType.XML).accept(ContentType.XML).body(laptop)
				.post("http://localhost:8080/laptop-bag/webapi/api/add").statusCode();

	}

}
