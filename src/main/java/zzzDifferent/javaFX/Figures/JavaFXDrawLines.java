package zzzDifferent.javaFX.Figures;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class JavaFXDrawLines extends Application {
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

    private void draw(Pane root) {
        Line line1 = new Line();
        line1.setStartX(100);
        line1.setStartY(100);
        line1.setEndX(100);
        line1.setEndY(500);
        line1.setStrokeWidth(5);

        Line line2 = new Line();
        line2.setStartX(100);
        line2.setStartY(100);
        line2.setEndX(500);
        line2.setEndY(500);
        line2.setStrokeWidth(5);


        root.getChildren().addAll(line1, line2); // додає елементи в root
    }
}
