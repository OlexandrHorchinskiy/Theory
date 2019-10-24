package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        // Створюємо клас який описує клас.
        // Викликаємо метод "forName" з параметром стрічною, в якій вказується повне і'мя класу (інформіцію про який необхідно дізнатися).
        Class c = Class.forName("reflection.Example");
//        Class c = Class.forName("java.io.InputStream");


        // І'мя класу
        String className = c.getName();
        System.out.println("class name: " + className);


        // Всі конструктори класу
        Constructor[] constructors = c.getConstructors();
        System.out.print("class constructors: ");
        for (int i = 0; i < constructors.length; i++) {
            System.out.println(" - " + constructors[i] + "; ");
        }


        // Всі інтерфейси класу
        Class[] interfaces = c.getInterfaces();
        System.out.println("class interfaces: ");
        for (int i = 0; i < interfaces.length; i++) {
            System.out.println(" - " + interfaces[i] + "; ");
        }


        // Модифікатор класу
        int modifier = c.getModifiers();
        if (Modifier.isPrivate(modifier)) {
            System.out.println("class modifier is private");
        } else if (Modifier.isPublic(modifier)) {
            System.out.println("class modifier is public");
        } else if (Modifier.isFinal(modifier)) {
            System.out.println("class modifier is final");
        } else if (Modifier.isStatic(modifier)) {
            System.out.println("class modifier is static");
        }


        // Всі методи класу з модифікатором "public". Методи з іншим модифікатором отримуються інакше.
        Method[] methods = c.getMethods();
        System.out.println("class methods: ");
        for (int i = 0; i < methods.length; i++) {
            System.out.println(" - " + methods[i]);
        }


        // Всі поля класу з модифікатором "public". Поля з іншим модифікатором отримуються інакше.
        Field[] fields = c.getFields();
        System.out.println("class fields: ");
        for (int i = 0; i < fields.length; i++) {
            System.out.println(" - " + fields[i]);
        }
        System.out.println("class field type: " + fields[0].getType());
        System.out.println("class field name: " + fields[0].getName());
    }
}