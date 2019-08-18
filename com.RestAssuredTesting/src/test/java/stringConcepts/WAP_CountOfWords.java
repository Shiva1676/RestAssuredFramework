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
public class WAP_CountOfWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Programming";

		// String str = "Hello";

		char[] ch = str.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (Character i : ch) {

			Integer count = map.get(i);

			if (count == null) {

				map.put(i, 1);
			} else {

				count = count + 1;

				map.put(i, count);
			}
		}

		System.out.println(map);
	}

}
