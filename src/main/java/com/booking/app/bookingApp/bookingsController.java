package com.booking.app.bookingApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class bookingsController {

    @GetMapping("/registration")
    public String bookingForm(Model model) {
        model.addAttribute("booking", new BookingData());
        return "booking";
    }

    @PostMapping("/registration")
    public String bookingSubmit(@ModelAttribute BookingData booking) {
        return "results2";
    }

}