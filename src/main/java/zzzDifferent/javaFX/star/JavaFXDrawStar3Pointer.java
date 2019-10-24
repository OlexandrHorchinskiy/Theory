package zzzDifferent.javaFX.star;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class JavaFXDrawStar3Pointer extends Application {
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

        primaryStage.setTitle("3 pointer star");
    } // Задає параметри вікна

    private void draw(Pane root) {
        int starCenterX = 300; // Координати центру
        int starCenterY = 300; // Координати центру
        int starRadiusExternal = 280; // Радіус зовнішнього кола
        int starRadiusInternal = 50; // Радіус внутрішнього кола
        int lineWidth = 2; // Товщина ліній

        int numberStarPointer = 3; // Кількість променів
        int angleBetweenBeams = 360 / numberStarPointer; // Кути між променями

// Кути в градусах та радіанах між центральною вісю та вершинами
        int angleDegreeTop2 = angleBetweenBeams;
        double angleRadianTop2 = angleDegreeTop2 / 57.296;
        int angleDegreeTop3 = angleDegreeTop2 + angleBetweenBeams;
        double angleRadianTop3 = angleDegreeTop3 / 57.296;

// Кути в градусах та радіанах між центральною вісю та основами
        int angleDegreeBottom1 = angleBetweenBeams / 2;
        double angleRadianBottom1 = angleDegreeBottom1 / 57.296;
        int angleDegreeBottom2 = angleDegreeBottom1 + angleBetweenBeams;
        double angleRadianBottom2 = angleDegreeBottom2 / 57.296;
        int angleDegreeBottom3 = angleDegreeBottom2 + angleBetweenBeams;
        double angleRadianBottom3 = angleDegreeBottom3 / 57.296;

// Обчислення координат
        int rx = starCenterX - starCenterX;                                 // Координата точки відліку - координата точки центру
        int ryTop = ( starCenterY - starRadiusExternal ) - starCenterY;     // Координата точки відліку - координата точки центру
        int ryBottom = ( starCenterY - starRadiusInternal ) - starCenterY;  // Координата точки відліку - координата точки центру

// Координати вершин
        int top1X = starCenterX;
        int top1Y = starCenterY - starRadiusExternal;

        double top2X = ( starCenterX + rx * Math.cos(angleRadianTop2) - ryTop * Math.sin(angleRadianTop2) );
        double top2Y = ( starCenterY + rx * Math.sin(angleRadianTop2) + ryTop * Math.cos(angleRadianTop2) );

        double top3X = ( starCenterX + rx * Math.cos(angleRadianTop3) - ryTop * Math.sin(angleRadianTop3) );
        double top3Y = ( starCenterY + rx * Math.sin(angleRadianTop3) + ryTop * Math.cos(angleRadianTop3) );

// Координати основ
        double bottom1X = ( starCenterX + rx * Math.cos(angleRadianBottom1) - ryBottom * Math.sin(angleRadianBottom1) );
        double bottom1Y = ( starCenterY + rx * Math.sin(angleRadianBottom1) + ryBottom * Math.cos(angleRadianBottom1) );

        double bottom2X = ( starCenterX + rx * Math.cos(angleRadianBottom2) - ryBottom * Math.sin(angleRadianBottom2) );
        double bottom2Y = ( starCenterY + rx * Math.sin(angleRadianBottom2) + ryBottom * Math.cos(angleRadianBottom2) );

        double bottom3X = ( starCenterX + rx * Math.cos(angleRadianBottom3) - ryBottom * Math.sin(angleRadianBottom3) );
        double bottom3Y = ( starCenterY + rx * Math.sin(angleRadianBottom3) + ryBottom * Math.cos(angleRadianBottom3) );

// Промінь 1 вверхній
        Line Beam1Left = new Line();
        Beam1Left.setStartX(top1X); //вершина
        Beam1Left.setStartY(top1Y); //вершина
        Beam1Left.setEndX(bottom3X); //основа
        Beam1Left.setEndY(bottom3Y); //основа
        Beam1Left.setStrokeWidth(lineWidth);

        Line Beam1Right = new Line();
        Beam1Right.setStartX(top1X); //вершина
        Beam1Right.setStartY(top1Y); //вершина
        Beam1Right.setEndX(bottom1X); //основа
        Beam1Right.setEndY(bottom1Y); //основа
        Beam1Right.setStrokeWidth(lineWidth);

// Промінь 2
        Line Beam2Left = new Line();
        Beam2Left.setStartX(top2X); //вершина
        Beam2Left.setStartY(top2Y); //вершина
        Beam2Left.setEndX(bottom1X); //основа
        Beam2Left.setEndY(bottom1Y); //основа
        Beam2Left.setStrokeWidth(lineWidth);

        Line Beam2Right = new Line();
        Beam2Right.setStartX(top2X); //вершина
        Beam2Right.setStartY(top2Y); //вершина
        Beam2Right.setEndX(bottom2X); //основа
        Beam2Right.setEndY(bottom2Y); //основа
        Beam2Right.setStrokeWidth(lineWidth);

// Промінь 3
        Line Beam3Left = new Line();
        Beam3Left.setStartX(top3X); //вершина
        Beam3Left.setStartY(top3Y); //вершина
        Beam3Left.setEndX(bottom2X); //основа
        Beam3Left.setEndY(bottom2Y); //основа
        Beam3Left.setStrokeWidth(lineWidth);

        Line Beam3Right = new Line();
        Beam3Right.setStartX(top3X); //вершина
        Beam3Right.setStartY(top3Y); //вершина
        Beam3Right.setEndX(bottom3X); //основа
        Beam3Right.setEndY(bottom3Y); //основа
        Beam3Right.setStrokeWidth(lineWidth);

// додає елементи в root
        root.getChildren().addAll(Beam1Left, Beam1Right, Beam2Left, Beam2Right, Beam3Left, Beam3Right);
    } // Малює
}