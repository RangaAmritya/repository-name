package com.example.demoTrain.repository;

import com.example.demoTrain.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PassengerRepo extends JpaRepository<Passenger,Long> {
}
