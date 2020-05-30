package com.company;

import javax.print.attribute.standard.PresentationDirection;
import java.util.ArrayList;
import java.util.List;

public class Lab6 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList();
        myList.add(0);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        LogicalOperation op = new LogicalOperation();
        op.addToListEx2(myList,6);
        System.out.println(myList);
        op.printList(myList);
        System.out.println("\n");
        op.Ex3(myList, 2);
        System.out.println("\n");
        op.Ex4(myList);

        List<String> firstStringList = new ArrayList<String>();
        firstStringList.add("MAri");
        firstStringList.add("Bia");
        firstStringList.add("Mya");
        op.Ex5(firstStringList,3,"Ana");
        op.printList(firstStringList);
        System.out.println("\n");
        List<String> Lists = new ArrayList<>();
        Lists.add("Red");
        Lists.add("Green");
        System.out.println(Lists);
        Lists.add(0, "white");
        System.out.println(Lists);
        System.out.println("\n");
        List<Integer> myList2 = new ArrayList<>();
        myList2.add(3);
        myList2.add(6);
        myList2.add(3);
        op.printListNrandPositionEx7(myList2);
        System.out.println("\n");
        System.out.println("Cel mai mare numar din lista este: "+op.Ex8MaxNumber(myList2));








    }
}
