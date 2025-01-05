package com.example.demoTrain.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogGenerator {

    private static final Logger logger = LoggerFactory.getLogger(LogGenerator.class);

    public static void main(String[] args) {
        // Create a loop that generates log entries to fill 1KB
        int messageCount = 0;
        long maxSizeInBytes = 1024; // 1KB
        long currentSize = 0;

        while (currentSize < maxSizeInBytes) {
            String logMessage = "Log message " + messageCount;
            logger.info(logMessage);
            currentSize += logMessage.length();
            messageCount++;
        }

        System.out.println("Generated log up to " + currentSize + " bytes.");
    }
}
