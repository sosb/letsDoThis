package order;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static order.Order.EMPTY_STRING;
import static order.Order.isWhite;

public class Order2 {

	public static String order(String words) {
		Map<Integer, String> stringMap = new TreeMap<>();
		if (words == null || isWhite(words)) {
			return EMPTY_STRING;
		}
		String[] word = words.trim().split(" ");
		for (String aWord : word) {
			stringMap.put(getNumber(aWord), aWord);
		}
		return convertToString(stringMap);
	}

	private static String convertToString(Map<Integer, String> stringMap) {
		return stringMap.entrySet().stream()
				.map(Map.Entry::getValue)
				.collect(Collectors.joining(" "));
	}

	private static int getNumber(String s) {
		int number = Integer.MAX_VALUE;
		for (int i = 0; i < s.length(); i++) {
			int intValue = (int) s.charAt(i);
			if (intValue >= 48 && intValue <= 57) {
				number = intValue;
			}
		}
		return number;
	}
}
