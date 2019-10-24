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

public class JavaFXDrawStar4PointerAndUI extends Application {
// Глобальні змінні
    private int windowWidth = 600;
    private int windowHeight = 700;

    private int starRadiusExternal = 150;
    private int starRadiusInternal = 50;
    private int lineWidth = 2;

    private int starCenterX = 300;
    private int starCenterY = 400;
    private double halfSquareSide = Math.sqrt(Math.pow(starRadiusInternal, 2) + Math.pow(starRadiusInternal, 2)) / 2;


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

        primaryStage.setTitle("4 pointer star with user interface"); // задає назву вікна
    } // Задає параметри вікна (ширина та висота)

    private void draw(Pane root) {

        Rectangle rectangle = new Rectangle(0, 0, windowWidth,windowHeight); // створює прямокутник на розмір вікна
        rectangle.setFill(Color.YELLOW); // фарбує прямокутник


// USER INTERFACE
        // TEXT - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        Text text1 = new Text("Вкажіть радіус зовнішнього кола"); // створює текстове поле
        text1.setTranslateX(15); // встановлює початкові координати для text
        text1.setTranslateY(22); // встановлює початкові координати для text
        text1.setFont(Font.font(13)); // встановлює розмір шрифта для text

        Text text2 = new Text("Вкажіть радіус внутрішнього кола"); // створює текстове поле
        text2.setTranslateX(15); // встановлює початкові координати для text
        text2.setTranslateY(53); // встановлює початкові координати для text
        text2.setFont(Font.font(13)); // встановлює розмір шрифта для text

        Text text3 = new Text("Вкажіть товщину ліній"); // створює текстове поле
        text3.setTranslateX(15); // встановлює початкові координати для text
        text3.setTranslateY(83); // встановлює початкові координати для text
        text3.setFont(Font.font(13)); // встановлює розмір шрифта для text

        // TEXT FIELD - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        TextField textField1 = new TextField(); // створює поле для вводу текста
        textField1.setTranslateX(230); // встановлює початкові координати для text
        textField1.setTranslateY(5); // встановлює початкові координати для text

        TextField textField2 = new TextField(); // створює поле для вводу текста
        textField2.setTranslateX(230); // встановлює початкові координати для text
        textField2.setTranslateY(35); // встановлює початкові координати для text

        TextField textField3 = new TextField(); // створює поле для вводу текста
        textField3.setTranslateX(230); // встановлює початкові координати для text
        textField3.setTranslateY(65); // встановлює початкові координати для text

        // BUTTON - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        Button buttonDrawStar = new Button("Намалювати"); // створює кнопку
        buttonDrawStar.setTranslateX(400); // встановлює початкові координати
        buttonDrawStar.setTranslateY(35); // встановлює початкові координати
        // призначає що буде виконуватись після натискання кнопки миші
        buttonDrawStar.setOnMouseClicked(( event -> {    // лямбда (lambda)

            String number1 = textField1.getText();    // бере текст з textField
            starRadiusExternal = Integer.parseInt(number1); // Integer.parseInt(number) перетворює String в int

            String number2 = textField2.getText();    // бере текст з textField
            starRadiusInternal = Integer.parseInt(number2); // Integer.parseInt(number) перетворює String в int

            String number3 = textField3.getText();    // бере текст з textField
            lineWidth = Integer.parseInt(number3); // Integer.parseInt(number) перетворює String в int

            draw(root);
        } ));


// *******************************************************************************************************************
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
// *******************************************************************************************************************

// додає елементи в root
        root.getChildren().addAll(rectangle, text1, text2, text3, textField1, textField2, textField3, buttonDrawStar,
                Beam1Left, Beam1Right, Beam2Top, Beam2Bottom, Beam3Left, Beam3Right, Beam4Top, Beam4Bottom);
    } // Малює інтерфейс
}