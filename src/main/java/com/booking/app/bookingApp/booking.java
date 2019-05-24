package com.booking.app.bookingApp;

/*import java.text.DateFormat;
import java.util.Date;*/
//import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
class BookingData{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="bookingID")
    int bookingID;
    String firstName;
    String surname;
   /*Calendar startDate;
    Calendar endDate;*/
    String comment;

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    /*
       public Calendar getStartDate() {
        return startDate;
    }


    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }*/

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    public BookingData(){
    }
    /**
     * @return the bookingID
     */
    public int getBookingID() {
        return bookingID;
    }

    /**
     * @param bookingID the bookingID to set
     */
    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }
    
    public BookingData( int bookingId, String firstName, String surname, String comment){
        this.bookingID = bookingId; 
        this.firstName = firstName;
        this.surname = surname;
        /*this.startDate = startDate;  Calendar startDate, Calendar endDate, 
        this.endDate = endDate;*/
        this.comment = comment; 
    
    }

}