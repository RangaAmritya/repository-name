package com.example.demoTrain.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
@Table(name="passenger")
@Entity
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tickedId;

    private String trainNo;
    private LocalDate date;
    private int age;
    private String gender;

    public Passenger(){

    }

    public Passenger(Long tickedId, String trainNo, LocalDate date, int age, String gender) {
        this.tickedId = tickedId;
        this.trainNo = trainNo;
        this.date = date;
        this.age = age;
        this.gender = gender;
    }

    public Long getTickedId() {
        return tickedId;
    }

    public void setTickedId(Long tickedId) {
        this.tickedId = tickedId;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
