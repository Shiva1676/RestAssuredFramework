/**
 * 
 */
package zTestingPurpose;

/**
 * @author Lenovo
 *
 */
public class FindingCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Srinivas";
		
		for(int k=0; k<s.length(); k++) {
			
			if(s.charAt(k) == 'i') {
				
				System.out.println("The position of i in the String are:" +k);
			}
			
		}
		
		
	}

}
