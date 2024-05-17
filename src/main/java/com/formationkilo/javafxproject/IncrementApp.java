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
    private int totalButtonInDec=1;
    @Override
    public void start(Stage sWindow) throws Exception {
        sWindow.setTitle("Incremental pp");
        VBox root=new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(25));
        Label statusLabel= new Label("Number of increment: 1");
        Button button1=new Button("Increase");
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                totalButtonInDec++;
                statusLabel.setText("Number of increment:  "+totalButtonInDec);
                System.out.println(totalButtonInDec+" button1 clicked!");
            }
        });
       // button1.setOnAction(e -> System.out.println("button1 clicked!"));
        Button button2=new Button("Decrease");
        //button2.setOnAction(e-> System.out.println("button2 clicked!"));
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                totalButtonInDec--;
                if(totalButtonInDec<1){
                    totalButtonInDec++;
                }
                statusLabel.setText("Number of increment:  "+totalButtonInDec);
                System.out.println(totalButtonInDec+" button2 clicked!");
            }
        });

        root.getChildren().addAll(statusLabel,button1,button2);
        Scene scene=new Scene(root,300,200);
        sWindow.setScene(scene);
        sWindow.show();
    }
}
