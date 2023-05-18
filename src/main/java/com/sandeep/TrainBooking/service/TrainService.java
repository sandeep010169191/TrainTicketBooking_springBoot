package com.sandeep.TrainBooking.service;

import com.sandeep.TrainBooking.model.TrainDetails;

import java.util.List;
import java.util.Optional;

public interface TrainService {

    String saveTrains(List<TrainDetails> details);

    List<TrainDetails> getTrains();

    Optional<TrainDetails> getTrain(Integer trainId);

    String updateTrain(TrainDetails detail);

    String deleteTrain(Integer id);
}
