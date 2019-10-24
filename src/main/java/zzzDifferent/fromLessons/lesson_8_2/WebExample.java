package zzzDifferent.fromLessons.lesson_8_2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class WebExample extends Application {
    public static void main(String[] args) throws IOException {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL url = new URL("http://www.technocrazed.com/wp-content/uploads/2015/12/beautiful-wallpaper-download-13.jpg");

        Pane root = new Pane();

        Image image = new Image(url.openStream());
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(300);
        imageView.setFitHeight(300);

        root.getChildren().add(imageView);

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}