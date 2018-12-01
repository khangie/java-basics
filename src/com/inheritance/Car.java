package com.inheritance;

/**
 * Demonstrates inheritance with an "is a" relationship.
 */

public class Car extends Vehicle {

	private int doors;
	private int engineCapacity;
	
	public Car(String name, int doors, int engineCapacity) {
		super(name);
		this.doors = doors;
		this.engineCapacity = engineCapacity;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
}
