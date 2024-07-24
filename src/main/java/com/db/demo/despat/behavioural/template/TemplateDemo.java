package com.db.demo.despat.behavioural.template;

public class TemplateDemo {

	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();
		
		Game game2 = new Football();
		game2.play();

	}

}
