package study.sem_3.extra.second_extra;

public class Car extends Vehicle {
	
	public Car(int maxSpeed, String type) {
		super(maxSpeed, type);
	}
	
	public double calculateMaxSpeed() {
		return this.maxSpeed * 0.8;
		
	}

}
