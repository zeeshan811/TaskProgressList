package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainfxml.fxml"));
//        FXMLLoader loader = new FXMLLoader(Main.class.getResource("mainfxml.fxml"));
//        Parent root = loader.load();
//        URL url = getClass().getClassLoader().getResource("mainfxml.fxml");
//        FXMLLoader loader = new FXMLLoader(url);
//        FXMLLoader fxmlLoader=new FXMLLoader (Main.class.getResource ("/Users/zsyed/IdeaProjects/UIForProgressList/src/sample/mainfxml.fxml"));
//        Parent root =fxmlLoader.load ();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

//    public static void startAWS(Stage awsStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("AWSCert.fxml"));
//        awsStage.setTitle("Hello World");
//        awsStage.setScene(new Scene(root, 300, 275));
//        awsStage.show();
//    }


    public static void main(String[] args) {
        Tasks zeesTask = new Tasks();
        zeesTask.createNewTables();
        launch(args);
    }
}
