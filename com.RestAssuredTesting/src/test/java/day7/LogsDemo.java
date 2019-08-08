 
package day7;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class LogsDemo {

	@Test
	public void generatingLogs() {

		int statusCode = given().log().all().contentType(ContentType.JSON).accept(ContentType.JSON)
				.body("{\"BrandName\": \"Apple143\",  \"Features\": {\"Feature\": [\"128GB RAM\",\"32TB Hard Drive\"]},\"Id\": 143,\"LaptopName\": \"MacPro143\"}")
				.post("http://localhost:8080/laptop-bag/webapi/api/add").statusCode();

		System.out.println(statusCode);

	}

}
