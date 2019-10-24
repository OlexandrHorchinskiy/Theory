package oop.encapsulation;

public class Person {
    private String name; // "private" робить поле класу невидимим поза межами цього класу.
    private String surname;
    private String profession;
    private int age;
    private int height;

    // Метод get - для зчитування даних зі змінної
    public String getName() { // тип метода має співпадати з типом змінної.
        return name;
    }

    // Метод set - для запису данних в змінну
    public void setName(String name) { // тип метода "void" так як цей метод нічого не повертає, метод отримує значення з "String name".
        this.name = name; // "this.name" означає "знайди в цьому класі поле "name", " = name" означає "запиши туди отримане значення".
    }

    public String getSurname() {
        return surname;
    }

    // setter з перевіркою отриманого значення
    public void setSurname(String surname) {
        if (surname.length() > 50) {                    // перевіряє отримане значення, якщо довжина рядка більше за 50 символів
            this.surname = surname.substring(0, 50);    // то в змінну записується перші 50 символів рядка
        } else {                                        // в іншому випадку
            this.surname = surname;                     // в змінну записується отримане значення
        }
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    // setter з перевіркою отриманого значення
    public void setAge(int age) {
        if (age >= 70) {    // перевіряє отримане значення, якщо значення більше за 70
            this.age = 70;  // то в змінну записується значення 70
        } else {            // в іншому випадку
            this.age = age; // в змінну записується отримане значення
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Метод для отримання і'мя та прізвища
    public String getFullName() {
        return name + " " + surname;
    }

    // Метод для отриимання повної інформації
    public String getFullInfo() {
        return "і'мя " + name + " | прізвище " + surname + " | професія " + profession + " | вік " + age + " | зріст " + height;
    }
}