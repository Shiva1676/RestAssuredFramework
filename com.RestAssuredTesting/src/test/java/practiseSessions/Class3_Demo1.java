/**
 * 
 */
package practiseSessions;

import org.testng.annotations.Test;


import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.util.List;
import java.util.Map;

/**
 * @author Lenovo
 *
 */
public class Class3_Demo1 {

	
	@Test
	public void test(){
		
		RequestSpecification req = given();
		
		Response res = req.get("http://english.tupaki.com/");
		
		String bodyDetails = res.body().asString();
		
		System.out.println("The body details is:"+bodyDetails);
		
		Headers header = res.getHeaders();
		
		Map<String, String> cookies = res.cookies();
		
		int size = cookies.size();
		
		String data = cookies.toString();
		
		List<Header> list = header.asList();
		
		System.out.println("The header details of API:"+list);
		
		System.out.println("Cookies details:"+size +" "+data);
		
		
	}
	
}
