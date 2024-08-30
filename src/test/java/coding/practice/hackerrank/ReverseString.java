package coding.practice.hackerrank;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println(reversedStringWithStringBuilder("John"));

		String name = "testjava";

		char[] strToChar = name.toCharArray();

		for (int i = strToChar.length - 1; i >= 0; i--) {
			System.out.print(strToChar[i]);
		}

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
