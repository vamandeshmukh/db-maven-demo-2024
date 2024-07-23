package com.db.demo.solid.s5;

//Dependency Inversion Principle (DIP)
//High-level modules should not depend on low-level modules. Both should depend on abstractions.
//Use abstractions (interfaces or abstract classes) to decouple components.
//Promotes loose coupling and testability.

public class DipDemo {

	public static void main(String[] args) {

		Printable printer1 = new LaserPrinter();
		Printable printer2 = new InkjetPrinter();

		Computer obj = new Computer(printer1);
		String document = "Text in the document...";
		obj.printDocument(document);

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

class LaserPrinter implements Printable {

	public void print(String document) {
		System.out.println("Printing with Laser printer: " + document);
	}
}

class InkjetPrinter implements Printable {

	public void print(String document) {
		System.out.println("Printing with Inkjet printer: " + document);
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
