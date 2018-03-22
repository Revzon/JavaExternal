package com.camp.factories;

import com.camp.entities.*;
import com.camp.factories.AbstractVehicleFactory;

/**
 * Created by olga on 20.03.18.
 */
public class VehicleFactory extends AbstractVehicleFactory {
    private final int TYPE_VEHICLE = 3;

    @Override
    public Vehicle getVehicle(int n) {
        switch (n) {
            case 0:
                return new Car();
            case 1:
                return new Ship();
            case 2:
                return new Plane();
            default:
                System.out.println("Enter com.camp.entities.Vehicle");
                return null;
        }

    }


    @Override
    public Vehicle randVehicle () {
        return getVehicle((int) (Math.random() * TYPE_VEHICLE));
    }

}

