package day4_Duplicate;

import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

public class BaseClass_Authetications {

	@BeforeSuite
	public void setUp(){
		
		baseURI = "http://restapi.demoqa.com";
		
	}
	
}
