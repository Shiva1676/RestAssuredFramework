/**
 * 
 */
package dataDrivenTesting;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

/**
 * @author Lenovo
 *
 */

// @XmlRootElement(name = "Laptop")
public class PostingDataUsingJsonObject {

	@Test
	public void postingData() {

		JSONObject json = new JSONObject();

		json.put("BrandName", "Lenovo");

		json.put("Id", 143);

		json.put("LaptopName", "AdvanceVersion");

		JSONObject nested = new JSONObject();

		ArrayList<Object> child_array = new ArrayList<Object>();

		child_array.add("128GB RAM");

		child_array.add("8TB Hard Drive");

		nested.put("Feature", child_array);

		json.put("Features", nested);

		given().log().all().contentType(ContentType.JSON).accept(ContentType.JSON).body(json)
				.post("http://localhost:8080/laptop-bag/webapi/api/add").then().assertThat().statusCode(200);

	}
}
