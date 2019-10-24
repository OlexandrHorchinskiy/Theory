package json.exampleWithTeam;

import com.alibaba.fastjson.JSON;
import json.exampleWithTeam.entity.Group;
import json.exampleWithTeam.entity.User;

import java.util.ArrayList;

public class JsonExampleWithTeam {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList();                            // Створення об'єкта ArrayList
        users.add(new User("Tom", User.Gender.male, 40));       // Створення та добавлення в ArrayList об'єкта
        users.add(new User("Megan", User.Gender.female, 30));   // Створення та добавлення в ArrayList об'єкта
        users.add(new User("Mike", User.Gender.male, 20));      // Створення та добавлення в ArrayList об'єкта

        Group group = new Group("Basket team", "Ola la", users);  // Створення об'єкта

        String json = JSON.toJSONString(group); // Сериалізація - з об'єкта в JSON
        System.out.println("Сериалізація - об'єкт перетворений в JSON стрічку:\n" + json);

        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        Group groupCopy = JSON.parseObject(json, Group.class); // Десериалізація - з JSON в об'єкт
        System.out.println("Десериалізація - JSON стрічка перетворена в об'єкт:\n" + groupCopy);
    }
}