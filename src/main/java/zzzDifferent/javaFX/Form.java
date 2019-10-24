package zzzDifferent.javaFX;

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

public class Form extends Application {
    // Глобальні змінні
    private int windowWidth = 600;
    private int windowHeight = 600;

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

        Rectangle rectangle = new Rectangle(0, 0, windowWidth, windowHeight); // створює прямокутник на розмір вікна
        rectangle.setFill(Color.rgb(255, 255, 255)); // фарбує прямокутник


    // USER INTERFACE
        // TEXTS - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        Text text = new Text("__________________"); // створює текстове поле
        text.setTranslateX(15); // встановлює початкові координати для text
        text.setTranslateY(585); // встановлює початкові координати для text
        text.setFont(Font.font(13)); // встановлює розмір шрифта для text


        // TEXT FIELDS - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        TextField textField = new TextField("__________________"); // створює поле для вводу текста
        textField.setTranslateX(240); // встановлює початкові координати для text
        textField.setTranslateY(570); // встановлює початкові координати для text


        // BUTTONS - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        Button button = new Button("__________________"); // створює кнопку
        button.setTranslateX(410); // встановлює початкові координати
        button.setTranslateY(570); // встановлює початкові координати
        button.setMinSize(160, 55);
        button.setMaxSize(160, 55);
        button.setWrapText(true);
        // призначає що буде виконуватись після натискання кнопки миші
        button.setOnMouseClicked(( event -> {


            draw(root);
        } ));


        // LINES - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        Line line = new Line();
        line.setStartX(0); //вершина
        line.setStartY(300); //вершина
        line.setEndX(600); //основа
        line.setEndY(300); //основа


// додає елементи в root
        root.getChildren().addAll(rectangle, text, textField, button, line);
    } // Малює
}