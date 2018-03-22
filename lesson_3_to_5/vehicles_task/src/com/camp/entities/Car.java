package com.camp.entities;


public class Car extends Vehicle{


    public Car(int price, int yearOfIssue, int speed) {

        super(price, yearOfIssue, speed);

    }

    public Car() {
        super();
    }


    @Override
    public String toString() {
        return "Car{" +
                "V = " + super.getSpeed() +
                ", price = " + super.getPrice() +
                ", year of issue = " + super.getYearOfIssue() +
                '}';
    }

}
