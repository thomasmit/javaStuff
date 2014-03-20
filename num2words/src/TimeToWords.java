import java.util.HashMap;
import java.util.Map;

public class TimeToWords {
	private Map<Integer, String> words = new HashMap<>();

	public TimeToWords() {
		words.put(1, "one");
		words.put(2, "two");
		words.put(5, "five");
	}

	public String convert(int hour, int minute) {
		StringBuilder result = new StringBuilder();
		

		int splitHours = hour % 12;
		
		
		
		if (minute > 30){
			int time = 60 - minute;
			result.append(time+ words.get(splitHours));
			result.append(" to ");
		}else{
			result.append(words.get(splitHours));
			result.append(" past ");
		}
		
		if(minute > 0){
			processHours(hour,splitHours, result);
		}

				
		return result.toString();
	}

	private void processHours(int hour, int split, StringBuilder result) {
		if (hour > 12) {
			result.append(words.get(split));
			result.append(" pm");
		} else {
			result.append(words.get(hour));
			result.append(" am");
		}
	}

}
