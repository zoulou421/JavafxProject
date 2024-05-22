package com.formationkilo.javafxproject;

import java.util.HashMap;
import java.util.Map;

public class Person {
    private String firstName;
    private String lastName;
    //private static Map<Integer,String>someMap;
    private static Map<Integer,String>someMap=new HashMap<>(Map.of(1,"Yoooo",2,"yaaaa",3,"Yiiiii"));
    private int age;
    static {
        System.out.println("Static instance initializer is called");
        /*someMap=new HashMap<>();
        someMap.put(1,"Yoooo");
        someMap.put(2,"yaaaa");*/
    }
    {
        System.out.println("Instance initializer is called");
    }

    public Person(String firstName, String lastName, int age) {
        System.out.println("constructor 1 is called");
        System.out.println(someMap);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName) {
        /*this.firstName = firstName;
        this.lastName = lastName;*/
        this(firstName,lastName,0);
        System.out.println("constructor 2 is called");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
