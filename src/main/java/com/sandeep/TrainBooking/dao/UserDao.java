package com.sandeep.TrainBooking.dao;

import com.sandeep.TrainBooking.model.TrainBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<TrainBook, Integer> {
}
