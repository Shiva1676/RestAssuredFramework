package javaPrograms;

public class WAP_InsertElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pos = 3;
		
		int ele = 100;
		
		int arr[] = {10, 20, 30, 40, 50, 60};
		
		for(int i=arr.length-1; i>pos-1; i--){
			
			arr[i] = arr[i-1];
		}
		
		 arr[pos-1] = ele;
		 
		 for(int i=0; i<arr.length; i++){
			 
			 System.out.print(arr[i] + " ");
		 }
	}

}
