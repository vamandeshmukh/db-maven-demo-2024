package com.db.demo.solid.s4;

//Interface Segregation Principle (ISP)
//Clients should not be forced to depend on interfaces they do not use.
//Break down large interfaces into smaller, more specific ones.
//Improves code modularity and reusability.

public class IspDemo {

}


interface Doable {
	
	public abstract void work();
	public abstract void eat();
	
}

class HumanBeing implements Doable {

	@Override
	public void work() {

	}

	@Override
	public void eat() {

	}	
}

class Robot implements Doable {

	@Override
	public void work() {

	}

	@Override
	public void eat() {

	}	
}

//class Robot2 extends HumanBeing{
//
//}