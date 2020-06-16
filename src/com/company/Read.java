package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.company.javaproject2.inch;

public class Read {
    public int getInt (){
        boolean repeat = true;
        int myInt= 0;
        do{
            try{
                Scanner scanner = new Scanner(System.in);
                myInt = scanner.nextInt();
                repeat = false;
            }catch (IndexOutOfBoundsException e){
                System.out.println("The position is invalid");
            }catch (InputMismatchException e){
                System.out.println("Incorrect value, please try again"
                );
            }
        }while (repeat);
        return myInt;
    }
    public double getDouble (){
        boolean test = true;
        double myDouble = 0.0 ;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter a decimal number: ");
                myDouble = scan.nextDouble();
                test = false;
            } catch (InputMismatchException e){
                System.out.println("Incorrect value entered. Please try again ");
            }
        } while (test);
        return myDouble;
    }
    public long getLong (){
        boolean test = true;
        long myLong = 0L;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter a long number : ");
                myLong = scan.nextLong();
                test = false;
            } catch (InputMismatchException e){
                System.out.println("Incorrect value entered. Please try again ");
            }
        } while (test);
        return myLong;
    }
    public float getFloat (){
        boolean test = true;
        float myFloat = 0F ;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter a float number: ");
                myFloat = scan.nextFloat();
                test = false;
            } catch (InputMismatchException e){
                System.out.println("Incorrect value entered. Please try again ");
            }
        } while (test);
        return myFloat;
    }
    public String getString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    }

