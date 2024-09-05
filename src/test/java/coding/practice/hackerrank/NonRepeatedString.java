package coding.practice.hackerrank;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class NonRepeatedString {

	public static void main(String[] args) {

		System.out.println(firstNonRepeatedString("aaaxdass"));

	}

	public static char firstNonRepeatedString(String input) {

		if (input == null) {
			throw new IllegalArgumentException("come on, put a string there!");
		}

		char[] strToCharArr = input.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		// first- the ordering is important - non-sorted
		// how do we count each character?
		// in the sequence the character that only has count of 1 will be the first
		// non-repeated

		for (char c : strToCharArr) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		Set<Character> characterSet = map.keySet();

		for (Character character : characterSet) {
			if (map.get(character) == 1) {
				return character;
			}
		}

		return '\0';
	}

}
