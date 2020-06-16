package com.company;

public class Lab5 {
    public static void main(String[] args) {
        LogicalOperation op = new LogicalOperation();
        int[] myArray = op.getArrayHundred();
        op.printArray(myArray);
        int[] myArrayEven = new int[100];
        op.PB3(myArrayEven);
        int[] myArray2 = {10, 23, 33, 28};
        System.out.println(op.PB4(myArray2));
        String[] myArray3 = {"ramona"};
        System.out.println(op.PB5ArrayString(myArray3));
        int[] myArray4 = new int[10];
        //System.out.println(op.PB8(myArray4));
        System.out.println(op.prb6checkArrayPosition(new int[]{7, 11, 8, 28}, 7));
        op.grid();
        int [] populatedArray = {4,5,23,31,44,56,79};
        int [] golArrayEx10 = new int[populatedArray.length];
        op.Prb10copyArray(populatedArray,golArrayEx10);
        op.printArray(golArrayEx10);
        System.out.println("Al 2-lea cel mai mic nr din array este: "+op.secondSmallArrayNr(new int[]{99,8,11,28,}));
    }
}