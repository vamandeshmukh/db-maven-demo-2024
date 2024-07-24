package com.db.demo.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {
	
	
	

	@Test
	public void testAddNums() {
		Calc calc = new Calc();
		assertEquals(10, calc.addNums(5, 5));
	}
	
	@Test
	public void testAddNums2() {
		Calc calc = new Calc();
		assertNotEquals(10, calc.addNums(5, 6));
	}

}


//package com.db.demo.math;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//
//import org.junit.jupiter.api.Test;
//
//public class CalcTest {
//
//	@Test
//	public void testTestPositive() {
//		int expected = 10;
//		int actual = 5 + 5;
//		assertEquals(expected, actual);
//	}
//
//	@Test
//	public void testTestNegative() {
//		int unexpected = 10; 
//		int actual = 5 + 6;
//		assertNotEquals(unexpected, actual);
//	} 
//}



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
