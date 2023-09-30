package study.sem_3.extra.second_extra;

public abstract class Vehicle {
	
	protected int maxSpeed;
	private String type;
	
	public Vehicle(int maxSpeed, String type) {
		this.maxSpeed = maxSpeed;
		this.type = type;
	}
	
	public double getMaxSpeed() {
		return this.maxSpeed;
	}
	
	public String getType() {
		return this.type;
	}
	
	public double calculateMaxSpeed() {
		return 0;
	}
}