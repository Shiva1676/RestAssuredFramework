/**
 * 
 */
package javaInterviewQuestion;

/**
 * @author Lenovo
 *
 */
public class WAP_MaximumValueInArray {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,7,91,12,57};
		
		for(int i=0; i<arr.length; i++){
			
			for(int j=0; j<arr.length; j++){
				
				if(arr[i]>arr[j]){

					int temp = arr[i];
					
					arr[i] = arr[j];
					
					arr[j] = temp;
					
				}
			}
		}
		
		System.out.println(arr[0]);
	}

}
