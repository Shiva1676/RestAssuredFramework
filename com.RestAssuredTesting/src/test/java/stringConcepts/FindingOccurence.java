/**
 * 
 */
package stringConcepts;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lenovo
 *
 */
public class FindingOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Programming";

		Map<Character, Integer> map = new HashMap<>();

		char[] ch = str.toCharArray();

		for (Character ele : ch) {

			Integer count = map.get(ele);

			if (count == null) {

				map.put(ele, 1);
			} else {

				count = count + 1;

				map.put(ele, count);

			}
		}

	}

}
