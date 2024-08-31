package coding.practice.hackerrank;

public class Pyramid {

	public static void main(String[] args) {

		pyramidWithNumOfRow(9);

	}

	public static void pyramidWithNumOfRow(int row) {

		int start = 1;

		for (int i = 1; i <= row; i++) {

			for (int j = i; j < row; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(start + " ");
				start++;
			}

			System.out.println();

		}

	}

}
