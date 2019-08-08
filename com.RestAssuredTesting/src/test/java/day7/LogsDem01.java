package day7;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class LogsDem01 {

	@Test
	public void generatingLogs() {

		RestAssured.given().log().ifValidationFails().contentType(ContentType.JSON).accept(ContentType.JSON)
				.body("{\"BrandName\": \"Apple131\",  \"Features\": {\"Feature\": [\"128GB RAM\",\"32TB Hard Drive\"]},\"Id\": 131,\"LaptopName\": \"MacPro131\"}")
				.post("http://localhost:8080/laptop-bag/webapi/api/add").then().assertThat().statusCode(400);

		

	}
	
}
