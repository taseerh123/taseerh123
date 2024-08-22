package com.neotech.lesson21;

public class Barn {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "Leo";
		a.color = "Gray";
		a.age = 3;
		a.weight = 25;
	//	a.breed = ""? //--> Animal does not have this feature
		
		a.eat();
		a.sleep();
		a.displayInfo();
	//	a.bark();  //--> Animal class does not have this behavior
		
		System.out.println("==============");
		
		
		Dog d = new Dog();
		d.name = "Daisy"; //inherited from the parent
		d.color = "brown"; //inherited from the parent
		d.age = 2; //inherited from the parent
		d.weight = 20; //inherited from the parent
		
		d.breed = "Golden";
		
		//inherited from the parent class (Animal)
		d.eat();
		d.sleep();
		d.displayInfo();
		
		//behavior of the child
		d.bark();
		
		Cat c = new Cat();
		//all these features are inherited
		c.name = "Fluffy";
		c.color = "Brown";
		c.age = 2;
		c.weight = 10;
		
		//cannot access any dog features or behaviors
		//c.breed ="";
		
		//all these behaviors are inherited
		c.eat();
		c.sleep();
		c.displayInfo();
		
		//cannot inherit anything from Dog
//		c.bark();
		
		c.meow(); //coming from the child class (Cat)
		

		Puppy p = new Puppy();
		p.age = 1;//all features and behaviors from the Animal
		p.breed = "Husky";//everything from the Dog class
		p.hasTrainer = true;//everything that exists on the Puppy
		
		
		
		

	}

		
	

}
