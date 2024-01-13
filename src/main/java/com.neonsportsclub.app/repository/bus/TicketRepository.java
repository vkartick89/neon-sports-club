package com.neonsportsclub.app.repository.bus;

import com.neonsportsclub.app.model.bus.Ticket;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kartick Vijayakumar.
 */
public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
