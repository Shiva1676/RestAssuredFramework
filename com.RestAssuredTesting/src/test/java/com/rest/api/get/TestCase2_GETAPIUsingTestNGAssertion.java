package com.rest.api.get;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestCase2_GETAPIUsingTestNGAssertion {

	@Test
	public void checkAPIUsingTestAssertion() {

		Response res = given().when().log().all().get("http://ergast.com/api/f1/2017/circuits.json");

		String printingBodyResponse = res.prettyPrint();

		// We can write in different way

		/* System.out.println(res.body().asString()); */

		System.out.println("The response of the body is:" + printingBodyResponse);

		int code = res.statusCode();

		Assert.assertEquals(200, code);

	}

}
