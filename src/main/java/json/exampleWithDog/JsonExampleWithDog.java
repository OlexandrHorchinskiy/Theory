package json.exampleWithDog;

import com.alibaba.fastjson.JSON;
import json.exampleWithDog.entity.Dog;

public class JsonExampleWithDog {

    public static void main(String[] args) {
        Dog dog;
        dog = new Dog("Dingo", 3);
        String json = serializeObject(dog);

        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        parseFromJson(json);
    }


    // Сериалізація - з об'єкта в JSON
    private static String serializeObject(Dog dog) {
        String json = JSON.toJSONString(dog);
        System.out.println("Сериалізація - об'єкт перетворений в JSON стрічку:\n" + json);
        return json;
    }


    // Десериалізація - з JSON в об'єкт
    private static Dog parseFromJson(String json) {
        Dog dog = JSON.parseObject(json, Dog.class);
        System.out.println("Десериалізація - JSON стрічка перетворена в об'єкт:\n" + dog);
        return dog;
    }
}