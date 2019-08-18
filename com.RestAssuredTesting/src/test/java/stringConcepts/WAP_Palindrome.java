/**
 * 
 */
package stringConcepts;

/**
 * @author Lenovo
 *
 */
public class WAP_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "MOM";

		String str = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			str = str + name.charAt(i);
		}

		if (str.equals(name)) {

			System.out.println("It is an palindrome");
		} else {

			System.out.println("It is not an palindrome");
		}
	}

}
