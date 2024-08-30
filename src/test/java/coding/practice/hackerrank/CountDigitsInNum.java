package coding.practice.hackerrank;

public class CountDigitsInNum {

	public static void main(String[] args) {

	}

	// input:12345
	// output:5

	public static int countDigits(int number) {

		if (number == 0) {
			return 1;
		}

		if (number < 0) {
			number = -number;
		}

		int count = 0;

		while (number != 0) {
			number = number / 10;
			count = count + 1;
		}

		return count;

	}
}
