package rectangle;

import java.util.Arrays;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle[] list = new Rectangle[3];
		list[0] = new Rectangle();
		list[1] = new Rectangle(2.3, 5.8);
		list[2] = new Rectangle(2.5, 3.8, "orange", true);
		System.out.println("Before sorting:");
		for (Rectangle r : list) {
			System.out.println(r);
		}
		Arrays.sort(list, new RectangleComparator());
		System.out.println("After sorting:");
		for (Rectangle r : list) {
			System.out.println(r);
		}
	}
}
