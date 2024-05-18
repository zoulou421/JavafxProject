package com.formationkilo.javafxproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class IncrementAppV2 extends Application {

    private int totalButtonInDec=1;
    private  Label statusLabel;
    private Button button1;
    private Button button2;

    @Override
    public void start(Stage sWindow) throws Exception {
        sWindow.setTitle("Incremental pp");
        VBox root=new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(25));
        statusLabel= new Label("Number of increment: 1");
        button1=new Button("Increase");
        button1.setOnAction(new MyClassEventHandler());
        // button1.setOnAction(e -> System.out.println("button1 clicked!"));
        button2=new Button("Decrease");
        //button2.setOnAction(e-> System.out.println("button2 clicked!"));
        button2.setOnAction(new MyClassEventHandler());

        root.getChildren().addAll(statusLabel,button1,button2);
        Scene scene=new Scene(root,300,200);
        sWindow.setScene(scene);
        sWindow.show();
    }

    public void refactoIncreDec(int nbB){
        statusLabel.setText("Number of increment:  "+nbB);
    }

    private class MyClassEventHandler implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e) {
            if(e.getSource()==button1){
                totalButtonInDec++;
                refactoIncreDec(totalButtonInDec);
                System.out.println(totalButtonInDec+" button1 clicked!");
            }
            if(e.getSource()==button2){
                totalButtonInDec--;
                if(totalButtonInDec<1){
                    totalButtonInDec++;
                }
                refactoIncreDec(totalButtonInDec);
                System.out.println(totalButtonInDec+" button2 clicked!");
            }
        }
    }
}

