/**
 * 
 */
package javaInterviewQuestion;

/**
 * @author Lenovo
 *
 */
public class WAP_PermutationsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Monday";

		StringBuffer temp = new StringBuffer(str);

		for (int i = 0; i < str.length(); i++) {

			for (int j = i; j <= str.length(); j++) {

				System.out.println(temp.subSequence(i, j));
				if (temp.subSequence(i, j).length() > 1) {

					System.out.println(new StringBuilder(temp.subSequence(i, j).toString()).reverse());
				}
			}
		}

	}

}
