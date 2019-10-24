package reflection;

public class Example {
    public int number;
    public String name = "name";
    private boolean answer;

    public void printFields(){
        System.out.println(number + " " + name);
    }

    private void printFieldsPrivate(){
        System.out.println(number + " " + name);
    }
}