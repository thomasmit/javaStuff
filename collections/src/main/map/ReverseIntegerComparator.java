package main.map;

import java.util.Comparator;

public class ReverseIntegerComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer arg0, Integer arg1) {
		int result = arg0.compareTo(arg1);
		return -result;
	}

}
