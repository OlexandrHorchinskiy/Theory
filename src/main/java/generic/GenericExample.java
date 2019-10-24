package generic;


public class GenericExample {
    public static void main(String[] args) {

        Vehicle<Car> vehicleCar = new Vehicle<>();
        vehicleCar.object = new Car();

        Vehicle<Motorcycle> vehicleMotorcycle = new Vehicle<>();
        vehicleMotorcycle.object = new Motorcycle();

        vehicleCar.getObject();
        vehicleMotorcycle.getObject();

    }
}