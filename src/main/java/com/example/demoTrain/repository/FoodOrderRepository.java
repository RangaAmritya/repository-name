package com.example.demoTrain.repository;

import com.example.demoTrain.entity.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FoodOrderRepository extends JpaRepository<FoodOrder,Long> {
}
