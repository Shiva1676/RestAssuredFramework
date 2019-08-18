/**
 * 
 */
package stringConcepts;

/**
 * @author Lenovo
 *
 */
public class WAP_ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Java";
		
		System.out.println(name.length());
		
		String temp = "";
		
		for(int i=name.length()-1; i>=0; i--){
			
			temp = temp + name.charAt(i);
		}
		
		System.out.println(temp);
	}

}
