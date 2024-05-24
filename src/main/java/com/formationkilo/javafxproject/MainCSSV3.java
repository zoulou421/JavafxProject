package com.formationkilo.javafxproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;
import java.util.Optional;

public class MainCSSV3 extends Application {


    @Override
    public void start(Stage sWindow) throws Exception {
        Parent root=FXMLLoader.load(((Objects.requireNonNull(getClass().getResource("/fxml/MainSBuilder.fxml")))));

        sWindow.setTitle("Incremental pp");
        Scene scene=new Scene(root);
        //scene.getStylesheets().add(String.valueOf((getClass().getResource("/css/app.css"))));

        sWindow.setResizable(false);
        sWindow.setScene(scene);
        sWindow.show();
    }

   public static void main(String[] v){
        launch(v);
    }
}
