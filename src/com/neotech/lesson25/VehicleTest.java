package com.neotech.lesson25;

public class VehicleTest {

	public static void main(String[] args) {
		// we can not instantiate from an abstract class
				// Vehicle v = new Vehicle("Red");
				// Car c = new Car("Black", "Honda");

				Vehicle v1 = new Tesla("Red", "Tesla"); // up-casting
				v1.start();
				v1.drive();
				v1.brake();
				v1.stop();
				// v1.display(); - display() does not exist in Vehicle class

				// down-casting the object from Vehicle to Tesla
				Tesla t1 = (Tesla) v1;
				t1.display();

				Toyota toyota1 = new Toyota("Black", "Camry");
				Car toyota2 = new Toyota("Gray", "Rav4"); // upcasting
				Vehicle toyota3 = new Toyota("Blue", "Corolla"); // upcasting

				toyota1.start();
				toyota2.start();
				toyota3.start();

				Tesla tesla1 = new Tesla("Black", "S");
				Vehicle tesla2 = new Tesla("Red", "V3"); // upcasting

				tesla1.display();
				// can not access
				// tesla2.display();


	}

}
