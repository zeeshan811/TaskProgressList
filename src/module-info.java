module UIForProgressList {
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.controls;
    requires java.sql;
    opens sample;
    opens sample.ControllerFiles to javafx.fxml;
}