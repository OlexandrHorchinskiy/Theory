package oop.inheritance.exampleVehicle.motorVehicle;

import oop.inheritance.exampleVehicle.Vehicle;
import oop.inheritance.exampleVehicle.VehicleType;

public class MotorVehicle extends Vehicle {
    public final VehicleType vehicleType = VehicleType.MOTOR_VEHICLES;
    public MotorType motorType;
    public GearboxType gearboxType;
    public String color;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public MotorType getMotorType() {
        return motorType;
    }

    public void setMotorType(MotorType motorType) {
        this.motorType = motorType;
    }

    public GearboxType getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(GearboxType gearboxType) {
        this.gearboxType = gearboxType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}