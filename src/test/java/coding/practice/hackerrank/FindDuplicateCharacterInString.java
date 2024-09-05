package coding.practice.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateCharacterInString {

	public static void main(String[] args) {
		System.out.println(duplicateCharCount("JavaJ2EE"));
		findDupchar("JavaJ2EE");
	}

	public static String duplicateCharCount(String input) {

		char[] stringAsChar = input.toLowerCase().toCharArray();

		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		for (char c : stringAsChar) {

			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);

		}

		StringBuilder sb = new StringBuilder();

		for (Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				sb.append("Character: " + entry.getKey() + "----" + entry.getValue() + "\n");
			}
		}

		return sb.toString();
	}

	public static void findDupchar(String input) {

		char[] stringAschar = input.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : stringAschar) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("character: " + entry.getKey() + "-----" + entry.getValue());
			}
		}
	}

}
