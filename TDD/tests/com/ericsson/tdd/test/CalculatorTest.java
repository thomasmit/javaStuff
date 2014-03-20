package com.ericsson.tdd.test;

import static org.junit.Assert.assertEquals;
import java.lang.RuntimeException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ericsson.tdd.Calculator;

public class CalculatorTest {

	@Before
	public void setupCalc() {
	}

	@After
	public void cleanUp() {

	}

	@Test
	public void testAdd() {
		assertEquals(10, Calculator.add(10, 0));

	}

	@Test(expected = OutOfMemoryError.class)
	public void testAddThrowsException() {
		Calculator.add(5, Integer.MAX_VALUE)	;
	}

}
