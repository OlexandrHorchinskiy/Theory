//package zzzDifferent.javaFX.player;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.SceneBuilder;
//import javafx.scene.media.MediaPlayer;
//import javafx.scene.media.MediaView;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//import Group;
//
//import javax.print.attribute.standard.Media;
//
//import static javafx.application.Application.launch;
//
//public class thread.Main extends Application {
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        primaryStage.setTitle("Media");
//        Group root = new Group();
//        Media media = new Media("http://www.youtube.com/watch?v=k0BWlvnBmIE");
//        MediaPlayer mediaPlayer = new MediaPlayer(media);
//        mediaPlayer.play();
//
//        MediaView mediaView = new MediaView(mediaPlayer);
//
//        root.getChildren().add(mediaView);
//        Scene scene = SceneBuilder.create().width(500).height(500).root(root)
//                .fill(Color.WHITE).build();
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//}