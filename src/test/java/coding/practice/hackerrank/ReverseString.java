package coding.practice.hackerrank;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println(reversedStringWithStringBuilder("John"));

	}

	public static String reversedStringWithStringBuilder(String input) {

		char[] stringToChar = input.toCharArray();

		StringBuilder sb = new StringBuilder();

		for (int i = stringToChar.length - 1; i >= 0; i--) {

			sb.append(stringToChar[i]);

		}

		return sb.toString();
	}
	
	
	
	
	

}
