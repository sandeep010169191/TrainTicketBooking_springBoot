package com.sandeep.TrainTicketBooking.service;

import java.util.List;
import java.util.Optional;

import com.sandeep.TrainTicketBooking.model.TrainDetails;

public interface TrainService {

    String saveTrains(List<TrainDetails> details);

    List<TrainDetails> getTrains();

    Optional<TrainDetails> getTrain(Integer trainId);

    String updateTrain(TrainDetails detail);

    String deleteTrain(Integer id);
}
