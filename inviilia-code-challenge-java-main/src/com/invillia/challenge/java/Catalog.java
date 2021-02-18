package com.invillia.challenge.java;

import java.util.Comparator;
import java.util.LinkedList;

public class Catalog {
    private LinkedList<Car> cars;

	public Catalog() {
		cars = new LinkedList<Car>();
	}

	public void add(Car car) {
		cars.add(car);		
	}

	public void printCatalog(double maximumPrice) {
		cars.sort(Comparator.comparing(Car::getHorsePower).reversed());
		
		for(Car x : cars) {
			if(x.getPrice() <= maximumPrice) {
				System.out.println(x);
			}
		}
	}	
    
    
}