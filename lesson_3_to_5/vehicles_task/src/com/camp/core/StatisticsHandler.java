package com.camp.core;

import com.camp.interfaces.iMove;
import com.camp.interfaces.iFly;
import com.camp.interfaces.iSwim;
import com.camp.entities.Car;
import com.camp.entities.Ship;
import com.camp.entities.Vehicle;

import java.time.Year;
import java.util.Arrays;

/**
 * Created by olga on 16.03.18.
 */
public class StatisticsHandler {

    Vehicle[] vehicles;
    public StatisticsHandler() {
    }

    public StatisticsHandler(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }


    public void findYoungCars(int year) {

        Car[] cars = new Car[10000];
        int carCounter = -1;

        int minYear = Year.now().getValue() - year;

        for (Vehicle v: this.vehicles) {

            if (("com.camp.entities.Car").equals(v.getClass().getName()) && v.getYearOfIssue() > minYear) {
                cars[++carCounter] = (Car) v;
                System.out.println(cars[carCounter].toString());
            }

        }

        cars = Arrays.copyOfRange(cars, 0, carCounter++);

        if (cars.length == 0) {
            System.out.println("There are no cars satisfying these parameters!");
            return;
        }

    }


    public void findYoungShipsAndSort(int year) {

        Ship[] ships = new Ship[this.vehicles.length];
        int shipCounter = -1;
        int minYear = Year.now().getValue() - year;

        for (Vehicle v: this.vehicles) {

            if (("com.camp.entities.Ship").equals(v.getClass().getName()) && v.getYearOfIssue() >= minYear) {
                ships[++shipCounter] = (Ship) v;
            }

        }

        ships = Arrays.copyOfRange(ships, 0, shipCounter+1);

        sortShips(ships);

        if (ships.length == 0) {
            System.out.println("There are no ships satisfying these parameters!");
            return;
        }

        for (Ship sh: ships) {
            System.out.println(sh.toString());
        }
    }


    private void sortShips(Ship[] ships) {

        for (int i = ships.length - 1; i > -1; i--) {
            for (int j = 0; j < i; j++) {

                if (ships[j].compareTo(ships[j+1]) < 0) {
                    Ship tempShip = ships[j];
                    ships[j] = ships[j+1];
                    ships[j + 1] = tempShip;
                }

            }
        }
    }


    public void findMostExpensiveVehicle() {

        long maxPrice = this.vehicles[0].getPrice();
        Vehicle[] targetVehicles = new Vehicle[this.vehicles.length];
        int countExpensiveVehicles = -1;
        targetVehicles[++countExpensiveVehicles] = this.vehicles[0];

        for (Vehicle v: this.vehicles) {

            if (v.getPrice() > maxPrice){
                maxPrice = v.getPrice();

                Arrays.fill(targetVehicles, null);
                countExpensiveVehicles = -1;
                targetVehicles[++countExpensiveVehicles] = v;

            } else if (v.getPrice() == maxPrice) {
                targetVehicles[++countExpensiveVehicles] = v;
            }

        }

        targetVehicles = Arrays.copyOfRange(targetVehicles, 0, ++countExpensiveVehicles);

        System.out.println("The most expensive vehicles:");
        for (Vehicle targetV: targetVehicles) {
            System.out.println(targetV.toString());
        }

    }


    public void findVehicleByCriteriums(int minYear, int maxYear, double minSpeed) {

        long minPrice = this.vehicles[0].getPrice();
        Vehicle[] targetVehicles = new Vehicle[this.vehicles.length];
        int countCheapVehicles = -1;


        for (Vehicle v: this.vehicles) {

            if ((v.getYearOfIssue() >= minYear)
                    &&(v.getYearOfIssue() <= maxYear)
                    &&(v.getSpeed() >= minSpeed)) {

                    if (v.getPrice() < minPrice){
                        minPrice = v.getPrice();
                        Arrays.fill(targetVehicles, null);
                        countCheapVehicles = -1;
                        targetVehicles[++countCheapVehicles] = v;

                    } else if (v.getPrice() == minPrice) {
                            targetVehicles[++countCheapVehicles] = v;
                    }
            }
        }

        targetVehicles = Arrays.copyOfRange(targetVehicles, 0, countCheapVehicles + 1);

        if (targetVehicles.length == 0) {
            System.out.println("There are no vehicles satisfying these parameters!");
            return;
        }

        System.out.println("The cheapest vehicles with given parameters:");
        for (Vehicle targetV: targetVehicles) {
            System.out.println(targetV.toString());
        }

    }


}



