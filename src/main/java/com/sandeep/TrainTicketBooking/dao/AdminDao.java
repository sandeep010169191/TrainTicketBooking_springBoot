package com.sandeep.TrainTicketBooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandeep.TrainTicketBooking.model.TrainDetails;

public interface AdminDao extends JpaRepository<TrainDetails, Integer> {
}
