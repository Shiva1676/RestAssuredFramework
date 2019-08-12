/**
 * 
 */
package javaPrograms;

/**
 * @author Lenovo
 *
 */
public class WAP_Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 7, 91, 12, 57 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] < arr[j + 1]) {

					int temp = arr[j];

					arr[j] = arr[j + 1];

					arr[j + 1] = temp;
				}
			}
		}

		for (int k = 0; k < arr.length; k++) {

			System.out.print(arr[k] + " ");

		}
		
		System.out.println();

		System.out.println(arr[0]);
	}

}
