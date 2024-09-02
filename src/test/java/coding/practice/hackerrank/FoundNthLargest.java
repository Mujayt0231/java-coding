package coding.practice.hackerrank;

import java.util.Arrays;

public class FoundNthLargest {

	public static void main(String[] args) {

		int[] array = { 4, 2, 3, 4, 1, 2, 5 };

		System.out.println(foundnthlargest(array, 4));
		;

	}

	public static int foundnthlargest(int[] num, int nthNum) {

		int[] sortedArr = Arrays.stream(num).distinct().sorted().toArray();

		return sortedArr[(sortedArr.length) - nthNum];

	}

}
