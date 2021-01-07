package com.qa.garagetask;

public class Main {

	public static void main(String[] args) {
		
		Vehicle car1 = new Car("a4","White",4,4,"CH66 SEY");
		Vehicle motorbike1 = new Motorbike("R1200","Black",2,true,"BD51 SMR");
		Vehicle bus1 = new Bus("2000NL","green/white",6,false,"AC55 ABC");
		
		GarageList gl = new GarageList();
		
		gl.add(car1);
		gl.add(motorbike1);
		gl.add(bus1);
		
		gl.calcbill("BD51 SMR");
		//gl.clear();
		//System.out.println(gl);

	}

}
