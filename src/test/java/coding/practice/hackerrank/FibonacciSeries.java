package coding.practice.hackerrank;

public class FibonacciSeries {

	public static void main(String[] args) {

		try {

			System.out.println(nthFib(6));
			
		} catch (IllegalArgumentException e) {
			System.err.print("Exception: " + e.getMessage());
		}

	}

	// Write a Java program for generating the nth Fibonacci Number using loop

	public static int nthFib(int nth) {

		if (nth < 0) {
			throw new IllegalArgumentException("Inpust must be a non-negative integer.");
		}

		int a = 0;
		int b = 1;

		if (nth == a) {
			return a;
		} else if (nth == b) {
			return b;
		}

		for (int i = 2; i <= nth; i++) {
			int next = a + b;
			a = b;
			b = next;
		}

		return b;
	}

}
