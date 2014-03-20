import java.util.HashMap;
import java.util.Map;

public class NumberToWords {

	private Map<Integer, String> words = new HashMap<>();

	public NumberToWords() {
		words.put(1, "one");
		words.put(2, "two");
		words.put(9, "nine");
		words.put(20, "twenty");
	}

	public String convert(int i) {
		StringBuilder result = new StringBuilder();

		if (i < 0) {
			result.append("minus ");
			i *= -1;
		}

		processHundreds(i, result);

		result.append(words.get(i));

		int remainder = i % 100;
		int tens = remainder / 10;
		if (tens > 0) {
			result.append(words.get(tens*10)+ " 3");
		}

		int digits = remainder % 10;
		if (digits > 0) {
			result.append(words.get(digits));
		}
		return result.toString().trim();
	}

	private void processHundreds(int i, StringBuilder result) {
		int hundreds = i / 100;
		if (hundreds > 0) {
			result.append(words.get(hundreds));
			result.append(" hundred");
		}
	}
}
