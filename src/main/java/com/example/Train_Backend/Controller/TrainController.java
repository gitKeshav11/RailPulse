package com.example.Train_Backend.Controller;

import com.example.Train_Backend.Entity.Train;
import com.example.Train_Backend.Repository.TrainRepo;
import com.example.Train_Backend.Service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Train")
public class TrainController {
    private TrainService trainService;

    // when we have only 1 variable then, no need to write @Autoeired
    public TrainController(TrainService trainService) {
        this.trainService = trainService;
    }
    @GetMapping("/getTrain")
    public List<Train> getAllTrains(){
            return trainService.getAllTrains();
}

@PostMapping("/addTrain")
    public Train addTrain(@RequestBody Train train){
        return trainService.addTrain(train);
}
}
