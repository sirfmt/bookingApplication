package com.booking.app.bookingApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class bookingsController {

    @GetMapping("/registration")
    public String bookingForm(Model model) {
        BookingData bData = new BookingData();
        model.addAttribute("bData", bData);
        return "booking";
    }

    @PostMapping("/registration")
    public String bookingSubmit(@ModelAttribute(value="bData") BookingData booking, BindingResult bindresult, Model model) {
        // model.addAttribute("results2", booking);
        // save booking to db
        return "results2";
    }

}