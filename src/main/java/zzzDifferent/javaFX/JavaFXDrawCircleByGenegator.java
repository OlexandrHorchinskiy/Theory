package zzzDifferent.javaFX;

        import javafx.application.Application;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.layout.Pane;
        import javafx.scene.paint.Paint;
        import javafx.scene.shape.Circle;
        import javafx.stage.Stage;
        import java.util.Random;

public class JavaFXDrawCircleByGenegator extends Application {
    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;
    private static final int RGB_SYMBOLS_COUNT = 6;
    private static final int COUNT_OF_CIRCLES = 100;
    private Random random = new Random();

    public static void main(String[] args) {
        launch(args);
    }

    private void windowSetup(Stage primaryStage) {
// primaryStage це об'єкт вікна
        primaryStage.setWidth(WIDTH); // задає ширину вікна
        primaryStage.setHeight(HEIGHT); // задає висоту вікна

        primaryStage.setMaxWidth(WIDTH); // задає максимальну ширину вікна
        primaryStage.setMaxHeight(HEIGHT); // задає максимальну висоту вікна

        primaryStage.setMinWidth(WIDTH); // задає мінімальну ширину вікна
        primaryStage.setMinHeight(HEIGHT); // задає мінімальну висоту вікна
    }

// Метод для генерування випадкового кольору
    private Paint generateRandomColor() {
        String rgb = "#";
        for (int i = 0; i < RGB_SYMBOLS_COUNT; i++) {
            rgb += (char)('0' + random.nextInt(9));
            }
            return Paint.valueOf(rgb);
    }

// Метод для генерування випадкових кіл
    private Circle generateCircle(int maxRadius, int maxStrokeWidth) {
        Circle circle = new Circle( random.nextDouble() * WIDTH,
                                    random.nextDouble() * HEIGHT,
                                    random.nextDouble() * maxRadius);

        circle.setStrokeWidth(random.nextDouble() * maxStrokeWidth);
        circle.setStroke(generateRandomColor());
        circle.setFill(Paint.valueOf("#00000000")); // встановлює колір заповнення (Fill) фірури (прозорий)

        return circle;
    }

    private void draw(Pane rootForCircles) {
        for(int i = 0; i < COUNT_OF_CIRCLES; i++) {
            Circle circle = generateCircle(100,10);
            rootForCircles.getChildren().addAll(circle); // додає елементи в root
        }
    }

    void drawUI(Pane root, Pane rootForCircles){
        Button button = new Button("Regenerate");
        button.setTranslateX(250);
        button.setTranslateY(10);
        button.setOnAction((event) -> {
            rootForCircles.getChildren().clear();
            draw(rootForCircles);
        });
        root.getChildren().addAll(button);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        windowSetup(primaryStage);
        Pane root = new Pane(); // створює root для сцени
        Pane rootForCircles = new Pane();
        root.getChildren().addAll(rootForCircles);

        drawUI(root, rootForCircles);
        draw(root);
        Scene scene = new Scene(root); // створює сцену в вікні (такий самой розмір як і в вікна)
        primaryStage.setScene(scene); // призначаємо вікну його сцену
        primaryStage.show(); // показує вікно


    }

}