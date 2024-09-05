package coding.practice.hackerrank;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FoundNthLargestCustom {

	public static void main(String[] args) {

		int[] numbers = { 12, 4, 5, 2, 41, 2, 0, 1, 2, 3, 51, 41 };

		System.out.println(findThirddLargestNum(numbers));

	}

	public static int findNthLargestNumber(int[] numbers, int num) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for (int number : numbers) {

			pq.offer(number);

			if (pq.size() > num) {
				pq.poll();
			}
		}

		return pq.peek();
	}

	public static int findSecondLargestNum(int[] numbers) {
		int[] sortedNums = Arrays.stream(numbers).distinct().sorted().toArray();

		return sortedNums[(sortedNums.length - 1) - 1];

	}

	public static int findThirddLargestNum(int[] numbers) {
		int[] sortedNums = Arrays.stream(numbers).distinct().sorted().toArray();

		return sortedNums[(sortedNums.length - 1) - 2];

	}

}
