package study.sem_3.extra.second_extra;

public class Bus extends Vehicle {

	public Bus(int maxSpeed, String type) {
		super(maxSpeed, type);
	}
	
	public double calculateMaxSpeed() {
		return this.maxSpeed * 0.6;
	}

}
