package com.formationkilo.javafxproject;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class TestAppFXLambdaExpression extends Application {
    @Override
    public void start(Stage winPrimary) throws Exception {
        winPrimary.setTitle("First window");
        winPrimary.setWidth(600);
        winPrimary.setHeight(400);
        winPrimary.setResizable(false);
        winPrimary.show();
        winPrimary.centerOnScreen();

        Stage window=new Stage();

       window.setTitle("I love JavaFX");
       window.setWidth(400);
       window.setHeight(300);
       window.setResizable(false);
       window.show();
       window.centerOnScreen();


      // System.out.println(Thread.currentThread().getName()); //JavaFX Application Thread
         System.out.println("Before the Thread...");

        new Thread(()->{
            try {
                System.out.println("In the Thread...");
                Thread.sleep(5000);
                Platform.runLater(window::close);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }).start();


    }

    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("Application started");
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("Application stopped!");
    }

    public static void main(String[] args){
        Application.launch(args);
    }
}




