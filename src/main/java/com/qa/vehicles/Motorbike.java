package com.qa.vehicles;

public class Motorbike extends Vehicle {

	boolean isRacing;

	public Motorbike(String name, int numOfWheels, String size, String speed, String colour, boolean isExcellent,
			boolean isRacing) {
		super(name, numOfWheels, size, speed, colour, isExcellent);
		this.isRacing = isRacing;
	}

	public Motorbike() {
	}

	public boolean isRacing() {
		return isRacing;
	}

	public void setRacing(boolean isRacing) {
		this.isRacing = isRacing;
	}

	@Override
	public String toString() {
		return "Motorbike: Name = " + getName() + ", NumOfWheels = " + getNumOfWheels() + ", Size = " + getSize()
				+ ", Speed = " + getSpeed() + ", Colour = " + getColour() + ", isExcellent = " + isExcellent()
				+ ", isRacing = " + isRacing;
	}

	@Override
	public void drive() {
		System.out.println("I AM DRIVING MY MOTORBIKE CALLED " + getName());
	}

}
