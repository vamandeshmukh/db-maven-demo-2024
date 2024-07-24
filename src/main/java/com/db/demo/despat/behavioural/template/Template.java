package com.db.demo.despat.behavioural.template;


abstract class Game {
	
	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

	public final void play() {
		initialize();
		startPlay();
		endPlay();
	}
}

class Cricket extends Game {
	
	@Override
	void initialize() {
		System.out.println("Cricket Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Cricket Game Started. Enjoy the game!");
	}

	@Override
	void endPlay() {
		System.out.println("Cricket Game Finished!");
	}
	
//	@Override
//	public void play() {
//		initialize();
//		startPlay();
//		endPlay();
//	}

}



class Football extends Game {
	
	@Override
	void initialize() {
		System.out.println("Football Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Football Game Started. Enjoy the game!");
	}

	@Override
	void endPlay() {
		System.out.println("Football Game Finished!");
	}
	
//	@Override
//	public void play() {
//		initialize();
//		startPlay();
//		endPlay();
//	}

}
