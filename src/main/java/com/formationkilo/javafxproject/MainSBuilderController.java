package com.formationkilo.javafxproject;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import static javafx.application.Application.launch;

public class MainSBuilderController implements Initializable {
    private int totalIncrementCount=3;

    @FXML
    private Label statusLabel;

    @FXML
    protected void handleAddIncrementButtonAction(ActionEvent e){
     System.out.println("handleAddIncrementButtonAction CALLED");
     updateLabelStatus(++totalIncrementCount);
    }

    private void updateLabelStatus(int i) {
        statusLabel.setText("You've currently:"+i);
    }

    @FXML
    protected void handleRemoveIncrementButtonAction(ActionEvent e){
     System.out.println("handleRemoveIncrementButtonAction CALLED");
     if(totalIncrementCount>0){
         updateLabelStatus(--totalIncrementCount);
     }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Init JavaFX controller");
    }


}
