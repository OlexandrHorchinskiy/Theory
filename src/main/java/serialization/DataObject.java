package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class DataObject implements Serializable {
    int i = 5;
    String s = "aaa";
    transient String[] a = {"bbb", "ccc", "ddd"}; // поля (властивості) класа, відмічені модифікатором "transient", не серіалізуются.
//    String[] a = {"bbb", "ccc", "ddd"};
    CustomObject customObject;


    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject(); // Викликати завжди (окрім особливих випадків)! Стандартна серіалізація.
        out.writeObject(getMyData());
    }


    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject(); // Викликати завжди (окрім особливих випадків)! Стандартна десеріалізація.
    }


    private Object getMyData() {
        return null;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String[] getA() {
        return a;
    }

    public void setA(String[] a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "DataObject{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", a=" + Arrays.toString(a) +
                '}';
    }
}