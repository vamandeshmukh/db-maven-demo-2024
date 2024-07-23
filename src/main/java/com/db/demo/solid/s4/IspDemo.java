package com.db.demo.solid.s4;

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