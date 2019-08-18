/**
 * 
 */
package javaInterviewQuestion;

/**
 * @author Lenovo
 *
 */
public class WAP_Fibonacci {

	public static void main(String[] args) {

		int a = 0, b = 1;
		
		int temp = 0;
		
		for(int i=0; i<=10; i++){
			
			temp = a + b;
			
			System.out.println(temp);
			
			a = b;
			
			b = temp;
		}
		
	}

}
