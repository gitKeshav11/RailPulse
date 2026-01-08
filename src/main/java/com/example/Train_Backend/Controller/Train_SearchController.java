package com.example.Train_Backend.Controller;

import com.example.Train_Backend.Entity.Train_Schedule;
import com.example.Train_Backend.Service.Train_SearchService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/SearchTrain")
@CrossOrigin
public class Train_SearchController {
    private Train_SearchService train_searchService;

    public Train_SearchController(Train_SearchService train_searchService) {
        this.train_searchService = train_searchService;
    }

    @GetMapping("/by-code")
    public List<Train_Schedule> findTrainsByStationCode(@RequestParam String sourceCode,
                                                        @RequestParam String destinationCode) {
        return train_searchService.findTrainsByStationCode(sourceCode, destinationCode);
    }

    @GetMapping("/by-name")
    public List<Train_Schedule> findTrainsByStationName(@RequestParam String sourceName,
                                                        @RequestParam String destinationName) {
        return train_searchService.findTrainsByStationName(sourceName, destinationName);
    }
}
