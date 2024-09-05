package coding.practice.hackerrank;

public class ReverseCharacterInString {

	public static void main(String[] args) {

		System.out.println(reverseString("Test"));

	}

	public static String reverseString(String input) {

		if (input == null || input.trim().isEmpty()) {
			return "";
		}

		char[] array = input.toCharArray();

		int left = 0;
		int right = array.length - 1;

		while (left < right) {

			char temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;

		}

		return new String(array);

	}

}
