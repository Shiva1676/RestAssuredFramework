/**
 * 
 */
package stringMethods;

/**
 * @author Lenovo
 *
 */
public class WAP_RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Welcome to java world";
		
		String s1 = "Welcome to jav!!a233 world999@@@";

		String str = s.replaceAll("\\s", "-");

		System.out.println(str);

		// System.out.println(str.concat("9"));

		/* System.out.println(s.replaceAll("\\s", "-"));
		
		System.out.println(s1.replaceAll("\\d", ""));
		
		System.out.println(s1.replaceAll("\\w", ""));*/
		
		
		String[] strr = s.split("\\s");
		
		for(String ele: strr){
			
			System.out.println(ele);
		}
		
		String[] digit = s1.split("\\d");
		
	
		for(String digit_Ele: digit){
			
			System.out.println(digit_Ele);
		}

	}

}
