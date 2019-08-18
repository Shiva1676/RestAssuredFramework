/**
 * 
 */
package javaInterviewQuestion;

/**
 * @author Lenovo
 *
 */
public class WAP_FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcdb";

		char[] ch = str.toCharArray();

		int len = str.length();
		
//		System.out.println(len);
		
		for(int i=0; i<len; i++){
			
			for(int j=i+1; j<len; j++){
				
				if(ch[i] == ch[j]){
					
					System.out.println(ch[i]);
					
					break;
				}
			}
		}
		
	}

}
