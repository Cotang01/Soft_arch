package study.sem_4.Models;

import java.util.List;
import java.util.Objects;

/**
 * Модель пользователя
 */
public class User {

    private int id;
	private String userName;
	private int hashPassword;
	private long cardNumber;
	private int phone;
	private List<String> benefits;

	public User(int id, String userName, int hashPassword, long cardNumber) {
        this.id = id;
        this.userName = userName;
        this.hashPassword = hashPassword;
        this.cardNumber = cardNumber;
    }


    @Override
    public String toString() {
        return "Client { " +
                "id= " + id +
                ", userName= " + userName +
                ", cardNumber= " + (String.format("%016d", cardNumber)) +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        User client = (User) o;
        return this.equals(client);
    }


    public boolean equals(User client) {
        return this.id == client.id && 
        		this.hashPassword == client.hashPassword && 
        		this.cardNumber == client.cardNumber && 
        		this.userName.equals(client.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, hashPassword, cardNumber);
    }


	public String getUserName() {
		return this.userName;
	}


	public int getHashPassword() {
		return this.hashPassword;
	}

	public int getId() {
		return this.id;
	}
	public long getCardNumber() {
		return this.cardNumber;
	}
}
