package com.db.demo.solid.s3;

//Liskov Substitution Principle (LSP)
//Objects in a program should be replaceable with 
//instances of their subtypes without altering the correctness of that program.
//Derived classes must be substitutable for their base classes.
//Ensures code reliability and flexibility.

public class LiscovDemo {

}

//class Bird {
//	
//	public void fly() {
//		
//	}
//}
//
//class Sparrow extends Bird {
//	
//}
//
//class Penguine extends Bird {
//	
//}

abstract class Bird {

	public abstract void move();

}

class FlyingBird extends Bird {

	@Override
	public void move() {
		// logic to fly
	}
}

class WalkingBird extends Bird {

	@Override
	public void move() {
		// logic to walk
	}
}

class Sparrow extends FlyingBird {

}

class Penguine extends WalkingBird {

}
