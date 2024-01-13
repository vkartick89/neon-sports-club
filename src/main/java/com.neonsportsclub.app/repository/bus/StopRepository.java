package com.neonsportsclub.app.repository.bus;

import com.neonsportsclub.app.model.bus.Stop;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kartick Vijayakumar.
 */
public interface StopRepository extends CrudRepository<Stop, Long> {
    Stop findByCode(String code);
}
