package com.example.henri.model;


public class RandomModel {
    public int getRandomNumber() {
        return (int) Math.floor((Math.random() * 10) + 1);
    }
}
