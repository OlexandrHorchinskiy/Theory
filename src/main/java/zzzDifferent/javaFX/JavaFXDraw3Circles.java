package zzzDifferent.javaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class JavaFXDraw3Circles extends Application {
    private static final int WINDOW_WIDTH = 200;
    private static final int WINDOW_HEIGHT = 600;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        windowSetup(primaryStage);

        Pane root = new Pane();
        draw(root);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void windowSetup(Stage primaryStage) {
        primaryStage.setWidth(WINDOW_WIDTH);
        primaryStage.setHeight(WINDOW_HEIGHT);

        primaryStage.setMaxWidth(WINDOW_WIDTH);
        primaryStage.setMaxHeight(WINDOW_HEIGHT);

        primaryStage.setMinWidth(WINDOW_WIDTH);
        primaryStage.setMinHeight(WINDOW_HEIGHT);
    }

    private void draw(Pane root) {
        int strokeWidth = 0;

        Circle circle1 = new Circle(100, 500, 100);
        circle1.setFill(Color.ORANGE);
        circle1.setStroke(Color.BLUE);
        circle1.setStrokeWidth(strokeWidth);

        Circle circle2 = new Circle(100, 300, 100);
        circle2.setFill(Color.rgb(0, 200, 0));
        circle2.setStroke(Color.rgb(255, 0, 0));
        circle2.setStrokeWidth(strokeWidth);

        Circle circle3 = new Circle(100, 100, 100);
        circle3.setFill(Color.rgb(0, 0, 0));
        circle3.setStroke(Color.rgb(255, 255, 0));
        circle3.setStrokeWidth(strokeWidth);

        root.getChildren().addAll(circle1, circle2, circle3);
    }

}
