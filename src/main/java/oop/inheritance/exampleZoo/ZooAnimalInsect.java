package oop.inheritance.exampleZoo;

/*
НАСЛІДУВАННЯ
 "extends" означає, що клас "ZooAnimalInsect"
 автоматично наслідує всі поля (змінні) та методи класу "ZooAnimal"
 Клас від якого наслідується називається "батьківський клас", "супер клас" або "базовий клас".
 Клас який наслідує називається "дочірній клас" або "суб клас".
*/
public class ZooAnimalInsect extends ZooAnimal { // "дочірній клас" для класу "ZooAnimal" та "батьківський клас" для класу "ZooAnimalInsectButterfly".
    // Перевантаження методу
    @Override
    public String helloFriend() {
        return "\"Привіт, друже!!! Я комаха.\"";
    }
}