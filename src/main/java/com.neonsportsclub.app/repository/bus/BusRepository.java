package com.neonsportsclub.app.repository.bus;

import com.neonsportsclub.app.model.bus.Agency;
import com.neonsportsclub.app.model.bus.Bus;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kartick Vijayakumar.
 */
public interface BusRepository extends CrudRepository<Bus, Long> {
    Bus findByCode(String busCode);

    Bus findByCodeAndAgency(String busCode, Agency agency);
}
