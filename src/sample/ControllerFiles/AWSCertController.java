package sample.ControllerFiles;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Tasks;

import java.io.IOException;

public class AWSCertController {
//    @FXML
//    private Label label;
//
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//
//    }
//    public void myfunction(String value){
//
//    }
    Tasks zeestasks = new Tasks();

    public void querAWSTable(ActionEvent actionEvent) {
        System.out.println("=============");
        System.out.println("Querying AWS Database");
        zeestasks.Querytable(Tasks.TABLE_TASK1);
    }

    public void awsWeek1Enter(ActionEvent event) {
        //    Main.startAWS(AWSCert);
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AWSWeek1.fxml"));
            //AWSController awsController = loader.getController();
            Stage stage = new Stage();
            stage.setTitle("AWSWeek1");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void awsWeek2Enter(ActionEvent event) {
        //    Main.startAWS(AWSCert);
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AWSWeek2.fxml"));
            //AWSController awsController = loader.getController();
            Stage stage = new Stage();
            stage.setTitle("AWSWeek2");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void awsWeek3Enter(ActionEvent event) {
        //    Main.startAWS(AWSCert);
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AWSWeek3.fxml"));
            //AWSController awsController = loader.getController();
            Stage stage = new Stage();
            stage.setTitle("AWSWeek3");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void awsWeek4Enter(ActionEvent event) {
        //    Main.startAWS(AWSCert);
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AWSWeek4.fxml"));
            //AWSController awsController = loader.getController();
            Stage stage = new Stage();
            stage.setTitle("AWSWeek4");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
