package com.db.demo.fundas;

public class JavaFundas {

	public static void main(String[] args) {

//		Employee emp = new Employee();
//		emp.setFirstName("Sonu");
//		System.out.println(emp.toString());
//		System.out.println(emp.getFirstName());
//
//		Employee emp2 = new Employee(102, "Monu", 90000.50);
//		System.out.println(emp2.toString());
//		System.out.println(emp2.getFirstName());
		
		
		Employee emp1 = new Employee(101, "Sonu", 90000.50);
		Employee emp2 = new Employee(101, "Sonu", 90000.50);

		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
	}
}


















