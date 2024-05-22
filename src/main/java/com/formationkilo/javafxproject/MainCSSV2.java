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
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainCSSV2 extends Application {

    private int totalButtonInDec=1;
    private Label statusLabel;
    private Button button1;
    private Button button2;
    private Label titleLabel;

    @Override
    public void start(Stage sWindow) throws Exception {
        sWindow.setTitle("Incremental pp");
        //VBox root=new VBox(10);
        VBox root=new VBox();//take off 10 number
        System.out.println("Same id:Root element 1 : "+root);
        //root.setBackground(new Background(new BackgroundFill(Color.WHITE,null,null)));
        //root.setAlignment(Pos.CENTER);
        //root.setPadding(new Insets(25));

        titleLabel=new Label("The central App");
        titleLabel.setId("titleLabel");

        statusLabel= new Label("Number of increment: 1");
        statusLabel.setId("statusLabel");

        HBox buttonsContainer=new HBox(10);
        System.out.println(buttonsContainer);// no class :give it a class of id
        //buttonsContainer.getStyleClass().add("toto");//add a class id for buttonsContainer example

        button1=new Button("Increase".toUpperCase());

        button1.setOnAction(new MyClassEventHandler());
        button2=new Button("Decrease".toUpperCase());
        button2.setOnAction(new MyClassEventHandler());

        buttonsContainer.getChildren().addAll(button1,button2);

        root.getChildren().addAll(titleLabel,statusLabel,buttonsContainer);
        Scene scene=new Scene(root);//scene automatically
        System.out.println("Root element 2 : "+scene.getRoot());
        scene.getStylesheets().add(String.valueOf((getClass().getResource("/css/app.css"))));

        sWindow.setScene(scene);
        sWindow.show();
    }

    public void refactoIncreDec(int nbB){
        statusLabel.setText("Number of increment:  "+nbB);
    }

    private class MyClassEventHandler implements EventHandler<ActionEvent> {
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

