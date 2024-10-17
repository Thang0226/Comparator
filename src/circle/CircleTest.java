package circle;

import java.util.Arrays;

public class CircleTest {
	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println(circle);

		circle = new Circle(3.5);
		System.out.println(circle);

		circle = new Circle(3.5, "indigo", false);
		System.out.println(circle);

		Circle[] list = new Circle[3];
		list[0] = new Circle();
		list[1] = new Circle(3.5);
		list[2] = new Circle(2);
		System.out.println("Before sorting: ");
		for (Circle c : list) {
			System.out.println(c);
		}
		Arrays.sort(list, new CircleComparator());
		System.out.println("After sorting: ");
		for (Circle c : list) {
			System.out.println(c);
		}

	}
}
