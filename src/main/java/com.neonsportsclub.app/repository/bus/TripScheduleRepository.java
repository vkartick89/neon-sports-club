package com.neonsportsclub.app.repository.bus;

import com.neonsportsclub.app.model.bus.Trip;
import com.neonsportsclub.app.model.bus.TripSchedule;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kartick Vijayakumar.
 */
public interface TripScheduleRepository extends CrudRepository<TripSchedule, Long> {
    TripSchedule findByTripDetailAndTripDate(Trip tripDetail, String tripDate);
}