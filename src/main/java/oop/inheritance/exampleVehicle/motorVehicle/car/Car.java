package oop.inheritance.exampleVehicle.motorVehicle.car;

import oop.inheritance.exampleVehicle.motorVehicle.MotorVehicle;
import oop.inheritance.exampleVehicle.motorVehicle.MotorVehicleType;

public class Car extends MotorVehicle {
    final MotorVehicleType motorVehicleType = MotorVehicleType.CAR;
    int numberOfSeats;
    CarBodyType carBodyType;

    public CarBodyType getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(CarBodyType carBodyType) {
        this.carBodyType = carBodyType;
    }

    public MotorVehicleType getMotorVehicleType() {
        return motorVehicleType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                " \n\tvehicleType=" + vehicleType +
                ", \n\tmotorVehicleType=" + motorVehicleType +
                ", \n\tbrand='" + brand + '\'' +
                ", \n\tmodel='" + model + '\'' +
                ", \n\tcarBodyType=" + carBodyType +
                ", \n\tmotorType=" + motorType +
                ", \n\tgearboxType=" + gearboxType +
                ", \n\tnumberOfSeats=" + numberOfSeats +
                ", \n\tcolor='" + color + '\'' +
                ", \n\tproductionYear=" + productionYear +
                '}';
    }
}