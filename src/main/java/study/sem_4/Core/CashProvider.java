package study.sem_4.Core;

import study.sem_4.Interfaces.ICarrierRepo;
import study.sem_4.Interfaces.ICashRepo;
import study.sem_4.Models.BankAccount;
import study.sem_4.Models.Carrier;
import study.sem_4.Models.Ticket;
import study.sem_4.Models.User;
import study.sem_4.Services.CarrierRepository;
import study.sem_4.Services.CashRepository;

/**
 * Класс - провайдер для взаимодействия с банком и базой перевозчиков
 */
public class CashProvider {

	private long cardNumber;
	private boolean isAuthorised;
	private ICarrierRepo carrierRepository;
	private ICashRepo cashRepository;

	/**
     * Конструктор класса
     */
    public CashProvider(long cardNumber) {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.carrierRepository = CarrierRepository.getCarrierRepository();
        this.cashRepository = CashRepository.getCashRepository();
    }

    /**
     * Метод покупки билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     * @throws RuntimeException
     */
    
	public boolean buy(Ticket ticket) {
		Carrier carrier = carrierRepository.read(1);
		return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
	}

    /**
     * Метод авторизации клиента. Здесь должно быть реализовано обращение к банку для подтверждения личности клиента.
     *
     * @param client
     */
	
	public void authorization(User client) {
		for (BankAccount bankClient : CashRepository.getCashRepository().getClients()) {
			if (bankClient.getCard() == client.getCardNumber()) {
				this.isAuthorised = true;
			}
		}
	}


}
