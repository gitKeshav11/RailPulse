package com.example.Train_Backend.Controller;

import com.example.Train_Backend.Entity.Station;
import com.example.Train_Backend.Entity.Train;
import com.example.Train_Backend.Service.StationService;
import com.example.Train_Backend.Service.TrainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/station")
public class StationController {


    private StationService stationService;

    // when we have only 1 variable then, no need to write @Autoeired
    public StationController(StationService stationService) {
        this.stationService = stationService;
    }

    @GetMapping("/getStation")
    public List<Station> getAllStation() {
        return stationService.getAllStations();
    }
}