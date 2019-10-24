package serialization;

import java.io.Serializable;

public class CustomObject implements Serializable {
    transient boolean b;
}