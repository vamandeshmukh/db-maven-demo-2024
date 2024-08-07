package com.db.demo.despat.creational.factory;

//import java.util.*;

public class FactoryDemo {

	public static void main(String[] args) {
		
//		List<String> list1 = new ArrayList<>();
//		list1 = new LinkedList<>();

		ShapeFactory shapeFactory = new ShapeFactory();

		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();

		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
	}

}
