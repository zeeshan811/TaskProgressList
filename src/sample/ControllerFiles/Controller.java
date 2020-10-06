package sample.ControllerFiles;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private Button AWSButton;

    public void OnButtonClickAWS(ActionEvent event) {
    //    Main.startAWS(AWSCert);
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AWSCert.fxml"));
            //AWSController awsController = loader.getController();
            Stage stage = new Stage();
            stage.setTitle("AWS Cert");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void OnButtonClickJava(ActionEvent event) {
        //    Main.startAWS(AWSCert);
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Java.fxml"));
            //AWSController awsController = loader.getController();
            Stage stage = new Stage();
            stage.setTitle("Java");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void OnButtonClickJSHTMLCSS(ActionEvent event) {
        //    Main.startAWS(AWSCert);
        try {
            Parent root = FXMLLoader.load(getClass().getResource("JSHTMLCSS.fxml"));
            //AWSController awsController = loader.getController();
            Stage stage = new Stage();
            stage.setTitle("JSHTMLCSS");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void OnButtonClickPenTesting(ActionEvent event) {
        //    Main.startAWS(AWSCert);
        try {
            Parent root = FXMLLoader.load(getClass().getResource("PenTesting.fxml"));
            //AWSController awsController = loader.getController();
            Stage stage = new Stage();
            stage.setTitle("Pen Testing");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void OnButtonClickCodeReview(ActionEvent event) {
        //    Main.startAWS(AWSCert);
        try {
            Parent root = FXMLLoader.load(getClass().getResource("CodeReview.fxml"));
            //AWSController awsController = loader.getController();
            Stage stage = new Stage();
            stage.setTitle("Code Review");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
