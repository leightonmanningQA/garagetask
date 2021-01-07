package com.qa.garagetask;

public abstract class Vehicle {
	
	String model;
	String colour;
	int wheels;
	String reg;
	
	public Vehicle(String model, String colour, int wheels, String reg) {
		super();
		this.model = model;
		this.colour = colour;
		this.wheels = wheels;
		this.reg = reg;
	}

	public Vehicle() {
		super();
	}


	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getReg() {
		return reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", colour=" + colour + ", wheels=" + wheels + ", reg=" + reg + "]";
	}

	

	
	
	
}
