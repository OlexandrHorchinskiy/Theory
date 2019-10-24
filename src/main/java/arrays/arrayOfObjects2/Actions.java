package arrays.arrayOfObjects2;

import com.alibaba.fastjson.JSON;

import java.util.Scanner;

public class Actions {
    private Scanner input = new Scanner(System.in);
    User[] usersArray;


    public Actions() {
        createUsersWithArray();
    }


    public void createUsersWithArray() {
        System.out.print("Введіть кількість користувачів для створення: ");
        int quantityUsers = input.nextInt();

        usersArray = new User[quantityUsers];
        for (int u = 0; u < quantityUsers; u++) {
            System.out.println("USER " + u + " = ");
            usersArray[u] = new User(fillUserId(), fillUserName());
            System.out.println(usersArray[u].toString());
        }

        for (int u = 0; u < quantityUsers; u++) {
            System.out.println("/ / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /");
            System.out.println("USER " + u + " = ");
            System.out.println(usersArray[u].toString());
        }

        String jsonUser = serializeObject(usersArray);
        System.out.println(jsonUser);
    }


    private Integer fillUserId() {
        System.out.print("Введіть ID користувача: ");
        Integer id = input.nextInt();
        return id;
    }

    private String fillUserName() {
        System.out.print("Введіть user name користувача: ");
        String userName = input.next();
        return userName;
    }


//    private void printUserArray(int u) {
//        user = null;
//        user = usersArray[u];
//        System.out.println("id - " + user.getId()
//                + "\nuser name - " + user.getUserName());
//    }


    private static String serializeObject(Object object) {
        String json = JSON.toJSONString(object);
        return json;
    }


    private static Object parseFromJson(String json) {
        Object object = JSON.parseObject(json, User.class);
        return object;
    }
}
