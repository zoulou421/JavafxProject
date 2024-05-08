package com.formationkilo.javafxproject;

import javafx.application.Application;
import javafx.stage.Stage;

public class TestAppFX extends Application {
    @Override
    public void start(Stage window) throws Exception {
       window.setTitle("I love JavaFX");
       window.setWidth(400);
        window.setHeight(300);
        window.show();
        window.centerOnScreen();
    }
}
