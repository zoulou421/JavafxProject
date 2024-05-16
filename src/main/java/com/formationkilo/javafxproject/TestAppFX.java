package com.formationkilo.javafxproject;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class TestAppFX extends Application {
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
       new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                   System.out.println("In the Thread...");
                   Thread.sleep(5000);
                  // window.close();
                   Platform.runLater(new Runnable() {
                       @Override
                       public void run() {
                          System.out.println(Thread.currentThread().getName());  //JavaFX Application Thread
                          window.close(); 
                       }
                   });
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }

           }
       }).start();
        System.out.println("After the Thread...");

    }
}




