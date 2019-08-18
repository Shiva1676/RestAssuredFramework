/**
 * 
 */
package javaInterviewQuestion;

/**
 * @author Lenovo
 *
 */
public class WAP_ReverseStringDemo {

	public static void main(String[] args) {

		String str = "World";
		
		for (int i = str.length() - 1; i >= 0; i--) {

			char ch = str.charAt(i);
			
			System.out.print(ch);
			
		}

	}

}
