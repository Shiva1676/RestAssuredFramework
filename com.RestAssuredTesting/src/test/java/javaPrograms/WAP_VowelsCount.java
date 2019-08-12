/**
 * 
 */
package javaPrograms;

/**
 * @author Lenovo
 *
 */
public class WAP_VowelsCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Alive is awesome";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {

				System.out.println(ch + " "  + count++);
				
			}
		}

		
		System.out.println("==================================");
		
		System.out.println();;
		
		System.out.println(count++);
	}

}
