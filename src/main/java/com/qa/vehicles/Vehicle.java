package com.qa.vehicles;

public abstract class Vehicle {

	private String name;
	private int numOfWheels;
	private String size;
	private String speed;
	private String colour;
	private boolean isExcellent;

	public Vehicle(String name, int numOfWheels, String size, String speed, String colour, boolean isExcellent) {
		this.name = name;
		this.numOfWheels = numOfWheels;
		this.size = size;
		this.speed = speed;
		this.colour = colour;
		this.isExcellent = isExcellent;
	}

	public Vehicle() {
	}

	public abstract void drive();

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isExcellent() {
		return isExcellent;
	}

	public void setExcellent(boolean isExcellent) {
		this.isExcellent = isExcellent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vehicle: name = " + name + ", numOfWheels = " + numOfWheels + ", size = " + size + ", speed = " + speed
				+ ", colour = " + colour + ", isExcellent = " + isExcellent;
	}

}
