package com.neonsportsclub.app.dto.mapper;

import com.neonsportsclub.app.dto.model.bus.TripScheduleDto;
import com.neonsportsclub.app.model.bus.Trip;
import com.neonsportsclub.app.model.bus.TripSchedule;

/**
 * Created by Kartick Vijayakumar.
 */
public class TripScheduleMapper {
    public static TripScheduleDto toTripScheduleDto(TripSchedule tripSchedule) {
        Trip tripDetails = tripSchedule.getTripDetail();
        return new TripScheduleDto()
                .setId(tripSchedule.getId())
                .setTripId(tripDetails.getId())
                .setBusCode(tripDetails.getBus().getCode())
                .setAvailableSeats(tripSchedule.getAvailableSeats())
                .setFare(tripDetails.getFare())
                .setJourneyTime(tripDetails.getJourneyTime())
                .setSourceStop(tripDetails.getSourceStop().getName())
                .setDestinationStop(tripDetails.getDestStop().getName());
    }
}
