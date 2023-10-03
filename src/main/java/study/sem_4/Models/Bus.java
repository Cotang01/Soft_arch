package study.sem_4.Models;

public abstract class Bus {
	
	public Bus(String gosNumber, int id, int placesCap, boolean isReady) {
		
		this.gosNumber = gosNumber;
		this.id = id;
		this.placesCap = placesCap;
		this.isReady = isReady;
		
	}

	private String gosNumber;
	private int id;
	private int placesCap;
	private boolean isReady;
	
	public boolean isReady() {
		return isReady;
	}
	
	public void setReady(boolean isReady) {
		this.isReady = isReady;
	}
	
	public String getGosNumber() {
		return gosNumber;
	}
	
	public int getId() {
		return id;
	}
	
	public int getPlacesCap() {
		return placesCap;
	}
	
}
