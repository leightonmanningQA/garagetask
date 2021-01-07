package com.qa.garagetask;

import java.util.ArrayList;

public class GarageList {
	int carPrice = 200;
	int bikePrice = 100;
	int busPrice = 400;

	ArrayList<Vehicle> vehicleArray = new ArrayList<>();

	public void add(Vehicle v) {
		vehicleArray.add(v);
		System.out.println(vehicleArray);

	}

	public void remove(Vehicle v) {
		vehicleArray.remove(v);
	}

	public void output() {
		for (Vehicle v : vehicleArray) {
			System.out.println(v);
		}
	}

	public void clear() {
		vehicleArray.clear();
	}

	public void calcbill(String reg) {
		for (Vehicle v : vehicleArray) {
			if (v instanceof Car & v.getReg().contains(reg)) {
				System.out.println("Your vehicle is a car and therefore you will pay £" + carPrice);
			}
			if (v instanceof Motorbike & v.getReg().contains(reg)) {
				System.out.println("Your vehicle is a motorbike and therefore you will pay £" + bikePrice);

			}
			if (v instanceof Bus & v.getReg().contains(reg)) {
				System.out.println("Your vehicle is a bus and therefore you will pay £" + busPrice);

			} else {
				
			}
		}
	}

	@Override
	public String toString() {
		return "GarageList [vehicleArray=" + vehicleArray + "]";
	}

}
