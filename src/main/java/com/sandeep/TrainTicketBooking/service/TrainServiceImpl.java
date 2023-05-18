package com.sandeep.TrainTicketBooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sandeep.TrainTicketBooking.dao.AdminDao;
import com.sandeep.TrainTicketBooking.model.TrainDetails;

import java.util.List;
import java.util.Optional;

@Component
public class TrainServiceImpl implements TrainService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public String saveTrains(List<TrainDetails> details) {
        adminDao.saveAll(details);
        return "Train Details added " + details.size();
    }

    @Override
    public List<TrainDetails> getTrains() {
        return adminDao.findAll();

    }

    @Override
    public Optional<TrainDetails> getTrain(Integer trainId) {
        return (Optional<TrainDetails>) adminDao.findById(trainId);
    }

    @Override
    public String updateTrain(TrainDetails detail) {
        adminDao.save(detail);
        return "Train Details Updated";
    }

    @Override
    public String deleteTrain(Integer id) {
        adminDao.deleteById(id);
        return "Train Details Deleted";
    }
}
