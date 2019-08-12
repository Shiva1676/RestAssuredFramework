/**
 * 
 */
package javaPrograms;

/**
 * @author Lenovo
 *
 */
public class WAP_ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 153;

		int temp = num;

		int rem;

		int sum = 0;

		while (temp > 0) {

			rem = temp % 10;

			sum = sum + rem * rem * rem;
			
			temp = temp / 10;

		}

		System.out.println(sum);

	}

}
