package com.formationkilo.javafxproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MainApp  extends Application {
    @Override
    public void start(Stage stage) throws Exception  {
        stage.setTitle("Incremental pp");
        StackPane root=new StackPane();
        root.getChildren().add(new Rectangle(300,100, Color.YELLOW));
        root.getChildren().add(new Label("label added"));
        Scene scene=new Scene(root,600,400);
        stage.setScene(scene);
        stage.show();
    }
}
