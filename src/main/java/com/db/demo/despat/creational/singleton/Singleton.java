package com.db.demo.despat.creational.singleton;

public class Singleton {

	private static Singleton instance;

    private Singleton() {
    	super();
    }

    public static Singleton getInstance() {

    	if (instance == null) 
            instance = new Singleton();
        return instance;
    }

    public void someMethod() {
        System.out.println("someMethod in Singleton class");
    }
}

