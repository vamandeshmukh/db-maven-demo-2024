package com.db.demo.solid.s5;

//Dependency Inversion Principle (DIP)
//High-level modules should not depend on low-level modules. Both should depend on abstractions.
//Use abstractions (interfaces or abstract classes) to decouple components.
//Promotes loose coupling and testability.

public class DipDemo {

	public static void main(String[] args) {

		Printable printer1 = new Printer();
		Printable printer2 = new Printer2();

		Computer obj = new Computer(printer2);
		obj.printDocument("abc");

	}

}

//class Printer {
//    public void print(String document) {
//
//    }
//}
//
//
//class Computer {
//
//	private Printer printer;
//
//    public Computer() {
//        this.printer = new Printer();
//    }
//
//    public void printDocument(String document) {
//        printer.print(document);
//    }
//}

interface Printable {
	void print(String document);
}

class Printer implements Printable {

	public void print(String document) {
		System.out.println("Printing with printer 1 " + document);
	}
}

class Printer2 implements Printable {

	public void print(String document) {
		System.out.println("Printing with printer 2 " + document);
	}
}

class Computer {

	private Printable printer;

	public Computer(Printable printer) {
		this.printer = printer;
	}

	public void printDocument(String document) {
		printer.print(document);
	}
}

class Implement {

	public static void main(String[] args) {

		Computer obj = new Computer(null);

	}

}
