package coding.practice.hackerrank;

import java.util.LinkedHashMap;
import java.util.Set;

public class Substring {

	public static void main(String[] args) {

		// find duplicate char

		String name = "Subhinurrrs";

		System.out.println(findDupchars(name));

	}

	public static String findDupchars(String input) {

		if (input == null || input.isEmpty()) {
			throw new IllegalArgumentException("please provide value as input");
		}

		if (input.length() == 1) {
			return input;
		}

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (Character c : input.toLowerCase().toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		Set<Character> set = map.keySet();

		StringBuilder sb = new StringBuilder();

		for (Character character : set) {
			if (map.get(character) > 1) {
				sb.append("Character: " + character + "---" + map.get(character) + "\n");
			}
		}

		return sb.toString();
	}

}
