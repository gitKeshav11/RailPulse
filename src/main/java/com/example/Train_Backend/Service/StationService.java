package com.example.Train_Backend.Service;

import com.example.Train_Backend.Entity.Station;
import com.example.Train_Backend.Entity.Train;
import com.example.Train_Backend.Repository.StationRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService {
    private StationRepo stationRepo;

    public StationService(StationRepo stationRepo) {
        this.stationRepo = stationRepo;
    }

    public List<Station> getAllStations() {
        return stationRepo.findAll();
    }
}
