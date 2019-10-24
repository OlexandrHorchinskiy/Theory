package oop.abstract_.abstractClass;

public class AbstractRestaurant {
    public static void main(String[] args) {
        Client client = new Client("Тарас");
        Dish dish = new Chicken(MethodOfCooking.GRILL);
        dish.cook();
        client.eat(dish);
    }
}