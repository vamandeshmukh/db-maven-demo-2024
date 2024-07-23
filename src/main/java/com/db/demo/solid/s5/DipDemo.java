package com.db.demo.solid.s5;


//Dependency Inversion Principle (DIP)
//High-level modules should not depend on low-level modules. Both should depend on abstractions.
//Use abstractions (interfaces or abstract classes) to decouple components.
//Promotes loose coupling and testability.

public class DipDemo {

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


















interface PrinterInterface {
    void print(String document);
}

class Printer implements PrinterInterface {

	public void print(String document) {

   }
}

class Printer2 implements PrinterInterface {

	public void print(String document) {

   }
}


class Computer {
    
	private PrinterInterface printer;

    public Computer(PrinterInterface printer) {
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
