/**
 * 
 */
package javaPrograms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lenovo
 *
 */
public class WAP_FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome to java";

		char[] ch = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character ele : ch) {

			Integer count = map.get(ele);

			if (count == null) {

				map.put(ele, 1);

			} else {

				count = count + 1;

				map.put(ele, count);
			}
		}

		for (Character element : ch) {

			if (map.get(element) == 1) {

				System.out.println(element);

				break;
			}
		}

	}

}
