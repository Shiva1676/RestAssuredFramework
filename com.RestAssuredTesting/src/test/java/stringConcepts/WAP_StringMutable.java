/**
 * 
 */
package stringConcepts;

/**
 * @author Lenovo
 *
 */
public class WAP_StringMutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("Mohan");
		StringBuffer sb1 = new StringBuffer("Mohan");

		// sb.append("Pallavi");

		// System.out.println(sb);

		if (sb.equals(sb1)) {

			System.out.println("Content matched");
		} else {

			System.out.println("Content is not matched");
		}

	}

}
