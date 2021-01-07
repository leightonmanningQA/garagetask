package com.qa.garagetask;

public class Car extends Vehicle {
	
	int doorNum;

	public Car(String model, String colour, int wheels, int doorNum,String reg) {
		super(model, colour, wheels,reg);
		this.doorNum = doorNum;
	}

	@Override
	public String toString() {
		return "Car model=" + model + ", colour=" + colour + ", wheels=" + wheels + ", doornumber=" +doorNum + ", registration=" +reg;
	}

}
