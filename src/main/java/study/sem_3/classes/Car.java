package study.sem_3.classes;

import java.awt.Color;

import study.sem_3.enumerators.CarType;
import study.sem_3.enumerators.FuelType;
import study.sem_3.enumerators.GearBoxType;

public abstract class Car {
	
	public Car(
			String make, 
			String model, 
			CarType bodyType, 
			int numberWheels, 
			FuelType fuelType,
			GearBoxType gearBoxType, 
			Color color, 
			int engineVolume
			) {
		super();
		
		this.make = make;
		this.model = model;
		this.bodyType = bodyType;
		this.numberWheels = numberWheels;
		this.fuelType = fuelType;
		this.gearBoxType = gearBoxType;
		this.color = color;
		this.engineVolume = engineVolume;
	}
	private String make;
	private String model;
	private CarType bodyType;
	private int numberWheels;
	private FuelType fuelType;
	private GearBoxType gearBoxType;
	private Color color;
	private int engineVolume;
	
	public void movement() {
		
	}
	
	public void maintenance() {
		
	}
	
	public void switchLights() {
		
	}
	
	public void switchWrappers() {
		
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public CarType getBodyType() {
		return bodyType;
	}

	public void setBodyType(CarType bodyType) {
		this.bodyType = bodyType;
	}

	public int getNumberWheels() {
		return numberWheels;
	}

	public void setNumberWheels(int numberWheels) {
		this.numberWheels = numberWheels;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

	public GearBoxType getGearBoxType() {
		return gearBoxType;
	}

	public void setGearBoxType(GearBoxType gearBoxType) {
		this.gearBoxType = gearBoxType;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getEngineVolume() {
		return engineVolume;
	}

	public void setEngineVolume(int engineVolume) {
		this.engineVolume = engineVolume;
	}
}	

