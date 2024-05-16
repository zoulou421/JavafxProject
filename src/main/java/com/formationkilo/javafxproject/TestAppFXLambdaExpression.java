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

       //To kwo the current
        //Thread.sleep(5000);

      // System.out.println(Thread.currentThread().getName()); //JavaFX Application Thread
         System.out.println("Before the Thread...");
       /*  new Thread(()->{
             try {
                 System.out.println("In the Thread...");
                 Thread.sleep(5000);
                 Platform.runLater(()->{
                     System.out.println(Thread.currentThread().getName());  //JavaFX Application Thread
                     window.close();
                 });
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }

         }).start();*/

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
}




