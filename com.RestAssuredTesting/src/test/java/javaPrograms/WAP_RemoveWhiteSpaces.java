package javaPrograms;

public class WAP_RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is java";
		
		char[] ch = str.toCharArray();
		
		for(Character ele: ch){
			
			if(ele != ' '){
				
				System.out.print(ele);
			}
		}
		
	}

}
