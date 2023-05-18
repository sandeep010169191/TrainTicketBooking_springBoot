package com.sandeep.TrainBooking.service;

import com.sandeep.TrainBooking.model.TrainBook;

import java.util.List;

public interface TrainBookService {

    String bookticket(TrainBook book);

    List<TrainBook> showMyticket();

    String cancelTicket(Integer id);

}
