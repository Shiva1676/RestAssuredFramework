/**
 * 
 */
package javaInterviewQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Lenovo
 *
 */
public class WAP_UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Stress";

		char[] ele = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character ch : ele) {

			Integer count = map.get(ch);

			if (count == null) {

				map.put(ch, 1);
			} else {

				count = count + 1;

				map.put(ch, count);
			}
		}
		
		Set<Map.Entry<Character, Integer>> set = map.entrySet();

		for (Map.Entry<Character, Integer> values : set) {

			if (values.getValue() == 1) {

				System.out.print(values.getKey() + " ");
			}
		}

	}

}
