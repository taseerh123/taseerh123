package com.neotech.lesson25;

public abstract class Phone {
	
	public void call() {
		System.out.println("Phones make calls!");
	}

	public void text() {
		System.out.println("Phones send text messages!");
	}

	// unimplemented method: abstract method
	public abstract void takePicture();

	public abstract void playMusic();
}

class iPhone extends Phone {

	@Override
	public void takePicture() {
		System.out.println("Iphones take the best picture");

	}

	@Override
	public void playMusic() {
		System.out.println("I phones play music");

	}

	@Override
	public void call() {
		System.out.println("Iphones can also do FaceTime calls");
	}
}

class Samsung extends Phone {

	@Override
	public void takePicture() {
		System.out.println("Samsung takes better picture");

	}

	@Override
	public void playMusic() {
		System.out.println("Samsung plays music");

	}

	public void googlePlay() {
		System.out.println("Samsung has google play!");
	}

}
