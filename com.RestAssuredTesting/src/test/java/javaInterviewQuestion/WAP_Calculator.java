/**
 * 
 */
package javaInterviewQuestion;

/**
 * @author Lenovo
 *
 */
public class WAP_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test(10, 20, "+");

		test(10, 5, "%");

		test(10, 5, "/");

	}

	public static void test(int num1, int num2, String str) {

		int num;

		switch (str) {
		case "+":
			num = num1 + num2;
			System.out.println("Addition is:" + num);
			break;

		case "-":
			num = num1 - num2;
			System.out.println("Subtraction is:" + num);
			break;

		case "*":
			num = num1 * num2;
			System.out.println("Multiplication is:" + num);
			break;

		case "/":
			num = num1 - num2;
			System.out.println("Division is:" + num);
			break;
			
		case "%":
			num = num1 % num2;
			System.out.println("Reminder is:" + num);
			break;

		default:
			System.out.println("Invalid symbol");
			break;
		}

	}
}
