//package com.example.demoTrain.config;
//
//import ch.qos.logback.classic.Logger;
//import ch.qos.logback.classic.LoggerContext;
//import ch.qos.logback.core.ConsoleAppender;
//import ch.qos.logback.core.rolling.RollingFileAppender;
//import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;
//import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
//import ch.qos.logback.core.status.NopStatusListener;
//import ch.qos.logback.core.util.FileSize;
//import ch.qos.logback.core.util.StatusPrinter;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//
//@Component
//public class LogbackConfig {
//
//    public LogbackConfig(){
//        configure();
//    }
//    private void configure() {
//        // Get the logger context
//        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
//        context.reset(); // Reset any default configuration
//        context.getStatusManager().add(new NopStatusListener());
//        context.getLogger(Logger.ROOT_LOGGER_NAME).detachAndStopAllAppenders();
//        context.setPackagingDataEnabled(false);
//        // Configure the console appender
//        ConsoleAppender consoleAppender = new ConsoleAppender();
//        consoleAppender.setContext(context);
//
//        PatternLayoutEncoder consoleEncoder = new PatternLayoutEncoder();
//        consoleEncoder.setContext(context);
//        consoleEncoder.setPattern("%d{yyyy-MM-dd HH:mm:ss} %-5level %logger{36} - %msg%n");
//        consoleEncoder.start(); // Ensure the encoder is started before appender
//
//        consoleAppender.setEncoder(consoleEncoder); // Set the encoder
//        consoleAppender.start(); // Start the appender
//
//        // Configure the rolling file appender
//        RollingFileAppender rollingFileAppender = new RollingFileAppender();
//        rollingFileAppender.setContext(context);
//        rollingFileAppender.setFile("logs/application.log"); // Main log file
//
//        PatternLayoutEncoder fileEncoder = new PatternLayoutEncoder();
//        fileEncoder.setContext(context);
//        fileEncoder.setPattern("%d{yyyy-MM-dd HH:mm:ss} %-5level %logger{36} - %msg%n");
//        fileEncoder.start(); // Ensure the encoder is started before appender
//
//        // Configure rolling policy (SizeAndTimeBasedRollingPolicy)
//        SizeAndTimeBasedRollingPolicy rollingPolicy = new SizeAndTimeBasedRollingPolicy();
//        rollingPolicy.setContext(context);
//        rollingPolicy.setParent(rollingFileAppender);
//        rollingPolicy.setFileNamePattern("logs/application.%d{yyyy-MM-dd}.%i.zip");
//        FileSize fileSize = new FileSize(1024);
//        rollingPolicy.setMaxFileSize(fileSize);
//        rollingPolicy.setMaxHistory(5); // Keep logs for 30 days
//        rollingPolicy.start(); // Start the rolling policy
//
//        rollingFileAppender.setEncoder(fileEncoder); // Set the encoder
//        rollingFileAppender.setRollingPolicy(rollingPolicy); // Set the rolling policy
//        rollingFileAppender.start(); // Start the appender
//
//        // Attach appenders to the root logger
//        Logger rootLogger = context.getLogger("ROOT");
//        rootLogger.addAppender(consoleAppender);
//        rootLogger.addAppender(rollingFileAppender);
//
//        // Print status of the logger context for debugging
//        StatusPrinter.print(context);
//    }
//}
