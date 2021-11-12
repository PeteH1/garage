package com.qa.main;

import com.qa.garage.Garage;
import com.qa.vehicles.Car;
import com.qa.vehicles.Dirigible;
import com.qa.vehicles.Motorbike;
import com.qa.vehicles.Vehicle;

public class Runner {

	public static void main(String[] args) {
		Garage myGarage = new Garage();

		Vehicle myCar = new Car("Gwendoline", 4, "Small", "meh", "British racing navy blue", true, 5, 85000);
		Vehicle myMotorbike = new Motorbike("Mary", 2, "Medium", "Fast", "Yellow", false, false);
		Vehicle bestVehicle = new Dirigible("Archibald", 0, "Gigantic", "Terrifyingly fast", "White", true, true,
				"Extremely high");
		Vehicle secondCar = new Car("Phteven", 4, "Big", "Quick enough", "Bright purple", false, 5, 10000);

		myGarage.addVehicle(myCar);
		myGarage.addVehicle(myMotorbike);
		myGarage.addVehicle(bestVehicle);
		myGarage.addVehicle(secondCar);

		System.out.println(myGarage);

		myGarage.fixAllVehicles();

		myGarage.removeVehicleByName("Mary");

		System.out.println(myGarage);

		myGarage.removeVehiclesOfType("Car");

		System.out.println(myGarage);

		myGarage.emptyGarage();

		System.out.println(myGarage);

	}

}
