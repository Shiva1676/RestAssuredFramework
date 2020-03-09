package com.rest.api.get;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

public class TestCase5_GETAPIWithMultipleValuesUsingDataProvider {
	
	@Test(dataProvider = "Data")
	public void testAPIWithDifferentSetOfValues(String seasonYear, int value) {
		
		given()
	   .pathParam("raceSeason", seasonYear)
	   .when()
	   .get("http://ergast.com/api/f1/{raceSeason}/circuits.json")
	   .then().log().all()
	   .assertThat()
	   .body("MRData.CircuitTable.Circuits.circuitId", hasSize(value));
		
	}

	@DataProvider(name= "Data")
	public Object[][] getCircuitYearInfo(){
		
		return new Object[][] {
			
			{"2017", 20},
			{"2016", 21},
			{"1966", 9}
			
		};
	}
	
}
