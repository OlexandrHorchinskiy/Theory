package zzzDifferent.javaFX.Figures;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class JavaFXDrawCircles extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private void windowSetup(Stage primaryStage) {
// primaryStage це об'єкт вікна
        primaryStage.setWidth(600); // задає ширину вікна
        primaryStage.setHeight(600); // задає висоту вікна

        primaryStage.setMaxWidth(600); // задає максимальну ширину вікна
        primaryStage.setMaxHeight(600); // задає максимальну висоту вікна

        primaryStage.setMinWidth(600); // задає мінімальну ширину вікна
        primaryStage.setMinHeight(600); // задає мінімальну висоту вікна

        primaryStage.setTitle("Circle"); // задає назву вікна
    }

    private void draw(Pane root) {
        Circle circle1 = new Circle(300, 300, 100); // створює коло
        circle1.setFill(Color.YELLOW); // встановлює колір заповнення (Fill) фірури
        circle1.setStroke(Color.BLUE); // встановлює колір краю (Stroke) фірури
        circle1.setStrokeWidth(25); // встановлює товщину краю фірури

        Circle circle2 = new Circle(300, 300, 50); // створює коло
        circle2.setFill(Color.rgb(0, 255, 0)); // встановлює колір (RGB) заповнення (Fill) фірури
        circle2.setStroke(Color.rgb(255, 0, 0)); // встановлює колір (RGB) краю (Stroke) фірури
        circle2.setStrokeWidth(25); // встановлює товщину краю фірури


        root.getChildren().addAll(circle1, circle2); // додає елементи в root
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        windowSetup(primaryStage);
        Pane root = new Pane(); // створює root для сцени
        draw(root);
        Scene scene = new Scene(root); // створює сцену в вікні (такий самой розмір як і в вікна)
        primaryStage.setScene(scene); // призначаємо вікну його сцену
        primaryStage.show(); // показує вікно
    }
}
