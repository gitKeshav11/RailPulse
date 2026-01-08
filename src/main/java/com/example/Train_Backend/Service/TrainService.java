package com.example.Train_Backend.Service;

import com.example.Train_Backend.Entity.Train;
import com.example.Train_Backend.Repository.TrainRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {
    private TrainRepo trainRepo;

    public TrainService(TrainRepo trainRepo) {
        this.trainRepo = trainRepo;
    }

    public List<Train> getAllTrains() {
        return trainRepo.findAll();
    }

    public Train addTrain(Train train) {
        return trainRepo.save(train);
    }
}
