package sample.ControllerFiles;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import sample.Tasks;

public class JSHTMLCSSWeek {
    @FXML
    private TextArea sundayHours;
    @FXML
    private TextArea mondayHours;
    @FXML
    private TextArea tuesdayHours;
    @FXML
    private TextArea wednesdayHours;
    @FXML
    private TextArea thursdayHours;
    @FXML
    private TextArea fridayHours;
    @FXML
    private TextArea saturdayHours;
    @FXML
    private TextArea sundayHours1;
    @FXML
    private TextArea mondayHours1;
    @FXML
    private TextArea tuesdayHours1;
    @FXML
    private TextArea wednesdayHours1;
    @FXML
    private TextArea thursdayHours1;
    @FXML
    private TextArea fridayHours1;
    @FXML
    private TextArea saturdayHours1;
    @FXML
    private TextArea sundayHours3;
    @FXML
    private TextArea mondayHours3;
    @FXML
    private TextArea tuesdayHours3;
    @FXML
    private TextArea wednesdayHours3;
    @FXML
    private TextArea thursdayHours3;
    @FXML
    private TextArea fridayHours3;
    @FXML
    private TextArea saturdayHours3;
    @FXML
    private TextArea sundayHours4;
    @FXML
    private TextArea mondayHours4;
    @FXML
    private TextArea tuesdayHours4;
    @FXML
    private TextArea wednesdayHours4;
    @FXML
    private TextArea thursdayHours4;
    @FXML
    private TextArea fridayHours4;
    @FXML
    private TextArea saturdayHours4;


    Tasks zeestasks = new Tasks();

    public void sundayButton(ActionEvent event){
        int hours = Integer.parseInt(sundayHours.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_SUNDAY,hours,1);
    }
    public void mondayButton(ActionEvent event){
        int hours = Integer.parseInt(mondayHours.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_MONDAY,hours,1);
    }
    public void tuesdayButton(ActionEvent event){
        int hours = Integer.parseInt(tuesdayHours.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_TUESDAY,hours,1);
    }
    public void wednesdayButton(ActionEvent event){
        int hours = Integer.parseInt(wednesdayHours.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_WEDNESDAY,hours,1);
    }
    public void thursdayButton(ActionEvent event){
        int hours = Integer.parseInt(thursdayHours.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_THURSDAY,hours,1);
    }
    public void fridayButton(ActionEvent event){
        int hours = Integer.parseInt(fridayHours.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_FRIDAY,hours,1);
    }
    public void saturdayButton(ActionEvent event){
        int hours = Integer.parseInt(saturdayHours.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_SATURDAY,hours,1);
    }
    public void sundayButton1(ActionEvent event){
        int hours = Integer.parseInt(sundayHours1.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_SUNDAY,hours,2);
    }
    public void mondayButton1(ActionEvent event){
        int hours = Integer.parseInt(mondayHours1.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_MONDAY,hours,2);
    }
    public void tuesdayButton1(ActionEvent event){
        int hours = Integer.parseInt(tuesdayHours1.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_TUESDAY,hours,2);
    }
    public void wednesdayButton1(ActionEvent event){
        int hours = Integer.parseInt(wednesdayHours1.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_WEDNESDAY,hours,2);
    }
    public void thursdayButton1(ActionEvent event){
        int hours = Integer.parseInt(thursdayHours1.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_THURSDAY,hours,2);
    }
    public void fridayButton1(ActionEvent event){
        int hours = Integer.parseInt(fridayHours1.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_FRIDAY,hours,2);
    }
    public void saturdayButton1(ActionEvent event){
        int hours = Integer.parseInt(saturdayHours1.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_SATURDAY,hours,2);
    }
    public void sundayButton3(ActionEvent event){
        int hours = Integer.parseInt(sundayHours3.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_SUNDAY,hours,3);
    }
    public void mondayButton3(ActionEvent event){
        int hours = Integer.parseInt(mondayHours3.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_MONDAY,hours,3);
    }
    public void tuesdayButton3(ActionEvent event){
        int hours = Integer.parseInt(tuesdayHours3.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_TUESDAY,hours,3);
    }
    public void wednesdayButton3(ActionEvent event){
        int hours = Integer.parseInt(wednesdayHours3.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_WEDNESDAY,hours,3);
    }
    public void thursdayButton3(ActionEvent event){
        int hours = Integer.parseInt(thursdayHours3.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_THURSDAY,hours,3);
    }
    public void fridayButton3(ActionEvent event){
        int hours = Integer.parseInt(fridayHours3.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_FRIDAY,hours,3);
    }
    public void saturdayButton3(ActionEvent event){
        int hours = Integer.parseInt(saturdayHours3.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_SATURDAY,hours,3);
    }
    public void sundayButton4(ActionEvent event){
        int hours = Integer.parseInt(sundayHours4.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_SUNDAY,hours,4);
    }
    public void mondayButton4(ActionEvent event){
        int hours = Integer.parseInt(mondayHours4.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_MONDAY,hours,4);
    }
    public void tuesdayButton4(ActionEvent event){
        int hours = Integer.parseInt(tuesdayHours4.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_TUESDAY,hours,4);
    }
    public void wednesdayButton4(ActionEvent event){
        int hours = Integer.parseInt(wednesdayHours4.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_WEDNESDAY,hours,4);
    }
    public void thursdayButton4(ActionEvent event){
        int hours = Integer.parseInt(thursdayHours4.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_THURSDAY,hours,4);
    }
    public void fridayButton4(ActionEvent event){
        int hours = Integer.parseInt(fridayHours4.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_FRIDAY,hours,4);
    }
    public void saturdayButton4(ActionEvent event){
        int hours = Integer.parseInt(saturdayHours4.getText());
        zeestasks.EnteringHours(Tasks.TABLE_TASK3,Tasks.COLUMN_AWSDEVELOPER_SATURDAY,hours,4);
    }
}
