package square;

import java.util.Comparator;

public class SquareComparatorBySide implements Comparator<Square> {
	@Override
	public int compare(Square sq1, Square sq2) {
		return Double.compare(sq1.getSide(), sq2.getSide());
	}
}
