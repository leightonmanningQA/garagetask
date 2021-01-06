package com.qa.garagetask;

public class Bus extends Vehicle {
	
	boolean doubledecker;

	public Bus(String model, String colour, int wheels, boolean doubledecker) {
		super(model, colour, wheels);
		this.doubledecker = doubledecker;
	}

	@Override
	public String toString() {
		return "Bus model=" + model + ", colour=" + colour + ", wheels=" + wheels + ", doubledecker=" +doubledecker;
	}
	
}
