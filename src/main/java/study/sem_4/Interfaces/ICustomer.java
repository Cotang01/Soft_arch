package study.sem_4.Interfaces;

import java.util.Date;
import java.util.List;

import study.sem_4.Core.UserProvider;
import study.sem_4.Models.Ticket;
import study.sem_4.Models.User;

/**
 * Интерфейс взаимодействия с клиентским приложением
 */
public interface ICustomer {
	
    List<Ticket> getSelectedTickets();

    void setSelectedTickets(List<Ticket> selectedTickets);

    User getUser();

    void setUser(User client);

    UserProvider getUserProvider();

    /**
     * Метод покупки билета
     *
     * @param ticket билет
     * @return успешность выполненной операции
     * @throws RuntimeException
     */
    boolean buyTicket(Ticket ticket) throws RuntimeException;

    /**
     * Метод поиска билетов по дате и номеру маршрута
     *
     * @param date  дата
     * @param route номер маршрута
     * @return список доступных для приобретения билетов
     * @throws RuntimeException
     */
    List<Ticket> searchTicket(Date date, int route) throws RuntimeException;
}
