/**
 * 
 */
package stringConcepts;

/**
 * @author Lenovo
 *
 */
public class WAP_ReplacingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome to java World9";
		
		String replace = str.replaceAll("[^0-9]", "");
		
		System.out.println(replace);
		
		
	}

}
