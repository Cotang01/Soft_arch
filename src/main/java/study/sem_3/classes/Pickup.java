package study.sem_3.classes;

import java.awt.Color;

import study.sem_3.enumerators.CarType;
import study.sem_3.enumerators.FuelType;
import study.sem_3.enumerators.GearBoxType;
import study.sem_3.interfaces.IRefuelStation;
import study.sem_3.interfaces.IWashingStation;

public class Pickup extends Car implements IRefuelStation, IWashingStation {
	
	private int loadCapacity;
	
	public Pickup(
			String make, 
			String model, 
			int numberWheels, 
			FuelType fuelType,
			GearBoxType gearBoxType, 
			Color color, 
			int engineVolume,
			int loadCapacity
			) {
		super(make, model, CarType.PICKUP, numberWheels, fuelType, gearBoxType, color, engineVolume);
		
		this.loadCapacity = loadCapacity;
	}

	@Override
	public void refill() {
	}

	@Override
	public void clearWindShield() {
	}

	@Override
	public void clearWindHeadLights() {
	}

	@Override
	public void clearMirrors() {
	}
	
}
