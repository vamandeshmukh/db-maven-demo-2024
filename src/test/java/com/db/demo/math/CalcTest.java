package com.db.demo.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {

	@Test
	public void testTest() {
		int expected = 10;
		int actual = 5 + 5;
		assertEquals(expected, actual);
	}

	@Test
	public void testTest2() {
		int expected = 11;
		int actual = 5 + 5;
		assertEquals(expected, actual);
	}
}
