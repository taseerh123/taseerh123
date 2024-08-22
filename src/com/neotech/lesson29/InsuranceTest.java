package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InsuranceTest {

	public static void main(String[] args) {
		

			List<Insurance> ins = new ArrayList<>();

			ins.add(new CarInsurance("Geico", "Accord"));
			ins.add(new PetInsurance("Progressive", "Dog"));
			ins.add(new HealthInsurance("Metlife"));
			
			Iterator<Insurance> it = ins.iterator();
			
			while(it.hasNext())
			{
				Insurance insurance = it.next();
				
				insurance.getQoute();
				insurance.cancelInsurance();
				
				//if I use this style
					//it.next().getQoute();
					//it.next().cancelInsurance();
				//we would end up having an issue --> why?
				//the cursor is moving twice within the same loop
				//after calling getQoute() it would skip to the next element and then call cancelInsurance()
				
			}
			

	}

}
