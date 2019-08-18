package javaInterviewQuestion;

public class CharaFindNumber {
	public static void main(String[] args) {
		String s = "srinivas";
		for (int k = 0; k < s.length(); k++) {
			if (s.charAt(k) == 'i') {
				System.out.println("i position in string is " + k);
			}
		}
	}
}
