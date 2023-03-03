package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Variable
        int number=21;
        String name="Ndeta";
        char vowel='u';
        //Primitive data types
        byte theByte=127;
        short theShort=32000;
        float theFloat= 0.0030903333F;
        int theInt=213;
        long theLong=39939393993090234L;
        //Reference types
        String brand=new String("ndeta.io");
        System.out.println(brand.toUpperCase());

        //Diff between primitive and reference types
        int a=10;
        int b=a;
        a=100;
        System.out.println("a =" +a + " b=" +b);
        Person alex=new Person("alex");
        Person mariam=alex;
        System.out.println("before changing alex");
        System.out.println(alex.name + " " + mariam.name);

        System.out.println("after changing alex");
        alex.name="Alexandre";
        System.out.println(alex.name + " " + mariam.name);
//Packages and import keywords
        Date date=new Date();
        LocalDate localDate=LocalDate.now();
        LocalDateTime localDateTime=LocalDateTime.now();
//Math class
        System.out.println(Math.abs(-1002));
        System.out.println(Math.max(3.4,9.9));
        System.out.println(Math.min(3.4,9.9));
        System.out.println(Math.pow(5.0,2.0));
        //Comparison operators
        int myage=23;
        int moumeniage=22;
        boolean ismyageolderthanmoumeniage=myage>moumeniage;
        System.out.println(ismyageolderthanmoumeniage);
        boolean isAdult=true;
        boolean isStudent=false;
        System.out.println(isAdult && isStudent );
        System.out.println(isAdult || isStudent );
        //If statements
        int age=12;
        int adultAge=18;
        if (age>=adultAge){
            System.out.println("You are an adults wow");
        }else {
            System.out.println("Nice being a teen");
        }
    }
    //Using reference type to demonstrate
    static class Person{
        String name;
        Person(String name){
            this.name=name;
        }
    }
}