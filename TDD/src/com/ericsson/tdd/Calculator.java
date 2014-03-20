package com.ericsson.tdd;

public class Calculator {

	public static int add(int i, int j) {

		if (i < Integer.MAX_VALUE && j < Integer.MAX_VALUE && i+j< Integer.MAX_VALUE) {
			return i + j;
		} else
			throw new OutOfMemoryError();

	}
}
