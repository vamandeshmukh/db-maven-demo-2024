package com.db.demo.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {

	@Test
	public void testTestPositive() {
		int expected = 10;
		int actual = 5 + 5;
		assertEquals(expected, actual);
	}

	@Test
	public void testTestNegative() {
		int unexpected = 11;
		int actual = 5 + 5;
		assertNotEquals(unexpected, actual);
	}
}



//package com.db.demo.math;
//
////import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Assertions;
//
//import org.junit.jupiter.api.Test;
//
//public class CalcTest {
//
//	@Test
//	public void testTest() {
//		int expected = 10;
//		int actual = 5 + 5;
////		assertEquals(expected, actual);
//		Assertions.assertEquals(expected, actual);
//	}
//
////	@Test
////	public void testTest2() {
////		int expected = 11;
////		int actual = 5 + 5;
////		assertEquals(expected, actual);
////	}
//}
