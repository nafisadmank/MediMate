package com.example.medimate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class signinpageController {
    @FXML
    private Button logIn;

    @FXML
    private Button createNewAccount;

    @FXML
    protected void onCreateButtonClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("regPage.fxml"));
        Stage homepage = new Stage();
        Scene scene = new Scene(fxmlLoader.load());
        homepage.setScene(scene);

        // get a reference to the current stage (the one containing the button)
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // hide the current stage before showing the new one
        currentStage.hide();

        // show the new stage
        homepage.show();
    }
}
