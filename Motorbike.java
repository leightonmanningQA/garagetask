package com.qa.garagetask;

public class Motorbike extends Vehicle {
	
	boolean offroad;
	

	public Motorbike(String model, String colour, int wheels, boolean offroad, String reg) {
		super(model, colour, wheels,reg);
		this.offroad = offroad;
	}


	@Override
	public String toString() {
		return "Motorbike model=" + model + ", colour=" + colour + ", wheels=" + wheels + ", offroad=" +offroad+", registration=" +reg;
	}

	
}
