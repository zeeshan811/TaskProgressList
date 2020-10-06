package sample.ControllerFiles;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Tasks;

import java.io.IOException;

public class JSHTMLCSSController {
    Tasks zeestasks = new Tasks();

    public void querJSHTMLCSSTable(ActionEvent actionEvent) {
        System.out.println("=============");
        System.out.println("Querying JSHTMLCSS Database");
        zeestasks.Querytable(Tasks.TABLE_TASK3);
    }

    public void JSHTMLCSSWeek1Enter(ActionEvent event) {
        //    Main.startJSHTMLCSS(JSHTMLCSSCert);
        try {
            Parent root = FXMLLoader.load(getClass().getResource("JSHTMLCSSWeek1.fxml"));
            //JSHTMLCSSController JSHTMLCSSController = loader.getController();
            Stage stage = new Stage();
            stage.setTitle("JSHTMLCSSWeek1");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void JSHTMLCSSWeek2Enter(ActionEvent event) {
        //    Main.startJSHTMLCSS(JSHTMLCSSCert);
        try {
            Parent root = FXMLLoader.load(getClass().getResource("JSHTMLCSSWeek2.fxml"));
            //JSHTMLCSSController JSHTMLCSSController = loader.getController();
            Stage stage = new Stage();
            stage.setTitle("JSHTMLCSSWeek2");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void JSHTMLCSSWeek3Enter(ActionEvent event) {
        //    Main.startJSHTMLCSS(JSHTMLCSSCert);
        try {
            Parent root = FXMLLoader.load(getClass().getResource("JSHTMLCSSWeek3.fxml"));
            //JSHTMLCSSController JSHTMLCSSController = loader.getController();
            Stage stage = new Stage();
            stage.setTitle("JSHTMLCSSWeek3");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void JSHTMLCSSWeek4Enter(ActionEvent event) {
        //    Main.startJSHTMLCSS(JSHTMLCSSCert);
        try {
            Parent root = FXMLLoader.load(getClass().getResource("JSHTMLCSSWeek4.fxml"));
            //JSHTMLCSSController JSHTMLCSSController = loader.getController();
            Stage stage = new Stage();
            stage.setTitle("JSHTMLCSSWeek4");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
