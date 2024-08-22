package com.neotech.lesson25;

public class DrivableTest {

	public static void main(String[] args) {
		// Drivable d1 = new Drivable();

				Drivable d2 = new Cars();
				d2.drive();
				// d2.start();

				System.out.println(Drivable.DRIVE_FAST);

				// Drivable.DRIVE_FAST = false;

				Vehicles v1 = new Cars();
				v1.start();
				v1.stop();
				// v1.drive();

				Cars c1 = new Cars();
				c1.start();
				c1.drive();
				c1.stop();

				System.out.println(c1.DRIVE_FAST);
				System.out.println(Drivable.DRIVE_FAST);

	}

}
