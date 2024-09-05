package coding.practice.hackerrank;

import java.util.PriorityQueue;

public class FoundNthLargestCustom {

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

}
