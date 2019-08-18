/**
 * 
 */
package javaInterviewQuestion;

import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class WAP_SwapingTwoNumbers {

	
	@Test(priority=0)
	public void swappingMethod(){
		
		int a = 10; int b = 20;
		
		int c = 0;
		
		c = a;
		
		a = b;
		
		b = c;
		
		System.out.println(a + " "+ b);
	}

	
	@Test
	public void swapWithooutVariable(){
		
		int a = 10, b = 20;
		
		a = a +  b; // a is 30 now
		
		b = a - b; // b is 10 now
		
		a = a - b; // a is 20 now
		
		System.out.println("A value is:" + a);
		
		System.out.println("B Value is:"+ b);
		
		
	}
}
