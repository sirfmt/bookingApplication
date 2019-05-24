package com.booking.app.bookingApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class booking{

    @Autowired
    private bookingService bookingInstance;

@RequestMapping("/allbookings")
 public List<BookingData> showBookings(){
     return bookingInstance.getAllRecords();
    }
      
@RequestMapping(method=RequestMethod.POST, value="/register", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
 public void addBooking( BookingData bookingObj){
     bookingInstance.addBooking(bookingObj);
    }

@RequestMapping(method=RequestMethod.PUT, value="bookings/edit/{bookingId}")
public void editBooking(@PathVariable int bookingId, @RequestBody BookingData obj ){
    bookingInstance.edit(bookingId, obj);
    return ;
    }

@RequestMapping(method=RequestMethod.DELETE, value="/bookings/del/{bookingId}")
public void deleteBooking(@PathVariable int bookingId ){
     bookingInstance.deleteBooking(bookingId);
    }  

@RequestMapping(value="/welcome", method=RequestMethod.POST)
public void welcomeUser(Integer bookingId, String firstName, String surname, String comment) {
        BookingData obj = new BookingData(bookingId, firstName, surname, comment);
        bookingInstance.addBooking(obj);
		return ;
	}      
}