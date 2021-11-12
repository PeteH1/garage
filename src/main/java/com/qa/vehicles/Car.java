package com.qa.vehicles;

public class Car extends Vehicle {

	private int numOfDoors;
	private int mileage;

	public Car(String name, int numOfWheels, String size, String speed, String colour, boolean isExcellent,
			int numOfDoors, int mileage) {
		super(name, numOfWheels, size, speed, colour, isExcellent);
		this.numOfDoors = numOfDoors;
		this.mileage = mileage;
	}

	public Car() {
		super();
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Car: Name = " + getName() + ", NumOfWheels = " + getNumOfWheels() + ", Size = " + getSize()
				+ ", Speed = " + getSpeed() + ", Colour = " + getColour() + ", isExcellent = " + isExcellent()
				+ "NumOfDoors = " + numOfDoors + ", Mileage = " + mileage;
	}

	@Override
	public void drive() {
		System.out.println("DRIVING MY CAR CALLED " + getName());
	}

}
