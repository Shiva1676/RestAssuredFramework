package dataDrivenTesting;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class PayLoadThroughXML {

	
	@Test
	public void test(){
		
		Laptop lap = new Laptop();
		
		lap.setBrandName("AppleLatest9");
		
		lap.setId("999");
		
		lap.setLaptopName("MacLatest99");
		
		Features feature = new Features();
		
		List<String> data = new ArrayList<String>();

		data.add("128GB RAM");
		data.add("12TB Hard Drive");

		feature.setList(data);
//		lap.setFeatures(feature);
		
	}
}
