package com.formationkilo.javafxproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class IncrementApp extends Application {
    @Override
    public void start(Stage sWindow) throws Exception {
        sWindow.setTitle("Incremental pp");
        VBox root=new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(25));
        Label statusLabel= new Label("Number of increment: 1");
        Button button1=new Button("Increase");
        button1.setOnAction(e -> System.out.println("button1 clicked!"));
        Button button2=new Button("Decrease");
        button2.setOnAction(e-> System.out.println("button2 clicked!"));

        root.getChildren().addAll(statusLabel,button1,button2);
        Scene scene=new Scene(root);
        sWindow.setScene(scene);
        sWindow.show();
    }
}
