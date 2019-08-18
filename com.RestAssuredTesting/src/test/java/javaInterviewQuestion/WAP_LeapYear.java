/**
 * 
 */
package javaInterviewQuestion;

/**
 * @author Lenovo
 *
 */
public class WAP_LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 2016;

		if ((year % 400 == 0) || (year%4==0 && year%100!=0 )) {

			System.out.println("It is an leap year");
		} else {

			System.out.println("It is not an leap year");
		}

	}

}
