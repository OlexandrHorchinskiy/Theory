package zzzDifferent.javaFX.Figures;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFXDrawRectangle extends Application {
    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 600;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(final Stage primaryStage) throws Exception {
        Canvas canvas = new Canvas(WINDOW_WIDTH, WINDOW_HEIGHT);
        StackPane root = new StackPane();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);

        final GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        initDraw(graphicsContext);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void initDraw(GraphicsContext gc) {
        int rectLineWidth = 15;

        gc.setStroke(Color.RED);
        gc.setLineWidth(rectLineWidth);
        gc.strokeRect(400, 100, 80, 80);

        gc.setStroke(Color.BLUE);
        gc.setLineWidth(rectLineWidth);
        gc.strokeRect(50, 50, 200, 300);

    }
}