package coding.practice.hackerrank;

public class SwapTwp {

	public static void main(String[] args) {

		int a = 3;
		int b = 5;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a: " + a);
		System.out.println("b: " + b);

	}

}
