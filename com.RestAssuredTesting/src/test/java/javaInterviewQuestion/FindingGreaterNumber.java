/**
 * 
 */
package javaInterviewQuestion;

/**
 * @author Lenovo
 *
 */
public class FindingGreaterNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 100, b = 200, c = 300;

		if (a > b && a > c) {
			System.out.println("a is greater");
		} else if (b > c) {

			System.out.println("b is greater");
		} else {

			System.out.println("c is greater");
		}

	}

}
