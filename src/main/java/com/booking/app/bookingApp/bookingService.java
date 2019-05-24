package com.booking.app.bookingApp;

import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bookingService{

  @Autowired  
  private BookingDataRepository bookingRepository;  

  public List<BookingData> getAllRecords(){
    List<BookingData> bookingRecords = new ArrayList<>();
    bookingRepository.findAll().forEach(bookingRecords::add); 
    return bookingRecords;    
  }

    public void addBooking (BookingData bookingObj){
    bookingRepository.save(bookingObj);
    return;
}

    public void edit(int bookingId ,BookingData obj){
      bookingRepository.save(obj);
    }

	public void deleteBooking(int bookingId) {
    bookingRepository.deleteById(bookingId);
	}

   // public Optional<BookingData> 

}