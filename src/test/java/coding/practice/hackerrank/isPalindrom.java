package coding.practice.hackerrank;

public class isPalindrom {

	public static void main(String[] args) {

		System.out.println(isPalindrom("JsssasJ"));
	}

	public static boolean isPalindrom(String input) {

		int inputlengh = input.length();

		for (int i = 0; i < inputlengh / 2; i++) {

			if (input.charAt(i) != input.charAt(inputlengh - i - 1)) {
				return false;
			}

		}

		return true;
	}

}
