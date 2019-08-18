/**
 * 
 */
package javaInterviewQuestion;

import java.util.Arrays;

/**
 * @author Lenovo
 *
 */
public class WAP_AnagramStrings {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String temp = "Java";
		
		char ch[] = temp.toCharArray();
		
		String temp1 = "aavJ";
		
		char ch1[] = temp1.toCharArray();
		
		Arrays.sort(ch);
		
		Arrays.sort(ch1);
		
		boolean status = Arrays.equals(ch, ch1);
		
		System.out.println(status);
		
		
	}

}
