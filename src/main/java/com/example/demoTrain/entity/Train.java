package com.example.demoTrain.entity;

import jakarta.persistence.*;

import java.util.Set;

@Table(name="train")
@Entity
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long trainNo;
    private String source;
    private String destination;

    public Train(){}

    public Train(Long trainNo, String source, String destination) {
        this.trainNo = trainNo;
        this.source = source;
        this.destination = destination;
    }

    public Long getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(Long trainNo) {
        this.trainNo = trainNo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
