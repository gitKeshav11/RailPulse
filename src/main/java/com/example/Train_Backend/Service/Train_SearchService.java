package com.example.Train_Backend.Service;

import com.example.Train_Backend.Entity.Train_Schedule;
import com.example.Train_Backend.Repository.Train_ScheduleRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Train_SearchService {
    private Train_ScheduleRepo train_scheduleRepo;

    public Train_SearchService(Train_ScheduleRepo train_scheduleRepo) {
        this.train_scheduleRepo = train_scheduleRepo;
    }

    public List<Train_Schedule> findTrainsByStationCode(String sourceCode, String destinationCode) {
        return train_scheduleRepo.findBySource_StationCodeAndDestination_StationCode(sourceCode,destinationCode);
    }

    public List<Train_Schedule> findTrainsByStationName(String sourceName, String destinationName) {
        return train_scheduleRepo.findBySource_StationNameAndDestination_StationName(sourceName,destinationName);
    }
}
