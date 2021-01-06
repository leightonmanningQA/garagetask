package com.qa.garagetask;

public abstract class Vehicle {
	
	String model;
	String colour;
	int wheels;
	
	public Vehicle(String model, String colour, int wheels) {
		super();
		this.model = model;
		this.colour = colour;
		this.wheels = wheels;
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

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", colour=" + colour + ", wheels=" + wheels + "]";
	}

	
	
	
}
