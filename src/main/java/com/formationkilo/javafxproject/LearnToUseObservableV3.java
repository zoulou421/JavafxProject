package com.formationkilo.javafxproject;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.binding.NumberBinding;

public class LearnToUseObservableV3 extends Application {
    @Override
    public void start(Stage sWindows) throws Exception {
        VBox root=new VBox(10);
        root.setPadding(new Insets(25));
        root.setAlignment(Pos.CENTER);
        Label label=new Label("Hello world");
        TextField textField=new TextField("Hello world");
        TextField textField1=new TextField("text");
        TextField  textField2=new TextField("text");

        //root.getChildren().addAll(label,textField);
        root.getChildren().addAll(textField1,textField2);

        //test of binding....
        //textField1.textProperty().bindBidirectional(textField2.textProperty());
         Bindings.bindBidirectional(textField1.textProperty(),textField2.textProperty());

        Scene scene=new Scene(root,400,400);

        sWindows.setTitle("Demo");
        sWindows.setScene(scene);
        sWindows.show();
        sWindows.centerOnScreen();
    }

    public static void main(String[] args){
        launch(args);
    }
}
