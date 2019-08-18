/**
 * 
 */
package stringMethods;

/**
 * @author Lenovo
 *
 */
public class WAP_SubStringMethod {

	public static void main(String[] args) {

		String str = "This is for testing purpose only99";
		
		String str1 = "12abcd|?@!";

		System.out.println(str.substring(12));

		System.out.println(str.substring(12, 27));

		// System.out.println(str.replaceAll("[^a-zA-Z]", ""));

		System.out.println(str.replaceAll("\\D", ""));
		
		System.out.println(str1.replaceAll("[^a-zA-Z0-9]", ""));

	}

}
