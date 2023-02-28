module com.example.medimate {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.medimate to javafx.fxml;
    exports com.example.medimate;
}