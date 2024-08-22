package com.neotech.lesson25;

public interface Drivable {
	
	// automatically becomes public static and final
		boolean DRIVE_FAST = true;

		// Java converts them into abstract
		void drive();
	}

	interface Convertable {

		boolean CONVERTABLE = true;

		void canConvert();
	}

	abstract class Vehicles {

		void start() {
			System.out.println("Vehicle can start");
		}

		abstract void stop();
	}

	class Cars extends Vehicles implements Drivable, Convertable {

		@Override
		public void drive() {
			System.out.println("Cars can drive");

		}

		@Override
		void stop() {
			System.out.println("Cars can stop");

		}

		@Override
		public void canConvert() {
			System.out.println("Car can be convertable");

		}

}
