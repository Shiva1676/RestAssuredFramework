/**
 * 
 */
package javaInterviewQuestion;

/**
 * @author Lenovo
 *
 */
public class WAP_Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5;

		int temp = 1;

		for (int i = num; i > 0; i--) {

			temp = temp * i;
		}
		System.out.println(temp);
	}

}
