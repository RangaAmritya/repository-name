package com.example.demoTrain.entity;

import jakarta.persistence.*;


@Table(name="food_order")
@Entity
public class FoodOrder {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tickedId;
    private String trainId;
    private Long price;

    public FoodOrder(Long tickedId, String trainId, Long price) {
        this.tickedId = tickedId;
        this.trainId = trainId;
        this.price = price;
    }
    public FoodOrder(){

    }

    public Long getTickedId() {
        return tickedId;
    }

    public void setTickedId(Long tickedId) {
        this.tickedId = tickedId;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

}
