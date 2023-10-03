package study.sem_4.Models;

import java.util.List;

/**
 * Модель перевозчика
 */
public class Carrier {
	private String gosNumber;
	private int id;
	private long cardNumber;
	private boolean isReady;
	List<Integer> zones;
	
    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

	public int getId() {
		return this.id;
	}
	
	public long getCardNumber() {
		return this.cardNumber;
	}

}
