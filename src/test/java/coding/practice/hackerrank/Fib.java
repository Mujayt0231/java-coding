package coding.practice.hackerrank;

public class Fib {

	public static void main(String[] args) {

		// int fib = fibSequence(10);

		int number = 12;

		// for (int i = 0; i <= number; i++) {
		// System.out.print(fibSequence(i));
		// }

		System.out.println(fib(10));

	}

	// The Fibonacci sequence is a series of numbers in which each number (called a
	// Fibonacci number) is the sum of the two preceding ones, starting from 0 and
	// 1. The sequence typically starts like this:

	// 0,1,1,2,3,5,8,13,21,34

	// F(n) = F(n-1) + F(n-2)

	public static int fibSequence(int num) {

		if (num == 0) {
			return 0;
		}

		if (num == 1) {
			return 1;
		}

		return fibSequence(num - 1) + fibSequence(num - 2);

	}

	public static int fib(int num) {

		if (num == 0) {
			return 0;
		}

		if (num == 1) {
			return 1;
		}

		int a = 0, b = 1;

		for (int i = 2; i <= num; i++) {

			int next = a + b;
			a = b;
			b = next;
		}

		return b;

	}
}
