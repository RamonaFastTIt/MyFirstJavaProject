package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Ramona");
        byte myByte = 127;
        int myInt = 32325;
        int resultat = myByte + myInt;
        System.out.println(resultat);
        myInt = 8888;
        short myShort = 44;
        int resultat1 = myInt / myShort;
        System.out.println(resultat1);

        int x = -5;
        int y = 8;
        int z = 6;
        int resultat2 = x + y * z;
        System.out.println(resultat2);


        int x1 = 55;
        int y1 = 9;
        int resultat3 = (x1 + y1) % y1;
        System.out.println(resultat3);

        float C = 20 + -3 * 5 / 8;
        System.out.println(C);

        float D = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.print(D);
        System.out.println("\n\n");

        Calculator calc = new Calculator();
        System.out.println(calc.sum(4,4.5));
        System.out.println(calc.sum(67.8, 45.9));
        System.out.println(calc.sum(3,6,9));
        System.out.println(calc.substraction(88, 66, 122, 23));
       // System.out.println(calc.substraction(55.8, 45, 23));
        System.out.println(calc.multiple(3.5,6.7,8.9));
        System.out.println(calc.multiple(34.5,67,89));
        System.out.println(calc.aggregate(58.99, 34.12));
        System.out.println(calc.aggregate(56,23,10));



    }
}
