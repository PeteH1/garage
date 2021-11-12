package com.qa.vehicles;

public class Dirigible extends Vehicle {

	boolean isBestModeOfTransport = true;
	String wonderfulness;

	public Dirigible(String name, int numOfWheels, String size, String speed, String colour, boolean isExcellent,
			boolean isBestModeOfTransport, String wonderfulness) {
		super(name, numOfWheels, size, speed, colour, isExcellent);
		this.isBestModeOfTransport = isBestModeOfTransport;
		this.wonderfulness = wonderfulness;
	}

	public Dirigible() {
	}

	public boolean isBestModeOfTransport() {
		return isBestModeOfTransport;
	}

	public void setBestModeOfTransport(boolean isBestModeOfTransport) {
		this.isBestModeOfTransport = isBestModeOfTransport;
	}

	public String getWonderfulness() {
		return wonderfulness;
	}

	public void setWonderfulness(String wonderfulness) {
		this.wonderfulness = wonderfulness;
	}

	@Override
	public String toString() {
		return "Dirigible: Name = " + getName() + ", NumOfWheels = " + getNumOfWheels() + ", Size = " + getSize()
				+ ", Speed = " + getSpeed() + ", Colour = " + getColour() + ", isExcellent = " + isExcellent()
				+ ", isBestModeOfTransport = " + isBestModeOfTransport + ", wonderfulness = " + wonderfulness;
	}

	@Override
	public void drive() {
		System.out.println("I AM DRIVING MY DIRIGIBLE CALLED " + getName());
	}

}
