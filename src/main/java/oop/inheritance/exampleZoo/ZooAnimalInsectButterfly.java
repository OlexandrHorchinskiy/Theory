package oop.inheritance.exampleZoo;

/*
НАСЛІДУВАННЯ
 "extends" означає, що клас "ZooAnimalInsectButterfly"
 автоматично наслідує всі поля (змінні) та методи класу "ZooAnimal" та класу "ZooAnimalInsect"
 Клас від якого наслідується називається "батьківський клас", "супер клас" або "базовий клас".
 Клас який наслідує називається "дочірній клас" або "суб клас".
*/
public class ZooAnimalInsectButterfly extends ZooAnimalInsect { // "дочірній клас" для класу "ZooAnimalInsect".

    // Перевантаження методу
    @Override
    public String helloFriend() {
        return "\"Привіт, друже!!! Я метелик.\"";
    }
}