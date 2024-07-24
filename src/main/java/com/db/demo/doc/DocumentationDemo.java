package com.db.demo.doc;

/**
 * 
 * @author Vaman 
 * @version 1.0.0 
 * @since 2024 
 * 
 * This class demonstrates the use of Java documentation.  
 */

public class DocumentationDemo {

  /**
  * The main method to test the Maths class methods.
  *
  * @param args command line arguments
  */
 public static void main(String[] args) {
     Maths maths = new Maths();

     int sum = maths.addNums(10, 5);
     System.out.println("Sum: " + sum); // Output: Sum: 15

     int difference = maths.subNums(10, 5);
     System.out.println("Difference: " + difference); // Output: Difference: 5
 }

}

//class Delete {
//
////	single line comment 
//
//	/*
//	 * these are 
//	 * multi lines comments
//	 */
//	
//	/** 
//	 * java doc comments 
//	 */
//
//}