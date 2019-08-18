/**
 * 
 */
package stringConcepts;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Lenovo
 *
 */
public class WAP_RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Java";

//		String str = "";

		Set<Character> set = new HashSet<>();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < name.length(); i++) {

			Character ch = name.charAt(i);

			if (set.contains(ch)==false) {

				set.add(ch);

//				sb.append(ch);
				System.out.print(ch);
			}

		}
		System.out.println(sb);
	}

}
