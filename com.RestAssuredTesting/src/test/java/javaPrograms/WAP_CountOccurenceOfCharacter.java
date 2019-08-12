/**
 * 
 */
package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Lenovo
 *
 */
public class WAP_CountOccurenceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome to java";

		char[] ch = str.toCharArray();

		// Set<Character> set = new HashSet<Character>();

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

		Set<Map.Entry<Character, Integer>> set = map.entrySet();

		for (Map.Entry<Character, Integer> values : set) {

			if (values.getValue()> 0) {

				System.out.println(values.getKey() + " " + values.getValue());
			}
		}

	}

}
