package coding.practice.hackerrank;

public class IsPalindrom {

	public static void main(String[] args) {

		System.out.println(isPalindrom("JsssasJ"));
		System.out.println(isPalindrom("sssaassas"));
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

	public static boolean plaindrominnit(String s) {

		if (s.isEmpty() || s == "") {
			return false;
		}

		char[] chars = s.toCharArray();

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {

			if (chars[left] != chars[right]) {

				return false;
			}

			left++;
			right++;

		}

		return true;

	}

}
