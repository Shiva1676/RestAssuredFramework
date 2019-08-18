/**
 * 
 */
package javaInterviewQuestion;

/**
 * @author Lenovo
 *
 */
public class WAP_ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 153;

		int rem;

		int temp = 0;

		while (num > 0) {

			rem = num % 10;

			temp = temp + rem * rem * rem;

			num = num / 10;
			
//			System.out.println(temp);
		}

		System.out.println(temp);
	}

}
