package zzzDifferent.javaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXUserInterfaceTest extends Application {
    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 600;

    public static void main(String[] args) {
        launch(args);
    }  // Завантажує графіку

    @Override
    public void start(Stage primaryStage) throws Exception {
        windowSetup(primaryStage);

        Pane root = new Pane(); // створює root для сцени
        uiSetup(root);

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
    }

    private void uiSetup(Pane root) {
// UI - User Interface / інтерфейс користувача
// у вікні (primaryStage) є сцена (scene) у сцени є root, який містить всі елементи view

// TEXT - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        Text text = new Text("Hello World"); // створює текстове поле та виводить "Hello World"
        text.setTranslateX(15); // встановлює початкові координати для text
        text.setTranslateY(35); // встановлює початкові координати для text
        text.setFont(Font.font(20)); // встановлює розмір шрифта для text

        text.setText(text.getText() + "\nnew line"); // додає текст до існуючого


// TEXT FIELD - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        TextField textField = new TextField(); // створює поле для вводу текста
        textField.setTranslateX(320); // встановлює початкові координати для text
        textField.setTranslateY(15); // встановлює початкові координати для text


// BUTTON - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        Button button = new Button("додати число або текст"); // створює кнопку button
        button.setTranslateX(150); // встановлює початкові координати для button
        button.setTranslateY(15); // встановлює початкові координати для button
        // призначає що буде виконуватись після натискання кнопки миші
        button.setOnMouseClicked(( event -> {       // лямбда (lambda)
            String number = textField.getText();    // бере текст з textField                   // код що виконується
            String oldText = text.getText();        // бере попередній текст                    // код що виконується
            text.setText(oldText + "\n" + number);  // до попереднього тексту додає новий       // код що виконується
        } ));


        Button button2 = new Button("стерти текст"); // створює кнопку button2
        button2.setTranslateX(150); // встановлює початкові координати для button2
        button2.setTranslateY(60); // встановлює початкові координати для button2
        // призначає що буде виконуватись після натискання кнопки миші
        button2.setOnMouseClicked(( event -> {    // лямбда (lambda)
            text.setText(""); // стирає весь текст                                              // код що виконується
        } ));


        // BUTTON - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        Button button3 = new Button("додати число помножене на 5"); // створює кнопку button3
        button3.setTranslateX(150); // встановлює початкові координати для button
        button3.setTranslateY(100); // встановлює початкові координати для button
        // призначає що буде виконуватись після натискання кнопки миші
        button3.setOnMouseClicked(( event -> {       // лямбда (lambda)
            String number = textField.getText();    // бере текст з textField                   // код що виконується
            String oldText = text.getText();        // бере попередній текст                    // код що виконується
            int number2 = Integer.parseInt(number) * 5; // Integer.parseInt(number) перетворює String в int
            text.setText(oldText + "\n" + number2);  // до попереднього тексту додає новий       // код що виконується
        } ));

        root.getChildren().addAll(text, textField, button, button2, button3); // додає елементи в root
    }
}