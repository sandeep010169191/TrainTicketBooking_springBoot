package com.sandeep.TrainTicketBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sandeep.TrainTicketBooking.model.TrainBook;
import com.sandeep.TrainTicketBooking.service.TrainBookServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/noauth")
public class UserController {

    @Autowired
    private TrainBookServiceImpl trainBookService;

    @PostMapping("/ticket")
    public String bookTicket(@RequestBody() TrainBook book) {
        return trainBookService.bookticket(book);
    }

    @GetMapping("/ticket")
    public List<TrainBook> getTicket() {
        return trainBookService.showMyticket();
    }

    @DeleteMapping("/ticket")
    public String cancelTicket(@RequestParam("id") Integer id) {
        return trainBookService.cancelTicket(id);
    }

}
