package com.camp.entities;

/**
 * Created by olga on 16.03.18.
 */
public class Plane extends Vehicle{

    int passengers;
    double height;

    public Plane(int price, int yearOfIssue, int speed, int passengers, double height) {
        super(price, yearOfIssue, speed);
        this.passengers = passengers;
        this.height = height;
    }

    public Plane() {
        super();
        this.passengers = 20;
        this.height = 100.0;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "V = " + super.getSpeed() +
                ", price = " + super.getPrice() +
                ", year of issue = " + super.getYearOfIssue() +
                ", passengers = " + passengers +
                ", height = " + height +
                '}';
    }

}
