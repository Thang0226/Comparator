package square;

import java.util.Arrays;

public class SquareTest {
	public static void main(String[] args) {
		Square[] list = new Square[4];
		list[0] = new Square();
		list[1] = new Square(4.3);
		list[2] = new Square(3.5, "orange", true);
		list[3] = new Square(3, "yellow", false);

		System.out.println("Before sorting by side:");
		for (Square square : list) {
			System.out.println(square);
		}
		Arrays.sort(list, new SquareComparatorBySide());
		System.out.println("After sorting by side:");
		for (Square square : list) {
			System.out.println(square);
		}

		System.out.println();
		System.out.println("Before sorting by color:");
		for (Square square : list) {
			System.out.println(square);
		}
		Arrays.sort(list, new SquareComparatorByColor());
		System.out.println("After sorting by color:");
		for (Square square : list) {
			System.out.println(square);
		}
	}
}
