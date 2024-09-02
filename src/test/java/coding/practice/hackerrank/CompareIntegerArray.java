package coding.practice.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class CompareIntegerArray {

	public static void main(String[] args) {

		int[] array1 = { 3, 1, 2, 5, 4 };
		int[] array2 = { 2, 4, 3, 1, 5 };

		System.out.println(compareTwoIntArray(array1, array2));

	}

	public static boolean compareTwoIntArray(int[] arr1, int[] arr2) {

		if (arr1.length != arr2.length) {
			return false;
		}

		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();

		for (int i : arr1) {

			map1.put(i, map1.getOrDefault(i, 0) + 1);

		}

		for (int i : arr2) {

			map2.put(i, map2.getOrDefault(i, 0) + 1);

		}

		return map1.equals(map2);

	}

}
