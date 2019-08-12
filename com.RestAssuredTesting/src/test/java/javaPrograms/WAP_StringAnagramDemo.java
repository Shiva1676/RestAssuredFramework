/**
 * 
 */
package javaPrograms;

import java.util.Arrays;

/**
 * @author Lenovo
 *
 */
public class WAP_StringAnagramDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "java";

		String str = "aajv";
		
		char[] array1 = s.toCharArray();
		
		char[] array2 = str.toCharArray();
		
		Arrays.sort(array1);
		
		Arrays.sort(array2);
		
		boolean status = Arrays.equals(array1, array2);
		
		System.out.println(status);
	}

}
