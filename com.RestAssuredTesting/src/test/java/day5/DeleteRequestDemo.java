/**
 * 
 */
package day5;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

/**
 * @author Lenovo
 *
 */
public class DeleteRequestDemo {

	@Test
	public void deleteLaptop() {

		int code = given().delete("http://localhost:8080/laptop-bag/webapi/api/delete/105").statusCode();

		System.out.println("Response for positive Test" + code);

		Assert.assertEquals(code, 200);

	}
	

	@Test
	public void deleteNonExistingLaptop() {

		int code = given().delete("http:/localhost:8080/laptop-bag/webapi/api/delete/105").statusCode();

		System.out.println("Response for positive Test" + code);

		Assert.assertEquals(code, 200);

	}

}
