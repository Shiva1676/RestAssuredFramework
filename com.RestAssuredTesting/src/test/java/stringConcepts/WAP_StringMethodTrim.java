/**
 * 
 */
package stringConcepts;

import java.util.Scanner;

/**
 * @author Lenovo
 *
 */
public class WAP_StringMethodTrim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your city name:");
		
		String name = sc.nextLine();
		
		if(name.equals("Hyderabad")){
			
			System.out.println("Hello Hyderadi, Aadaab");
			
		}else if(name.equals("Chennai")){
			
			System.out.println("Hello Madrasi, Vanakkam");
			
		}else if(name.equals("Banglore")){
			
			System.out.println("Hello Kannadiga, Namaskara");
		}else {
			
			System.out.println("Please enter a valid city name");
			
		}
		
	}

}
