package zzzDifferent.javaFX.star;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXDrawStar5PointerAndUI extends Application {
// Глобальні змінні
    private int windowWidth = 600;
    private int windowHeight = 700;

    private int starRadiusExternal = 290; // Радіус зовнішнього кола
    private int starRadiusInternal = 110; // Радіус внутрішнього кола
    private int lineWidth = 2; // Товщина ліній


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        windowSetup(primaryStage); // Задає параметри вікна (ширина та висота)

        Pane root = new Pane(); // Pane створює root для сцени
        draw(root);

        Scene scene = new Scene(root); // створює сцену в вікні (такий самой розмір як і в вікна)
        primaryStage.setScene(scene); // призначаємо вікну його сцену
        primaryStage.show(); // показує вікно
    } // Створює вікно


    private void windowSetup(Stage primaryStage) {
// primaryStage це об'єкт вікна
        primaryStage.setWidth(windowWidth); // задає ширину вікна
        primaryStage.setHeight(windowHeight); // задає висоту вікна

        primaryStage.setMaxWidth(windowWidth); // задає максимальну ширину вікна
        primaryStage.setMaxHeight(windowHeight); // задає максимальну висоту вікна

        primaryStage.setMinWidth(windowWidth); // задає мінімальну ширину вікна
        primaryStage.setMinHeight(windowHeight); // задає мінімальну висоту вікна

        primaryStage.setTitle("5 pointer star with user interface"); // задає назву вікна
    } // Задає параметри вікна


    private void draw(Pane root) {

        Rectangle rectangle = new Rectangle(0, 0, windowWidth,windowHeight); // створює прямокутник на розмір вікна
        rectangle.setFill(Color.YELLOW); // фарбує прямокутник


// USER INTERFACE
        // TEXTS - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        Text text1 = new Text("Вкажіть радіус зовнішнього кола"); // створює текстове поле
        text1.setTranslateX(15); // встановлює початкові координати для text
        text1.setTranslateY(585); // встановлює початкові координати для text
        text1.setFont(Font.font(13)); // встановлює розмір шрифта для text

        Text text2 = new Text("Вкажіть радіус внутрішнього кола"); // створює текстове поле
        text2.setTranslateX(15); // встановлює початкові координати для text
        text2.setTranslateY(615); // встановлює початкові координати для text
        text2.setFont(Font.font(13)); // встановлює розмір шрифта для text

        Text text3 = new Text("Вкажіть товщину ліній"); // створює текстове поле
        text3.setTranslateX(15); // встановлює початкові координати для text
        text3.setTranslateY(645); // встановлює початкові координати для text
        text3.setFont(Font.font(13)); // встановлює розмір шрифта для text

        // TEXT FIELDS - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        TextField textField1 = new TextField(String.valueOf(starRadiusExternal)); // створює поле для вводу текста
        textField1.setTranslateX(240); // встановлює початкові координати для text
        textField1.setTranslateY(570); // встановлює початкові координати для text

        TextField textField2 = new TextField(String.valueOf(starRadiusInternal)); // створює поле для вводу текста
        textField2.setTranslateX(240); // встановлює початкові координати для text
        textField2.setTranslateY(600); // встановлює початкові координати для text

        TextField textField3 = new TextField(String.valueOf(lineWidth)); // створює поле для вводу текста
        textField3.setTranslateX(240); // встановлює початкові координати для text
        textField3.setTranslateY(630); // встановлює початкові координати для text

        // BUTTONS - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        Button buttonDrawStar = new Button("Намалювати зірку за вказаними параметрами"); // створює кнопку
        buttonDrawStar.setTranslateX(410); // встановлює початкові координати
        buttonDrawStar.setTranslateY(570); // встановлює початкові координати
        buttonDrawStar.setMinSize(150, 85);
        buttonDrawStar.setMaxSize(150, 85);
        buttonDrawStar.setWrapText(true);
        // призначає що буде виконуватись після натискання кнопки миші
        buttonDrawStar.setOnMouseClicked(( event -> { // лямбда (lambda)

            String number1 = textField1.getText(); // бере текст з textField
            starRadiusExternal = Integer.parseInt(number1); // Integer.parseInt(number) перетворює String в int

            String number2 = textField2.getText(); // бере текст з textField
            starRadiusInternal = Integer.parseInt(number2); // Integer.parseInt(number) перетворює String в int

            String number3 = textField3.getText(); // бере текст з textField
            lineWidth = Integer.parseInt(number3); // Integer.parseInt(number) перетворює String в int

            draw(root);
        } ));



        int starCenterX = 290; // Координати центру
        int starCenterY = 300; // Координати центру
        int numberStarPointer = 5; // Кількість променів
        int angleBetweenBeams = 360 / numberStarPointer; // Кути між променями


// Кути в градусах та радіанах між центральною вісю та вершинами
        int angleDegreeTop2 = angleBetweenBeams;
        double angleRadianTop2 = angleDegreeTop2 / 57.296;
        int angleDegreeTop3 = angleDegreeTop2 + angleBetweenBeams;
        double angleRadianTop3 = angleDegreeTop3 / 57.296;
        int angleDegreeTop4 = angleDegreeTop3 + angleBetweenBeams;
        double angleRadianTop4 = angleDegreeTop4 / 57.296;
        int angleDegreeTop5 = angleDegreeTop4 + angleBetweenBeams;
        double angleRadianTop5 = angleDegreeTop5 / 57.296;


// Кути в градусах та радіанах між центральною вісю та основами
        int angleDegreeBottom1 = angleBetweenBeams / 2;
        double angleRadianBottom1 = angleDegreeBottom1 / 57.296;
        int angleDegreeBottom2 = angleDegreeBottom1 + angleBetweenBeams;
        double angleRadianBottom2 = angleDegreeBottom2 / 57.296;
        int angleDegreeBottom3 = angleDegreeBottom2 + angleBetweenBeams;
        double angleRadianBottom3 = angleDegreeBottom3 / 57.296;
        int angleDegreeBottom4 = angleDegreeBottom3 + angleBetweenBeams;
        double angleRadianBottom4 = angleDegreeBottom4 / 57.296;
        int angleDegreeBottom5 = angleDegreeBottom4 + angleBetweenBeams;
        double angleRadianBottom5 = angleDegreeBottom5 / 57.296;


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

        double top4X = ( starCenterX + rx * Math.cos(angleRadianTop4) - ryTop * Math.sin(angleRadianTop4) );
        double top4Y = ( starCenterY + rx * Math.sin(angleRadianTop4) + ryTop * Math.cos(angleRadianTop4) );

        double top5X = ( starCenterX + rx * Math.cos(angleRadianTop5) - ryTop * Math.sin(angleRadianTop5) );
        double top5Y = ( starCenterY + rx * Math.sin(angleRadianTop5) + ryTop * Math.cos(angleRadianTop5) );


// Координати основ
        double bottom1X = ( starCenterX + rx * Math.cos(angleRadianBottom1) - ryBottom * Math.sin(angleRadianBottom1) );
        double bottom1Y = ( starCenterY + rx * Math.sin(angleRadianBottom1) + ryBottom * Math.cos(angleRadianBottom1) );

        double bottom2X = ( starCenterX + rx * Math.cos(angleRadianBottom2) - ryBottom * Math.sin(angleRadianBottom2) );
        double bottom2Y = ( starCenterY + rx * Math.sin(angleRadianBottom2) + ryBottom * Math.cos(angleRadianBottom2) );

        double bottom3X = ( starCenterX + rx * Math.cos(angleRadianBottom3) - ryBottom * Math.sin(angleRadianBottom3) );
        double bottom3Y = ( starCenterY + rx * Math.sin(angleRadianBottom3) + ryBottom * Math.cos(angleRadianBottom3) );

        double bottom4X = ( starCenterX + rx * Math.cos(angleRadianBottom4) - ryBottom * Math.sin(angleRadianBottom4) );
        double bottom4Y = ( starCenterY + rx * Math.sin(angleRadianBottom4) + ryBottom * Math.cos(angleRadianBottom4) );

        double bottom5X = ( starCenterX + rx * Math.cos(angleRadianBottom5) - ryBottom * Math.sin(angleRadianBottom5) );
        double bottom5Y = ( starCenterY + rx * Math.sin(angleRadianBottom5) + ryBottom * Math.cos(angleRadianBottom5) );


// Промінь 1 вверхній
        Line Beam1Left = new Line();
        Beam1Left.setStartX(top1X); //вершина
        Beam1Left.setStartY(top1Y); //вершина
        Beam1Left.setEndX(bottom5X); //основа
        Beam1Left.setEndY(bottom5Y); //основа
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

// Промінь 4
        Line Beam4Left = new Line();
        Beam4Left.setStartX(top4X); //вершина
        Beam4Left.setStartY(top4Y); //вершина
        Beam4Left.setEndX(bottom3X); //основа
        Beam4Left.setEndY(bottom3Y); //основа
        Beam4Left.setStrokeWidth(lineWidth);

        Line Beam4Right = new Line();
        Beam4Right.setStartX(top4X); //вершина
        Beam4Right.setStartY(top4Y); //вершина
        Beam4Right.setEndX(bottom4X); //основа
        Beam4Right.setEndY(bottom4Y); //основа
        Beam4Right.setStrokeWidth(lineWidth);

// Промінь 5
        Line Beam5Left = new Line();
        Beam5Left.setStartX(top5X); //вершина
        Beam5Left.setStartY(top5Y); //вершина
        Beam5Left.setEndX(bottom4X); //основа
        Beam5Left.setEndY(bottom4Y); //основа
        Beam5Left.setStrokeWidth(lineWidth);

        Line Beam5Right = new Line();
        Beam5Right.setStartX(top5X); //вершина
        Beam5Right.setStartY(top5Y); //вершина
        Beam5Right.setEndX(bottom5X); //основа
        Beam5Right.setEndY(bottom5Y); //основа
        Beam5Right.setStrokeWidth(lineWidth);


// додає елементи в root
        root.getChildren().addAll(rectangle, text1, text2, text3, textField1, textField2, textField3, buttonDrawStar,
                Beam1Left, Beam1Right, Beam2Left, Beam2Right, Beam3Left, Beam3Right, Beam4Left, Beam4Right, Beam5Left, Beam5Right);
    } // Малює
}