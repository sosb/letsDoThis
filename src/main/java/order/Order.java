package order;

import java.util.Arrays;
import java.util.Comparator;

public class Order {

	private static final String EMPTY_STRING = "";

	public static String order(String words) {
		if (words == null || isWhite(words)) {
			return EMPTY_STRING;
		}
		String[] chars = words.split(" ");
		Arrays.sort(chars, Comparator.comparingInt(o -> o.charAt(getNumberIndex(o))));
		return String.join(" ", chars);
	}

	private static int getNumberIndex(String word) {
		int index = 0;
		for (int i = 0; i < word.length(); i++) {
			if (Character.isDigit(word.charAt(i))) {
				index = i;
			}
		}
		return index;
	}

	private static boolean isWhite(String word) {
		return word.trim().isEmpty();
	}
}