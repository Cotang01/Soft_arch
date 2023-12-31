package study.sem_4.Core;

import study.sem_4.Interfaces.ITicketRepo;
import study.sem_4.Models.Ticket;
import study.sem_4.Services.TicketRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс - провайдер для работы с базой данных билетов
 */
public class TicketProvider {

    private TicketRepository ticketRepo;

	public TicketProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.ticketRepo = TicketRepository.getTicketRepository();
    }

    /**
     * Метод получения билетов из базы данных
     *
     * @param routeNumber номер маршрута
     * @return список билетов
     * @throws RuntimeException
     */
	
	public List<Ticket> getTickets(int route) throws RuntimeException {
		return ticketRepo.readAll(route);
	}

    /**
     * Метод обновления статуса билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     */
	
	public boolean updateTicketStatus(Ticket ticket) {
		return ticketRepo.update(ticket);
	}

}
