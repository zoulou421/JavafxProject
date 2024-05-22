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

public class MainAppCSS extends Application {

    private int totalButtonInDec=1;
    private Label statusLabel;
    private Button button1;
    private Button button2;
    private Label titleLabel;

    @Override
    public void start(Stage sWindow) throws Exception {
        sWindow.setTitle("Incremental pp");
        VBox root=new VBox(10);
        root.setBackground(new Background(new BackgroundFill(Color.WHITE,null,null)));
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(25));
        Font font=Font.font("Comic Sans MS",16);

        titleLabel=new Label("The central App");
        titleLabel.setFont(font);

        statusLabel= new Label("Number of increment: 1");
        // statusLabel.setFont(Font.font("Comic Sans MS",16));
        statusLabel.setStyle("-fx-font-family: \"Comic Sans MS\";-fx-font-size:20px;-fx-text-fill: red;");
        //statusLabel.setFont(font);


        HBox buttonsContainer=new HBox(10);

        button1=new Button("Increase".toUpperCase());
        // button1.setFont(Font.font("Comic Sans MS",16));
       // button1.setFont(font);alternative1
        //alternative 2:
        button1.setStyle("-fx-font-family: \"Comic Sans MS\";-fx-font-size:16px;-fx-text-fill: #044E54;-fx-background-color:#E66A6A;-fx-background-radius:5px;-fx-text-fill: white;-fx-padding: 8px; ");
        //button1.setMaxWidth(Double.MAX_VALUE);
        //button1.setBackground(new Background(new BackgroundFill(Color.web("#E66A6A"),null,null)));
        //button1.setTextFill(Color.WHITE);
        //button1.setPadding(new Insets(8));

        button1.setOnAction(new MyClassEventHandler());
        // button1.setOnAction(e -> System.out.println("button1 clicked!"));
        button2=new Button("Decrease".toUpperCase());
        //button2.setOnAction(e-> System.out.println("button2 clicked!"));
        button2.setOnAction(new MyClassEventHandler());
        // button2.setFont(Font.font("Comic Sans MS",16));

       // button2.setFont(font);
        button2.setStyle("-fx-font-family: \"Comic Sans MS\";-fx-font-size:16px;-fx-text-fill: #044E54;-fx-background-color:#E66A6A;-fx-background-radius:5px;-fx-text-fill: white;-fx-padding: 8px; ");
        //button2.setMaxWidth(Double.MAX_VALUE);
        //button2.setBackground(new Background(new BackgroundFill(Color.web("#E66A6A"),null,null)));
        //button2.setTextFill(Color.WHITE);
        //button2.setPadding(new Insets(8));
        buttonsContainer.getChildren().addAll(button1,button2);
        //root.getChildren().addAll(titleLabel,statusLabel,button1,button2);
        root.getChildren().addAll(titleLabel,statusLabel,buttonsContainer);
        //Scene scene=new Scene(root,300,200);
        Scene scene=new Scene(root);//scene automatically
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

