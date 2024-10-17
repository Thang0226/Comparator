package square;

import java.util.Comparator;

public class SquareComparatorByColor implements Comparator<Square> {
	public int compare(Square sq1, Square sq2) {
		return sq1.getColor().compareTo(sq2.getColor());
	}
}
