package zzzDifferent.javaFX.Figures;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFXDrawOval extends Application {
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
        int ovalLineWidth = 20;
        int ovalWidth = 200 - ovalLineWidth;
        int ovalHeight = 200 - ovalLineWidth;
        int drawAtCenterX = WINDOW_WIDTH / 2 - ovalWidth / 2;

        gc.setStroke(Color.RED);
        gc.setLineWidth(ovalLineWidth);
        gc.strokeOval(drawAtCenterX, WINDOW_HEIGHT - ovalHeight - ovalLineWidth / 2, ovalWidth, ovalHeight);

        gc.setStroke(Color.GREEN);
        gc.setLineWidth(ovalLineWidth);
        gc.strokeOval(drawAtCenterX, WINDOW_HEIGHT - ovalHeight * 2 - ovalLineWidth * 1.5, ovalWidth, ovalHeight);

        gc.setStroke(Color.BLUE);
        gc.setLineWidth(ovalLineWidth);
        gc.strokeOval(drawAtCenterX, WINDOW_HEIGHT - ovalHeight * 3 - ovalLineWidth * 2.5, ovalWidth, ovalHeight);

    }
}