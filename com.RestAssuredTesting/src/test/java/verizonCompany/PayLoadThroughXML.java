/**
 * 
 */
package verizonCompany;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 *
 */
public class PayLoadThroughXML {

	
	@Test
	public void PostDataViaXML(){
		
		Laptop laptop = new Laptop();
		
		laptop.setBrandName("Apple111");
		
		laptop.setId("111");
		
		laptop.setLaptopName("MacProAdvance");
		
		Features feature = new Features();
		
		List<String> data = new ArrayList<String>();

		data.add("128GB RAM");
		data.add("64TB Hard Drive");

		feature.setList(data);
		
		laptop.setFeature(feature);
		
		int code = given().log().all()
		.contentType(ContentType.XML)
		.accept(ContentType.XML)
		.body(laptop)
		.post("http://localhost:8080/laptop-bag/webapi/api/add")
		.statusCode();
		
		System.out.println(code);
		
	}
	
}
