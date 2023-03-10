package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

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
        int age=17;
        int adultAge=18;
        if (age>=adultAge){
            System.out.println("You are an adults wow");
        } else if (age>=16 &&age<adultAge) {
            System.out.println(" I am almost an adult");
        } else {
            System.out.println("Nice being a teen");
        }
        //Ternary operator
        String message=age>=adultAge? "Hooray... I am an adult": "I am not an adult";
        System.out.println(message +" Message ");
        //Switch statements
        String gender="female";
        if (gender.equals("female")){

        } else if (gender.equals("male")) {

        } else if (gender.equals("prefer not to say")) {

        }else {

        }
        //Using a switch statement
        switch (gender){
            case "female":
                System.out.println("I am a female");
                break;
            case "male":
                System.out.println(" I am a male");
                break;
            case "prefer not to say":
                System.out.println("prefer not to say");
                break;
            default:
                System.out.println("I don't have a gender");
        }
        //Arrays
        int zero=0;
        int one=1;
        int [] numbers=new int[3];
        numbers[0]=23;
        numbers[2]=33;
        numbers[1]=55;
        System.out.println(Arrays.toString(numbers));
        boolean [] booleans=new boolean[33];
        System.out.println(Arrays.toString(booleans));
        System.out.println(numbers.length);
        int first=numbers[0];
        System.out.println(first);
        //Loops
        int value=0;
        value++;
        value--;
        value+=32;
        value-=87;
        System.out.println(value);
        //Enhance for loop
        for (int num : numbers){
            System.out.println(num);
        }
        Arrays.stream(numbers).forEach(System.out::println);
        //break and continue
        String[] names={"ndeta", "voma", "inno","cilia","sime"};
        for (String n : names) {
            if (n.equals("inno")){
                break;
            }
            System.out.println(n);
            System.out.println("after");
            if (n.startsWith("i")){
                continue;
            }
            System.out.println(n);
        }
        //While loop
        int count=10;
        while (true && count>0){
            System.out.println("wow");
            count--;
        }
        //Scanner
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your name");
        String userName= scanner.nextLine();
        System.out.println("Hello " +userName);
        System.out.println("How old are you?");
        int scanAge=scanner.nextInt();
       int year= LocalDate.now().minusYears(scanAge).getYear();
        System.out.println("You where born in "+ year);
        if(scanAge>adultAge){
            System.out.println("You are an adult");
        }else {
            System.out.println("You are not an adult");
        }
        //Methods
        char[] letters={'A','A','B','C','C','O','T','F'};
        int occur=countOccurrences(letters, 'A');
        System.out.println(occur);
        //Classes and objects
        Lens lensOne=new Lens("sony","1.2cm",true);
        Lens lensTwo=new Lens("kanon","1.254cm",false);
        Lens lensThree=new Lens("samsung","3.4cm",true);
        System.out.println("lens 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);
        System.out.println();
        System.out.println("lens 2");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);
        System.out.println();
        System.out.println("lens 3");
        System.out.println(lensThree.brand);
        System.out.println(lensThree.focalLength);
        System.out.println(lensThree.isPrime);
        //Passport
        Passport ukPassport=new Passport("2133442",localDate.of(2025,1,4));

    }
    //Class
    static class Lens{
        String brand;
        String focalLength;
        boolean isPrime;
        Lens(String brand, String focalLength, boolean isPrime){
            this.brand=brand;
            this.focalLength=focalLength;
            this.isPrime=isPrime;
        }
    }
    //Modeling a passport
    static  class Passport{
        String number;
        LocalDate expiryDate;
        Passport(String number, LocalDate expiryDate){
            this.number=number;
            this.expiryDate=expiryDate;
        }
    }
    //Using reference type to demonstrate
    static class Person{
        String name;
        Person(String name){
            this.name=name;
        }
    }
    public static int countOccurrences(char[] letters,char searchLetter){
        System.out.println("method countOccurences was invoked");
        System.out.println(Arrays.toString(letters));
        System.out.println(searchLetter);

        int count=0;
        for(char letter :letters){
            if (letter==searchLetter){
                count++;
            }
        }
        return count;
    }
}