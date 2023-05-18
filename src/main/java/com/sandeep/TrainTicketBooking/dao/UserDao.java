package com.sandeep.TrainTicketBooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandeep.TrainTicketBooking.model.TrainBook;

public interface UserDao extends JpaRepository<TrainBook, Integer> {
}
