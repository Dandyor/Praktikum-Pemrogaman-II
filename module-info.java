module PRAKTIKUM_6 {
    requires javafx.controls;
    requires javafx.fxml;

    opens Controller to javafx.fxml;
    opens Model to javafx.base;
    exports application;
}
