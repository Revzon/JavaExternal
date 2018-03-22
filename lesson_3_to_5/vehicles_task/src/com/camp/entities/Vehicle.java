package com.camp.entities;

import java.time.Year;


abstract public class Vehicle implements Comparable<Vehicle> {
    private long price;
    private int yearOfIssue;
   private int speed;


    public Vehicle() {
        this.price = (long) Math.random()*100000;
        this.yearOfIssue = Year.now().getValue();
        this.speed = (int) Math.random()*100;
    }


    public Vehicle(int price, int yearOfIssue, int speed) {
        this.price = price;
        this.yearOfIssue = yearOfIssue;
        this.speed = speed;
    }


    public long getPrice() {
        return price;
    }


    public void setPrice(long price) {
        this.price = price;
    }


    public int getYearOfIssue() {
        return yearOfIssue;
    }


    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }


    public double getSpeed() {
        return this.speed;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }


    @Override
    public int compareTo(Vehicle o) {
        return 0;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "price = " + price +
                ", yearOfIssue = " + yearOfIssue +
                ", velocity = " + speed +
                '}';
    }


}

