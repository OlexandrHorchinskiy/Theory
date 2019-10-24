package oop.composition;

public class Main {
    public static void main(String[] args) {
        Data birthData = new Data(1, 1, 2002);
        Data regData = new Data(12, 12, 2018);
        Client client = new Client("Олександр", birthData, regData);

        System.out.println(client);
    }
}