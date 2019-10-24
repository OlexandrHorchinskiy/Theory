package enum_;

public enum DogTypeInt {
    // Перелік з числами
    Dalmatian(10),
    Kokker(1000),
    Bobok(20),
    Sharik(3);

    private int value;

    DogTypeInt(int newValue){
        value = newValue;
    }
}