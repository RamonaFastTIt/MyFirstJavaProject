package com.company;

public class Lab3Java {
    public static void main(String[] args) {
        LogicalOperation op = new LogicalOperation();
        int x = 44;
        int y = 12;
        int bigger = op.checkBiggerNumber(x, y);
        System.out.println("The bigger number is :" + bigger);

        String Text="Monica";
        int number=10;
        System.out.println(op.checkTexAndNumber(Text, number));

       int z=7;
       System.out.println(op.checkNumber(z));

       int a=2;
        System.out.println(op.prb7(a));

        int p=3;
        System.out.println(op.NumberEven(p));

        int q=30;
        System.out.println(op.EligibleToVote(q));

        int l=35;
        int m=77;
        int n=69;
        System.out.println(op.prb11(l, m, n));

        int caseNumber=99;
        System.out.println(op.prb8(caseNumber));
    }
    }




