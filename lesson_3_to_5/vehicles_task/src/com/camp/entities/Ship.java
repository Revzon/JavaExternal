package com.camp.entities;

public class Ship extends Vehicle{

    int passengers;
    int portId;

    public Ship(int price, int yearOfIssue, int speed, int passengers, int portId) {
        super(price, yearOfIssue, speed);
        this.passengers = passengers;
        this.portId = portId;
    }

    public Ship() {
        super();
        this.passengers = 20;
        this.portId = 0;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPortId() {
        return portId;
    }

    public void setPortId(int portId) {
        this.portId = portId;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "V = " + super.getSpeed() +
                ", price = " + super.getPrice() +
                ", year of issue = " + super.getYearOfIssue() +
                ", passengers = " + passengers +
                ", port of registry = " + portId +
                '}';
    }


    public long compareTo(Ship sh2) {
        return this.getPrice() - sh2.getPrice();
    }
}
