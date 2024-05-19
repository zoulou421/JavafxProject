package com.formationkilo.javafxproject;

import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.binding.NumberBinding;
public class LearnToUseObersableV2{
    public static void main(String[] args){

        IntegerProperty number1=new SimpleIntegerProperty(5);
        IntegerProperty number2=new SimpleIntegerProperty(10);

        NumberBinding sum= Bindings.add(number1,number2);

        System.out.println(sum.getValue());

        number2.set(5);

        System.out.println(sum.getValue());
    }
}
