package com.example.Train_Backend.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Train {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String trainName;
    private String trainNumber;

@OneToMany(mappedBy = "train",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
@JsonBackReference
    private List<Train_Schedule> train_schedules;

    public Train(Long id, String trainName, String trainNumber, List<Train_Schedule> train_schedules) {
        this.id = id;
        this.trainName = trainName;
        this.trainNumber = trainNumber;
        this.train_schedules = train_schedules;
    }
}
