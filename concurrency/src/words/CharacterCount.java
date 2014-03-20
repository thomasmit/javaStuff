package words;

import java.util.StringTokenizer;
import java.util.concurrent.Callable;

public class CharacterCount implements Callable<Integer> {

	private String line;
	private String whatToCount;
	
	public CharacterCount(String line,String whatToCount){
		this.line = line;
		this.whatToCount = whatToCount;
	}
	
	@Override
	public Integer call() throws Exception {
		int length = 0;
		if("c".equals(whatToCount)){
			length = line.length();
		}else{
			StringTokenizer st = new StringTokenizer(line);
			length = st.countTokens();
		}
		return length;
	}

}
