/**
 * 
 */
package javaInterviewQuestion;

/**
 * @author Lenovo
 *
 */
public class WAP_PrimeORNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 7;
		
		int temp =0;

		for (int i = 2; i <= 6; i++) {

			if (num % 2 != 0) {

			temp = temp + 1;
				
			}

		}
		
		if(temp>0){
			
			System.out.println("It is a prime number");
		}else{
			
			System.out.println("It is not a prime number");
		}
	}
}
