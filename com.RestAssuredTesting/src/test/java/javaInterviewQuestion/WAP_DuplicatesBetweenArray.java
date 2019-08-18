/**
 * 
 */
package javaInterviewQuestion;

/**
 * @author Lenovo
 *
 */
public class WAP_DuplicatesBetweenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,4,7, 9, 2};
		
		int arr1[] = {1,7,3,4,5};
		
		for(int i=0; i<arr.length; i++){
			
			for(int j=0; j<arr1.length; j++){
				
				if(arr[i] == arr1[j]){
					
					System.out.print(arr[i] + " ");
				}
			}
		}
		
	}

}
