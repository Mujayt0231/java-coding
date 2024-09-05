package coding.practice.hackerrank;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FindNth {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 12, 31, 23, 21, 42, 11 };

		System.out.println(findNthLargest(numbers, 5));
	}

	public static int findLargest(int[] num) {

		int[] sortedNums = Arrays.stream(num).sorted().distinct().toArray();

		return sortedNums[sortedNums.length - 1];

	}

	public static int findNthLargest(int[] numbers, int nth) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for (int i : numbers) {

			pq.offer(i);

			if (pq.size() > nth) {
				pq.poll();
			}

		}

		return pq.peek();
	}

}
