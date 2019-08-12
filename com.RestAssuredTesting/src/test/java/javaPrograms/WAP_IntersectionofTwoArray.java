/**
 * 
 */
package javaPrograms;

/**
 * @author Lenovo
 *
 */
public class WAP_IntersectionofTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = { 1, 4, 7, 9, 2 };
		
		int arrray2[] = { 1, 7, 3, 4, 5 };

		for (int i = 0; i < array1.length; i++) {

			for (int j = 0; j < arrray2.length; j++) {

				if (array1[i] == arrray2[j]) {

					System.out.print(array1[i] + " ");
				}
			}
		}
	}

}
