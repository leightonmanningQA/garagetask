package com.qa.garagetask;

public class Bus extends Vehicle {
	
	boolean doubledecker;

	public Bus(String model, String colour, int wheels, boolean doubledecker, String reg) {
		super(model, colour, wheels, reg);
		this.doubledecker = doubledecker;
	}

	@Override
	public String toString() {
		return "Bus model=" + model + ", colour=" + colour + ", wheels=" + wheels + ", doubledecker=" +doubledecker+", registration=" +reg;
	}
	
}
