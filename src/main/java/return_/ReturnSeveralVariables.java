package return_;

public class ReturnSeveralVariables {
    public static void main(String[] args) {
        ReturnSeveralVariables result = something();
        System.out.println(result.getFirst() + result.getSecond());
    }

    private final int first;
    private final int second;

    public ReturnSeveralVariables(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

// ...

    public static ReturnSeveralVariables something() {
        int number1 = 1;
        int number2 = 2;

        return new ReturnSeveralVariables(number1, number2);
    }
}