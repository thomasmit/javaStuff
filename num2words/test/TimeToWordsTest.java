import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TimeToWordsTest {
	
	
	@Parameters
	public static Collection<Object[]> getData(){
		Object [] [] data = {
				{1,0, "one am"},
				{2,0, "two am"},
				{5,0, "five am"},
				{13,0, "one pm"},
				{17,0, "five pm"},
				{17,40, "twenty to 6 pm"},
				{17,5, "five past five pm"}
				
		};
		return Arrays.asList(data);
	}
	
	private int hour;
	private int minute;
	private String result;

	public TimeToWordsTest(int hour, int minute,  String result) {
		this.hour = hour;
		this.minute = minute;
		this.result = result;
	}

	@Test
	public void test() {
		TimeToWords timeToWords = new TimeToWords();
		assertEquals(result, timeToWords.convert(hour,minute));
	}
}
