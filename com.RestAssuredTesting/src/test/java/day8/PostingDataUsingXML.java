/**
 * 
 */
package day8;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 *
 */
public class PostingDataUsingXML {

	@Test
	public void test() {

		Laptop laptop = new Laptop();

		laptop.setBrandName("Lenovo");
		laptop.setId("103");
		laptop.setLaptopName("Lenovo");

		Features feature = new Features();

		List<String> data = new ArrayList<String>();

		data.add("128GB RAM");
		data.add("12TB Hard Drive");

		feature.setList(data);
		laptop.setFeature(feature);

		int statusCode = given().contentType(ContentType.XML).accept(ContentType.XML).body(laptop)
				.post("http://localhost:8080/laptop-bag/webapi/api/add").statusCode();

		System.out.println("The status code while sending the data:" + statusCode);

	}

}
