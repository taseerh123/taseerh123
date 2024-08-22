package com.neotech.lesson14;

public class CarShop {

	public static void main(String[] args) {
		//ClassName indentifier ....
				Car car1 = new Car();
				//create an object using the Car template and we 
				//assign that object to car1
				car1.make = "Toyota";
				car1.model = "Camry";
				car1.color = "Blue";
				car1.mileage = 12000;
				car1.year = 2022;
				
				System.out.println(car1.make + " " 
				+ car1.model + " "+car1.color);

				car1.drive();
				car1.stop();
				car1.transportPeople();
				

				
				Car car2 = new Car();
				
				car2.make = "Honda";
				car2.model = "Civic";
				car2.color = "Red";
				car2.year = 2021;
				car2.mileage = 20222;
				
				car2.drive();
				car2.stop();
				car2.transportPeople();
				
				Car car3 = new Car();
				
				Car car4;
				
				
			}


	

}
