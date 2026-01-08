package com.example.Train_Backend.Repository;

import com.example.Train_Backend.Entity.Station;
import com.example.Train_Backend.Entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepo extends JpaRepository<Station,Long> {
}
