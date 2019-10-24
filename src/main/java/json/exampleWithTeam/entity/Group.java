package json.exampleWithTeam.entity;

import java.util.ArrayList;

public class Group {
    public String name;
    public String description;
    public ArrayList<User> users;

    // Конструктор
    public Group(String name, String description, ArrayList<User> users) {
        this.name = name;
        this.description = description;
        this.users = users;
    }

    // Перевантаження метода "toString()"
    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", users=" + users +
                '}';
    }
}