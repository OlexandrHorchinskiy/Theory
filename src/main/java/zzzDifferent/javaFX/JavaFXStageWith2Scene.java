package zzzDifferent.javaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class JavaFXStageWith2Scene extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private void windowSetup(Stage primaryStage) {
// primaryStage це об'єкт вікна
        primaryStage.setWidth(700); // задає ширину вікна
        primaryStage.setHeight(700); // задає висоту вікна

        primaryStage.setMaxWidth(700); // задає максимальну ширину вікна
        primaryStage.setMaxHeight(700); // задає максимальну висоту вікна

        primaryStage.setMinWidth(700); // задає мінімальну ширину вікна
        primaryStage.setMinHeight(700); // задає мінімальну висоту вікна
    }

    private void draw(Pane root) {
// BUTTON - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        WebView webview = new WebView();
        Button button = new Button("Play"); // створює кнопку button
        button.setTranslateX(150); // встановлює початкові координати для button
        button.setTranslateY(620); // встановлює початкові координати для button
        // призначає що буде виконуватись після натискання кнопки миші
        button.setOnMouseClicked(( event -> {       // лямбда (lambda)

            webview.getEngine().load("http://www.youtube.com/embed/flDjU_u35U0?autoplay=1");
            webview.setPrefSize(400, 400);
            webview.setTranslateX(100);
            webview.setTranslateY(100);

            draw(root);
        } ));

        root.getChildren().addAll(button, webview); // додає елементи в root
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


}
