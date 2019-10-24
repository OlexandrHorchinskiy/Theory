package oop.inheritance.exampleVehicle;

import oop.inheritance.exampleVehicle.motorVehicle.GearboxType;
import oop.inheritance.exampleVehicle.motorVehicle.MotorType;
import oop.inheritance.exampleVehicle.motorVehicle.car.Car;
import oop.inheritance.exampleVehicle.motorVehicle.car.CarBodyType;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMotorType(MotorType.DIESEL);
        car.setGearboxType(GearboxType.AUTOMATED);
        car.setBrand("Nissan");
        car.setModel("X-Trail");
        car.setCarBodyType(CarBodyType.SUV);
        car.setNumberOfSeats(5);
        car.setColor("червоний");
        car.setProductionYear(2019);

        System.out.println(car);
        car.move();
    }
}