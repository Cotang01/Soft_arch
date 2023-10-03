package study.sem_4.Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {

    private int card;
	private int oldCard;
	private int balance;

	public BankAccount() {
        this.card = oldCard + 1;
        oldCard = this.card;
        balance = 1000;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }

	public int getCard() {
		return this.card;
	}

	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int i) {
		this.balance = i;
	}
}
