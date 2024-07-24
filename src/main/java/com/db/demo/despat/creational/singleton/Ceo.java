package com.db.demo.despat.creational.singleton;

public class Ceo {

	private static Ceo instance;

	private Ceo() {
		super();
	}

	public static Ceo getInstance() {
		if (null == instance)
			instance = new Ceo();
		return instance;
	}
	
	public void runCompany() {
		System.out.println("CEO running company...");
	}

}
