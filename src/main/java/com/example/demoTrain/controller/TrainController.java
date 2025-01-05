package com.example.demoTrain.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;


@RestController

public class TrainController {

    public static final Logger logger = LoggerFactory.getLogger(TrainController.class);

    @GetMapping("/loggerTest")
    public void getLogger(){
        int messageCount = 0;
        long maxSizeInBytes = 1024; // 1KB
        long currentSize = 0;
        while (currentSize < maxSizeInBytes) {
            String logMessage = "Log message " + messageCount;
            logger.info(logMessage);
            logger.error(logMessage);
            currentSize += logMessage.length();
            messageCount++;
        }
    }


}
