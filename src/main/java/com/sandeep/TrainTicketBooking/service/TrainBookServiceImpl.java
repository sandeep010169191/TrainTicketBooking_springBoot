package com.sandeep.TrainTicketBooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sandeep.TrainTicketBooking.dao.UserDao;
import com.sandeep.TrainTicketBooking.model.TrainBook;

import java.util.List;

@Component
public class TrainBookServiceImpl implements TrainBookService {

    @Autowired
    private UserDao userDao;

    @Override
    public String bookticket(TrainBook book) {
        userDao.save(book);
        return "Ticket Booked";
    }

    @Override
    public List<TrainBook> showMyticket() {
        return userDao.findAll();
    }

    @Override
    public String cancelTicket(Integer id) {
        userDao.deleteById(id);
        return "Ticket cancelled";
    }
}
