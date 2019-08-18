/**
 * 
 */
package javaInterviewQuestion;

/**
 * @author Lenovo
 *
 */
public class WAP_MultiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 2;

		int temp;

		for (int i = 1; i <= 10; i++) {

			temp = num * i;

			System.out.println(num + "" + " * " + "" + i + " = " + temp);
		}

	}

}
