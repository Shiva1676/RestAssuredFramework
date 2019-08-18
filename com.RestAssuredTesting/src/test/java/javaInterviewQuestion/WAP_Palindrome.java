package javaInterviewQuestion;

public class WAP_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Mom";
		
		String temp = "";
		for(int i=0; i<str.length(); i++){
			
			temp = temp + str.charAt(i);
		}
		
		if(temp.equals(str)){
			
			System.out.println("It is an Palindrome");
		}else{
			
			System.out.println("It is not an Palindrome");
		}
	}

}
