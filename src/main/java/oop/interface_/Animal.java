package oop.interface_;

public class Animal implements Info {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public void showInfo() {
        System.out.println("ID is " + id);
    }
}