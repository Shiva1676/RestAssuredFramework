/**
 * 
 */
package javaPrograms;

import java.util.Arrays;

/**
 * @author Lenovo
 *
 */
public class WAP_StringAnagram {

	public static void main(String[] args) {

		String str1 = "java";

		String str2 = "ajav";

		char[] characterArray1 = str1.toCharArray();

		char[] characterArray2 = str2.toCharArray();

		Arrays.sort(characterArray1);

		Arrays.sort(characterArray2);

		boolean status = Arrays.equals(characterArray1, characterArray2);

		System.out.println(status);

	}

}
