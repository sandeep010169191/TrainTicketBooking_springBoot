package com.sandeep.TrainTicketBooking.service;

import java.util.List;

import com.sandeep.TrainTicketBooking.model.TrainBook;

public interface TrainBookService {

    String bookticket(TrainBook book);

    List<TrainBook> showMyticket();

    String cancelTicket(Integer id);

}
