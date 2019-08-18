/**
 * 
 */
package javaInterviewQuestion;

/**
 * @author Lenovo
 *
 */
public class WAP_RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String str = "Welcome to java";
		
//		char ch[] = str.toCharArray();
		
		for(int i=0; i<str.length(); i++){
			
			char ele = str.charAt(i);
			
			if(ele!=' '){
				
				System.out.print(ele);
			}
		}

	}

}
