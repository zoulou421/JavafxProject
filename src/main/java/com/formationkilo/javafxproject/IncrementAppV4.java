package com.formationkilo.javafxproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.beans.binding.Bindings;

import java.util.Objects;

public class IncrementAppV4 extends Application {
    private int totalButtonInDec=1;
    private  Label statusLabel;
    private Button button1;
    private Button button2;

    @Override
    public void start(Stage sWindow) throws Exception {
        sWindow.setTitle("Incremental App");
        VBox root=new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(25));

        ImageView likeImageView1=new ImageView(String.valueOf(getClass().getResource("/pictures/increase.png")));
        ImageView likeImageView1_over=new ImageView(String.valueOf(getClass().getResource("/pictures/increase-over.png")));
        ImageView likeImageView2=new ImageView(String.valueOf(getClass().getResource("/pictures/decrease.png")));
        ImageView likeImageView2_over=new ImageView(String.valueOf(getClass().getResource("/pictures/decrease-over.png")));
        statusLabel= new Label("Number of increment: 1");
        button1=new Button("Increase");
        button1.graphicProperty().bind(
                Bindings.when(button1.hoverProperty()).then(likeImageView1_over).otherwise(likeImageView1)
        );

        button2=new Button("Decrease");
        button2.graphicProperty().bind(
                Bindings.when(button2.hoverProperty()).then(likeImageView2).otherwise(likeImageView2_over)
        );

        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                totalButtonInDec++;
                refactoIncreDec(totalButtonInDec);
                System.out.println(totalButtonInDec+" button1 clicked!");
            }
        });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                totalButtonInDec--;
                if(totalButtonInDec<1){
                    totalButtonInDec++;
                }
                refactoIncreDec(totalButtonInDec);
                System.out.println(totalButtonInDec+" button2 clicked!");
            }
        });

        root.getChildren().addAll(statusLabel,button1,button2);
        Scene scene=new Scene(root,300,200);
        sWindow.setScene(scene);
        sWindow.show();
    }

    public void refactoIncreDec(int nbB){
        statusLabel.setText("Number of increment:  "+nbB);
    }
}
