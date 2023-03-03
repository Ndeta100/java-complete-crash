package org.example;

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

    }
    //Using reference type to demonstrate
    static class Person{
        String name;
        Person(String name){
            this.name=name;
        }
    }
}