/**
 * 
 */
package javaPrograms;

/**
 * @author Lenovo
 *
 */
public class WAP_Permutation {

	public static void main(String[] args) {

		String s = "Sunday";
		StringBuilder temp = new StringBuilder(s);

		for (int i = 0; i < temp.length(); i++) {

			for (int j = i; j <= temp.length(); j++) {

				System.out.println(temp.subSequence(i, j));

				
				  if (temp.subSequence(i, j).length() > 1) {
				  
				  System.out.println(new StringBuilder(temp.subSequence(i,
				  j).toString()).reverse());
				  
				  }
				 

			}
		}
	}

}
