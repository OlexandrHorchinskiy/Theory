package zzzDifferent.javaFX.star;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class JavaFXDrawStar4Pointer extends Application {
    public static void main(String[] args) {
        launch(args);
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

    private void windowSetup(Stage primaryStage) {
// primaryStage це об'єкт вікна
        primaryStage.setWidth(600); // задає ширину вікна
        primaryStage.setHeight(600); // задає висоту вікна

        primaryStage.setMaxWidth(600); // задає максимальну ширину вікна
        primaryStage.setMaxHeight(600); // задає максимальну висоту вікна

        primaryStage.setMinWidth(600); // задає мінімальну ширину вікна
        primaryStage.setMinHeight(600); // задає мінімальну висоту вікна
    } // Задає параметри вікна

    private void draw(Pane root) {
        int starCenterX = 300;
        int starCenterY = 300;
        int starRadiusExternal = 210;
        int starRadiusInternal = 70;
        int lineWidth = 2;

        double halfSquareSide = Math.sqrt(Math.pow(starRadiusInternal, 2) + Math.pow(starRadiusInternal, 2)) / 2;

// Координати вершин
        int top1X = starCenterX;
        int top1Y = starCenterY - starRadiusExternal;
        int top2X = starCenterX + starRadiusExternal;
        int top2Y = starCenterY;
        int top3X = starCenterX;
        int top3Y = starCenterY + starRadiusExternal;
        int top4X = starCenterX - starRadiusExternal;
        int top4Y = starCenterY;

// Координати основ
        double bottom1X = starCenterX + halfSquareSide;
        double bottom1Y = starCenterY - halfSquareSide;
        double bottom2X = starCenterX + halfSquareSide;
        double bottom2Y = starCenterY + halfSquareSide;
        double bottom3X = starCenterX - halfSquareSide;
        double bottom3Y = starCenterY + halfSquareSide;
        double bottom4X = starCenterX - halfSquareSide;
        double bottom4Y = starCenterY - halfSquareSide;

// Промінь 1 вверхній
        Line Beam1Right = new Line();
        Beam1Right.setStartX(top1X); //вершина
        Beam1Right.setStartY(top1Y); //вершина
        Beam1Right.setEndX(bottom1X); //основа
        Beam1Right.setEndY(bottom1Y); //основа
        Beam1Right.setStrokeWidth(lineWidth);

        Line Beam1Left = new Line();
        Beam1Left.setStartX(top1X); //вершина
        Beam1Left.setStartY(top1Y); //вершина
        Beam1Left.setEndX(bottom4X); //основа
        Beam1Left.setEndY(bottom4Y); //основа
        Beam1Left.setStrokeWidth(lineWidth);

// Промінь 2 правий
        Line Beam2Top = new Line();
        Beam2Top.setStartX(top2X); //вершина
        Beam2Top.setStartY(top2Y); //вершина
        Beam2Top.setEndX(bottom1X); //основа
        Beam2Top.setEndY(bottom1Y); //основа
        Beam2Top.setStrokeWidth(lineWidth);

        Line Beam2Bottom = new Line();
        Beam2Bottom.setStartX(top2X); //вершина
        Beam2Bottom.setStartY(top2Y); //вершина
        Beam2Bottom.setEndX(bottom2X); //основа
        Beam2Bottom.setEndY(bottom2Y); //основа
        Beam2Bottom.setStrokeWidth(lineWidth);

// Промінь 3 нижній
        Line Beam3Right = new Line();
        Beam3Right.setStartX(top3X); //вершина
        Beam3Right.setStartY(top3Y); //вершина
        Beam3Right.setEndX(bottom3X); //основа
        Beam3Right.setEndY(bottom3Y); //основа
        Beam3Right.setStrokeWidth(lineWidth);

        Line Beam3Left = new Line();
        Beam3Left.setStartX(top3X); //вершина
        Beam3Left.setStartY(top3Y); //вершина
        Beam3Left.setEndX(bottom2X); //основа
        Beam3Left.setEndY(bottom2Y); //основа
        Beam3Left.setStrokeWidth(lineWidth);

// Промінь 4 лівий
        Line Beam4Top = new Line();
        Beam4Top.setStartX(top4X); //вершина
        Beam4Top.setStartY(top4Y); //вершина
        Beam4Top.setEndX(bottom4X); //основа
        Beam4Top.setEndY(bottom4Y); //основа
        Beam4Top.setStrokeWidth(lineWidth);

        Line Beam4Bottom = new Line();
        Beam4Bottom.setStartX(top4X); //вершина
        Beam4Bottom.setStartY(top4Y); //вершина
        Beam4Bottom.setEndX(bottom3X); //основа
        Beam4Bottom.setEndY(bottom3Y); //основа
        Beam4Bottom.setStrokeWidth(lineWidth);

// додає елементи в root
        root.getChildren().addAll(Beam1Left, Beam1Right, Beam2Top, Beam2Bottom, Beam3Left, Beam3Right, Beam4Top, Beam4Bottom);
    } // Малює
}