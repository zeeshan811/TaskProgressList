package sample.ControllerFiles;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Tasks;

import java.io.IOException;

public class JavaController {
    Tasks zeestasks = new Tasks();

    public void querJavaTable(ActionEvent actionEvent) {
        System.out.println("=============");
        System.out.println("Querying Java Database");
        zeestasks.Querytable(Tasks.TABLE_TASK2);
    }

    public void JavaWeek1Enter(ActionEvent event) {
        //    Main.startJava(JavaCert);
        try {
            Parent root = FXMLLoader.load(getClass().getResource("JavaWeek1.fxml"));
            //JavaController JavaController = loader.getController();
            Stage stage = new Stage();
            stage.setTitle("JavaWeek1");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void JavaWeek2Enter(ActionEvent event) {
        //    Main.startJava(JavaCert);
        try {
            Parent root = FXMLLoader.load(getClass().getResource("JavaWeek2.fxml"));
            //JavaController JavaController = loader.getController();
            Stage stage = new Stage();
            stage.setTitle("JavaWeek2");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void JavaWeek3Enter(ActionEvent event) {
        //    Main.startJava(JavaCert);
        try {
            Parent root = FXMLLoader.load(getClass().getResource("JavaWeek3.fxml"));
            //JavaController JavaController = loader.getController();
            Stage stage = new Stage();
            stage.setTitle("JavaWeek3");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void JavaWeek4Enter(ActionEvent event) {
        //    Main.startJava(JavaCert);
        try {
            Parent root = FXMLLoader.load(getClass().getResource("JavaWeek4.fxml"));
            //JavaController JavaController = loader.getController();
            Stage stage = new Stage();
            stage.setTitle("JavaWeek4");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
