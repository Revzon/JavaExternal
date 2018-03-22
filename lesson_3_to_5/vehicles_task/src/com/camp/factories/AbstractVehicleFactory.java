package com.camp.factories;

import com.camp.entities.Vehicle;

/**
 * Created by olga on 17.03.18.
 */
public abstract class AbstractVehicleFactory {

        public abstract Vehicle getVehicle(int n);
        public abstract Vehicle randVehicle();

}
