package com.formationkilo.javafxproject;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.IntegerBinding;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.beans.binding.NumberExpression;
import javafx.scene.control.TextInputControl;

public class MyApp  extends Application {
    //private Label sumLabel;
    //private TextField textField1;
    //private TextField textField2;
    @Override
    public void start(Stage sWindows) throws Exception {
        VBox root=new VBox(10);
        root.setPadding(new Insets(25));
        root.setAlignment(Pos.CENTER);

        Label sumLabel=new Label("15");
        TextField textField1=new TextField("5");
        TextField textField2=new TextField("10");

        IntegerBinding integerBinding=new IntegerBinding(){
            {

                bind(textField1.textProperty(),textField2.textProperty());
            }

            @Override
            protected int computeValue() {
                int value1=textField1.getText().trim().isEmpty()?0:Integer.parseInt(textField1.getText());
                int value2=textField2.getText().trim().isEmpty()?0:Integer.parseInt(textField2.getText());
                return value1+value2;
            }
        };
         //sumLabel.textProperty().bind(IntegerBinding.asString);
        sumLabel.textProperty().bind(Bindings.format("%d",integerBinding));

        root.getChildren().addAll(sumLabel,textField1,textField2);
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
