package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.vehicles.Vehicle;

public class Garage {

	List<Vehicle> garageList = new ArrayList<>();

	public void addVehicle(Vehicle vehicle) {
		garageList.add(vehicle);
	}

	public int getBill(Vehicle vehicle) {
		if (vehicle.getClass().getSimpleName().equals("Car")) {
			return 450;
		} else if (vehicle.getClass().getSimpleName().equals("Motorbike")) {
			return 1;
		} else {
			return 500000000;
		}
	}

	public void fixAllVehicles() {
		System.out.println("All your vehicles are fixed!");
		for (Vehicle i : garageList) {
			if (i.getClass().getSimpleName().equals("Car")) {
				System.out.println("The bill for your car, " + i.getName() + ", is £" + getBill(i) + ".");
			} else if (i.getClass().getSimpleName().equals("Motorbike")) {
				System.out.println("The bill for your motorbike, " + i.getName() + ", is £" + getBill(i) + ".");
			} else {
				System.out.println("The bill for your dirigible, " + i.getName() + ", is £" + getBill(i)
						+ ". But let's be honest, it's totally worth it. What a wonderful mode of transport.");
			}
		}
	}

	/*
	 * Using an enhanced for loop causes a ConcurrentModificationException, so need
	 * to use a regular for loop instead
	 */
//	public void removeVehiclesOfType(String type) {
//		for (Vehicle i : garageList) {
//			if (i.getClass().getSimpleName().equals(type)) {
//				garageList.remove(i);
//			}
//		}
//	}

	public void removeVehiclesOfType(String type) {
		for (int i = 0; i < garageList.size(); i++) {
			if (garageList.get(i).getClass().getSimpleName().equals(type)) {
				garageList.remove(i);
			}
		}
		System.out.println("Removed all " + type + "s.");
	}

	/*
	 * Using an enhanced for loop causes a ConcurrentModificationException, so need
	 * to use a regular for loop instead
	 */
//	public void removeVehicleByName(String name) {
//		for (Vehicle i : garageList) {
//			if (i.getName().equals(name)) {
//				String iName = i.getName();
//				garageList.remove(i);
//				System.out.println("Removed " + iName);
//			}
//		}
//	}

	public void removeVehicleByName(String name) {
		for (int i = 0; i < garageList.size(); i++) {
			if (garageList.get(i).getName().equals(name)) {
				String toRemove = garageList.get(i).getName();
				garageList.remove(i);
				System.out.println("Removed " + toRemove);
			}
		}
	}

	public void emptyGarage() {
		garageList.removeAll(garageList);
		System.out.println("Garage has been emptied.");
	}

	@Override
	public String toString() {
		return "Garage contains: " + garageList;
	}

}
