package coding.practice.hackerrank;

public class FibonacciSeries {

	public static void main(String[] args) {

		fibTillNth(10);

	}

	// Write a Java program for generating the nth Fibonacci Number using loop

	public static void fibTillNth(int nthFib) {
		for (int i = 0; i <= nthFib; i++) {
			System.out.print(nthFibRecursive(i) + " ");
		}
	}

	public static int nthFib(int nth) {

		if (nth < 0) {
			throw new IllegalArgumentException("Inpust must be a non-negative integer.");
		}

		int a = 0;
		int b = 1;

		if (nth == 0) {
			return a;
		} else if (nth == 1) {
			return b;
		}

		for (int i = 2; i <= nth; i++) {
			int next = a + b;
			a = b;
			b = next;
		}

		return b;
	}

	public static int nthFibRecursive(int nth) {

		if (nth < 0) {
			throw new IllegalArgumentException("input must be non-negative integar.");
		}

		if (nth == 0) {
			return 0;
		}

		if (nth == 1) {
			return 1;
		}

		return nthFib(nth - 1) + nthFib(nth - 2);

	}

}
