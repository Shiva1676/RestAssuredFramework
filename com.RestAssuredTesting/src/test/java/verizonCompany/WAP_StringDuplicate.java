/**
 * 
 */
package verizonCompany;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class WAP_StringDuplicate {

	@Test
	public void stringDuplicate() {

		String str = "Welcome to java hello java hello";

		String arr[] = str.split(" ");
		
//		System.out.println(arr.toString());

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String ele : arr) {

			Integer count = map.get(ele);

			if (count == null) {

				map.put(ele, 1);
			} else {

				count = count + 1;

				map.put(ele, count);
			}
		}

		Set<Map.Entry<String, Integer>> set = map.entrySet();

		for (Map.Entry<String, Integer> element : set) {

			if (element.getValue()==1) {

				System.out.println(element.getKey());
			}
		}
	}

}
