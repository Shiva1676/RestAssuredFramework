/**
 * 
 */
package javaInterviewQuestion;

/**
 * @author Lenovo
 *
 */
public class WAP_Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is the time to achieve something in life";

		int c = 0;
		
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			
			if(ch=='a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u'){
				
				System.out.println(ch);
				
				System.out.println("Total count of vowels are:" + " "+ c++);
			}
			
		}

	}

}
