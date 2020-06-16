package com.company;

public class Lab4 {
    public static void main(String[] args) {
        LogicalOperation op = new LogicalOperation();
        op.checkreceivednumber(55);
        int number = 12;
        op.checknumber(number);
        op.countingnumber(5, 8);
        op.evenumber(1);
        op.oddnumber(1);
        op.ex7sum(33);
        op.ex4(13,8);
        System.out.println(op.ex8sumandaverage(34));
        op.pattern();

        op.whilecheckreceivednumber(22);
        op.wwhilereceivednumber(2);
        op.countStoDwhile(4,9);
        op.checkbiggernumberandcountStoD(9, 7);
        op.whileEvenNumber(1);
        op.whileOddNumber(1);
        System.out.println(op.ex8Division(1, 21));
        op.whileEx7();
        op.Fibonacci();
        op.CozaLozaWoza();


    }

}
