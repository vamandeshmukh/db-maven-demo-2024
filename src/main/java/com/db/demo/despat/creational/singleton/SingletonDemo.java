package com.db.demo.despat.creational.singleton;

//Creational Patterns
//Singleton Pattern
//Ensures a class has only one instance and provides a global point of access to it.

public class SingletonDemo {

	public static void main(String[] args) {

//		Ceo ceo1 = new Ceo();
//		Ceo ceo2 = new Ceo();

		Ceo ceo1 = Ceo.getInstance();
		Ceo ceo2 = Ceo.getInstance();
		
		ceo1.runCompany();

		System.out.println(ceo1.hashCode());
		System.out.println(ceo2.hashCode());
		System.out.println(ceo1.equals(ceo2));

		// Singleton singleton = Singleton.getInstance();
//		Singleton singleton2 = Singleton.getInstance();
//
//		singleton.someMethod();
//		
//		System.out.println(singleton.hashCode());
//		System.out.println(singleton2.hashCode());
//		System.out.println(singleton.equals(singleton2));

	}

}
