package rectangle;

import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {
	@Override
	public int compare(Rectangle r1, Rectangle r2) {
		return Double.compare(r1.getWidth() + r1.getLength(),
				r2.getWidth() + r2.getLength());
	}
}
