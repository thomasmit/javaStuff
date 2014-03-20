package main.map;

import java.util.Comparator;

public class ReverseStringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		int result = o1.compareTo(o2);
		if(result <0 ){
			result = 1;
		}else if (result > 0){
			result = -1;
		}
		return result;
	}

}
