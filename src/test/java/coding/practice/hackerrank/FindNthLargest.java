package coding.practice.hackerrank;

import java.util.Arrays;

public class FindNthLargest {

	public static void main(String[] args) {

		System.out.println("the largest number in array: " + findLargestNumber(null));

	}

	public static int findLargestNumber(int[] numbers) {

		// let's say this is an unsorted array

		int[] sortedArray = Arrays.stream(numbers).distinct().sorted().toArray();

		return sortedArray[sortedArray.length - 1];
	}

}
