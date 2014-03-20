import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestNumberToWords {
	
	@Parameters
	public static Collection<Object[]> getData(){
		Object [] [] data = {
				{1, "one"},
				{2,"two"},
				{9,"nine"},
				{100,"one hundred"},
				{200,"two hundred"},
				{900,"nine hundred"},
				{-1,"minus one"},
				{20,"twenty"}
		};
		return Arrays.asList(data);
	}
	
	private int valueToConvert;
	private String result;

	public TestNumberToWords(int valueToConvert, String result) {
		this.valueToConvert = valueToConvert;
		this.result = result;
	}

	@Test
	public void test() {
		NumberToWords numToWords = new NumberToWords();
		assertEquals(result, numToWords.convert(valueToConvert));
	}

}
