package com.booking.app.bookingApp;

import org.springframework.data.repository.CrudRepository;

public interface BookingDataRepository extends CrudRepository<BookingData, Integer> {
    
}