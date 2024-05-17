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
        Rectangle rectangle=new Rectangle(300,100, Color.YELLOW);
        Label label=new Label("label added");
        root.getChildren().add(label);
        root.getChildren().add(rectangle);
        rectangle.toBack();
        Scene scene=new Scene(root,600,400);
        stage.setScene(scene);
        stage.show();
    }
}
