package com.sandeep.TrainBooking.dao;

import com.sandeep.TrainBooking.model.TrainDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDao extends JpaRepository<TrainDetails, Integer> {
}
