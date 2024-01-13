package com.neonsportsclub.app.repository.bus;

import com.neonsportsclub.app.model.bus.Agency;
import com.neonsportsclub.app.model.bus.Bus;
import com.neonsportsclub.app.model.bus.Stop;
import com.neonsportsclub.app.model.bus.Trip;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Kartick Vijayakumar.
 */
public interface TripRepository extends CrudRepository<Trip, Long> {
    Trip findBySourceStopAndDestStopAndBus(Stop source, Stop destination, Bus bus);

    List<Trip> findAllBySourceStopAndDestStop(Stop source, Stop destination);

    List<Trip> findByAgency(Agency agency);
}
