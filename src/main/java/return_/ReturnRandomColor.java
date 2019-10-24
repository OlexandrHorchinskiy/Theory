package return_;

import java.util.Random;

public class ReturnRandomColor {
    public static void main(String[] args) {

        int red = makeRandomColorElement();
        int green = makeRandomColorElement();
        int blue = makeRandomColorElement();

        System.out.println("R=" + red + ", G=" + green + ", B=" + blue);
    }

    // Метод випадкових чисел для кольору (до 255)
    private static int makeRandomColorElement() {
        Random random = new Random();
        return random.nextInt(255);
    }
}