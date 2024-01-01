module com.udarchiver {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.udarchiver to javafx.fxml;
    exports com.udarchiver;
}