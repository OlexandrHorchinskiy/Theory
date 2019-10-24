package generic;

public class Vehicle<T> {
    public String name;
    public T object;

    public T getObject() {
        return object;
    }
}