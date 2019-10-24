package oop.composition;

public class Client {
    private String name;
    private Data birthData; // використання класу як змінної (поля)
    private Data regData;   // використання класу як змінної (поля)

    public Client(String name, Data birthData, Data regData) {
        this.name = name;
        this.birthData = birthData;
        this.regData = regData;
    }

    @Override
    public String toString() {
        return "Ім'я клієнта: " + name +
                "\nДата народження клієнта: " + birthData +
                "\nДата реєстрації клієнта: " + regData;
    }
}