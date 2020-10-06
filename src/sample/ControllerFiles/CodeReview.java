package sample.ControllerFiles;

import javafx.event.ActionEvent;
import sample.Tasks;

public class CodeReview {
    Tasks zeestasks = new Tasks();

    public void querCodeReviewTable(ActionEvent actionEvent) {
        System.out.println("=============");
        System.out.println("Querying AWS Database");
        zeestasks.Querytable(Tasks.TABLE_TASK1);
    }
}
