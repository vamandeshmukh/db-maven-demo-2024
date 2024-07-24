package com.db.demo.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class CalcTest {

	@Mock
	private static Calc calc;

	@BeforeAll
	public static void setup() {
		MockitoAnnotations.openMocks(CalcTest.class);
		calc = Mockito.mock(Calc.class);
	}

	@BeforeEach
	public void data() {
		when(calc.addNums(5, 5)).thenReturn(10);
		when(calc.subNums(10, 5)).thenReturn(5);
	}

	@AfterAll
	public static void teardown() {
		calc = null;
	}

	@Test
	public void testAddNums() {
		assertEquals(10, calc.addNums(5, 5));
	}

	@Test
	public void testAddNums2() {
		assertNotEquals(10, calc.addNums(5, 6));
	}

	@Disabled
	@Test
	public void testsubNums() {
		assertEquals(5, calc.subNums(10, 5));
	}

	@Test
	public void testsubNums2() {
		assertNotEquals(10, calc.subNums(5, 6));
	}

//	@ParameterizedTest
//	@ValueSource(ints = { 10, 20, 30, 40, 50 }) // What is 'ints'?
//	public void testAddNums3(int num) {
//		Integer fixedValue = 5;
//		Integer expectedResult = num + fixedValue;
//		assertEquals(expectedResult, calc.addNums(num, fixedValue));
//	}

}

//package com.db.demo.math;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
//
////import org.junit.jupiter.
//
//public class CalcTest {
//	
//	private static Calc calc;
//
//	@BeforeAll
//	public static void setup() {
//		// things to be done before tests run begins 
//		calc = new Calc();
//	}
//
//	@AfterAll
//	public static void teardown() {
//		// things to be done after tests run ends
//		calc = null;
//	}
//
//	@BeforeEach
//	public void m1() {
//		// things to be done before a test run begins
//
//	}
//
//	@AfterEach
//	public void m2() {
//		// things to be done after a test run ends
//
//	}
//
//	@Test
//	public void testAddNums() {
//		assertEquals(10, calc.addNums(5, 5));
//	}
//
//	@Test
//	public void testAddNums2() {
//		assertNotEquals(10, calc.addNums(5, 6));
//	}
//
//	@Disabled
//	@Test
//	public void testsubNums() {
//		assertEquals(5, calc.subNums(10, 5));
//	}
//	
//	@Test
//	public void testsubNums2() {
//		assertNotEquals(10, calc.subNums(5, 6));
//	}
//	
//	@ParameterizedTest
//    @ValueSource(ints = { 10, 20, 30, 40, 50 }) // What is 'ints'?
//    public void testAddNums3(int num) {
//        Integer fixedValue = 5; 
//        Integer expectedResult = num + fixedValue;
//        assertEquals(expectedResult, calc.addNums(num, fixedValue));
//    }	
//
//}

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
