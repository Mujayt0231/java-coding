package coding.practice.hackerrank;

public class ReverseWordInSentence {

	public static void main(String[] args) {

		System.out.println(reverseWordsInSentence("Java and Selenium Interview Solutions"));
		System.out.println(reverseCharactersInSentence("Java and Selenium Interview Solutions"));

	}

	public static String reverseWordsInSentence(String sentence) {

		String[] words = sentence.split(" ");

		if (words.length == 1) {
			return words[0];
		}

		StringBuilder reversed = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {

			reversed.append(words[i]);

			if (i > 0) {
				reversed.append(" ");
			}
		}

		return reversed.toString();

	}

	public static String reverseCharactersInSentence(String input) {

		String[] words = input.split(" ");

		StringBuilder reversed = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {

			reversed.append(new StringBuilder(words[i]).reverse());

			if (i > 0) {
				reversed.append(" ");
			}
		}

		return reversed.toString();
	}

}
