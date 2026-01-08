package com.example.Train_Backend.Repository;

import com.example.Train_Backend.Entity.Train_Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Train_ScheduleRepo extends JpaRepository<Train_Schedule,Long> {
    List<Train_Schedule> findBySource_StationCodeAndDestination_StationCode(String sourceCode, String destinationCode);

    List<Train_Schedule> findBySource_StationNameAndDestination_StationName(String sourceName, String destinationName);
}
