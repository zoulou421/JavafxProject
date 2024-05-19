package com.formationkilo.javafxproject;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.binding.NumberBinding;

public class LearnToUseObersable {
    public static void main(String[] args){

        SimpleIntegerProperty number1=new SimpleIntegerProperty(5);
        SimpleIntegerProperty number2=new SimpleIntegerProperty(10);

        NumberBinding sum=number1.add(number2);

        System.out.println(sum.getValue());

        number2.set(5);

        System.out.println(sum.getValue());
    }
}
