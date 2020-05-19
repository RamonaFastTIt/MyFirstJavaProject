package com.company;
import java.util.Arrays;

public class LogicalOperation {

    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String checkTexAndNumber(String Text, int number) {
        if ((Text.equals("FastTrackIt")) && (number <= 3)) {
            return (Text + number);
        }
        if ((!Text.equals("FastTrackIt")) && (number >= 4)) {
            return (number + Text);
        }
        return null;
    }

    public String checkNumber(int z) {
        if ((z > 8) || (z == 6)) {
            return ("The amount of snow this winter was(cm):" + z);
        } else {
            return ("The forecast snow is(cm):" + z);
        }
    }

    public String prb7(int a) {
        if ((a > 3) && (a != 4)) {
            return ("The number is greater than 3 and not equal to 4");
        }
        if (a == 4) {
            return ("The number is equal to 4");
        }
        if (a < 3) {
            return ("The number is lower than 3");
        }

        return null;
    }

    public boolean NumberEven(int p) {
        if (p % 2 == 0) {
            return (true);
        } else {
            return (false);
        }
    }

    public boolean EligibleToVote(int q) {
        if (q > 18) {
            return (true);
        } else {
            return (false);
        }
    }

    public int prb11(int l, int m, int n) {
        if ((l > m) && (l > n)) {
            return (l);
        } else if ((m > l) && (m > n)) {
            return (m);
        } else if ((n > l) && (n > m)) {
            return (n);
        } else {
            int maxim = l;
            return (maxim);
        }
    }

    public String prb8(int caseNumber) {
        switch (caseNumber) {
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
            case 4:
                System.out.println("The number is 4");
                break;
            case 5:
                System.out.println("The number is 5");
                break;
            default:
                return "Not ok";
        }
        return null;
    }


    public void checkreceivednumber(int x) {
        for (x = x; x <= 100; x++) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }

    public void checknumber(int v) {
        for (v = v; v >= -100; v--) {
            System.out.println(v + " ");
        }
        System.out.println("\n");
    }

    public void countingnumber(int k, int g) {
        if (k <= g) {
            for (k = k; k <= g; k++) {
                System.out.println(k + " ");
            }
        } else
            for (g = g; g <= k; g++) {
                System.out.println(g + " ");
            }
        System.out.println("\n");
    }

    public void evenumber(int n1) {
        {
            for (n1 = 1; n1 <= 100; n1++)
                if (n1 % 2 == 0) {
                    System.out.println(n1 + " ");
                }
        }
    }

    public void oddnumber(int m1) {
        for (m1 = 1; m1 <= 100; m1++)
            if (m1 % 2 != 0) {
                System.out.println(m1 + " ");
            }
    }

    public void ex4(int pp, int rr) {
        if (pp <= rr) {
            for (pp = pp; pp <= rr; pp++) {
                System.out.println(pp + " ");
            }
        } else
            for (rr = rr; rr <= pp; rr++) {
                System.out.println(rr + " ");
            }
        System.out.println("\n");

    }

    public void ex7sum(int i) {
        int sum = 0;
        for (i = i; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public float ex8sumandaverage(int i) {
        float sum = 0F;
        int count = 0;
        for (i = i; i < +100; i++) {
            sum += i;
            count = count + 1;
        }
        System.out.println("media este: ");
        return sum / count;
    }

    public void pattern() {
        int t, u;
        for (t = 7; t > 0; t--) {
            for (u = t; u > 0; u--) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }


    public void whilecheckreceivednumber(int j) {
        while (j <= 100) {
            System.out.println(j + " ");
            j++;
        }
        System.out.println(" \n");
    }

    public void wwhilereceivednumber(int j) {

        while (j >= -100) {
            System.out.println(j + " ");
            j--;
        }

        System.out.println(" \n");
    }

    public void countStoDwhile(int s, int d) {
        while (s <= d) {
            System.out.println(s + " ");
            s++;
        }
        System.out.println("\n");

    }

    public void checkbiggernumberandcountStoD(int s, int d) {
        if (s < d) {
            while (s <= d) {
                System.out.println(s + " ");
                s++;
            }

        } else if (s > d) {
            while (d <= s) {
                System.out.println(d + " ");
                d++;
            }
        } else System.out.println("numerele sunt egale");
        System.out.println("\n");
    }

    public void whileEvenNumber(int x) {
        {
            while (x <= 100) {
                if (x % 2 == 0)
                    System.out.println(x + " ");
                x++;
            }
        }
    }

    public void whileOddNumber(int x) {
        while (x <= 100) {
            if (x % 2 != 0)
                System.out.println(x + "  ");
            x++;
        }
    }

    public float ex8Division(int a, int b) {
        float count = 0F;
        float sum = 0F;
        while (a <= b) {
            if (a % 7 == 0) {
                count += 1;
                sum += a;
            }
            a++;
        }
        float average = sum / count;
        System.out.println("media numarului din intervalul a si b : ");
        return average;

    }

    public void whileEx7() {
        int x = 111;
        int count = 0;
        int sum = 0;
        while (x <= 8899) {
            sum += x;
            count++;
            x++;
        }
        System.out.println(" suma numerelor este:" + sum);
        System.out.println(" media numerelor este:" + sum / count);
        System.out.println("\n");
    }

    public void Fibonacci() {
        int x = 0;
        int y = 1;
        int i = 1;
        int F = 0;
        while (i <= 20) {
            F = x + y;
            x = y;
            y = F;
            i++;
            System.out.println(F);
        }

    }

    public void CozaLozaWoza() {
        int i = 1;
        while (i <= 110) {
            if (i % 11 == 0) {
                System.out.println(i + " \n ");
            } else if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("CozaLozaWoza");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("WozaLoza");
            } else if (i % 3 == 0) {
                System.out.print("Coza");
            } else if (i % 5 == 0) {
                System.out.print("Loza");
            } else if (i % 7 == 0) {
                System.out.print("Woza");
            } else
                System.out.print(i + " ");
            i++;
        }

    }

    public int[] getArrayHundred() {
        int array[] = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] PB3(int[] arrayEven) {
        for (int i = 0; i < 100; i++) {
            arrayEven[i] = i + 1;
            if (arrayEven[i] % 2 == 0) {
                System.out.println(arrayEven[i]);
            }
        }
        return arrayEven;
    }

    public double PB4(int[] array) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            count += 1;
        }
        return sum / count;
    }

    public boolean PB5(String[] array)
    {
        String a="monica";
        for (int i = 0; i < array.length; i++)
        {
            if (a==array[i]) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
    public int prb6checkArrayPosition(int[] array , int nr){
        int upr = -1;
        for( int i =0; i< array.length; i++){
            if (array[i] == nr) {
                System.out.print(" true!!! numarul se afla in array si pozitia lui este : ");
                upr = i;

            }
        }
        return upr;
    }

    public void grid(){
        int [][] a = new int [10][10];
        for (int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.printf("-");
            }
            System.out.println();

        }
    }


    //public int[] PB8(int[] array)
    {
       // int x=10;
       // for (int i = 0; i < array.length; i++)
           // if (x == array[i])
               // System.out.println(array[i]);
       // return array;
    }
    public void Prb10copyArray(int[] array,int[] arrayGol){
        for(int i=0; i<array.length;i++){
            arrayGol[i]=array[i];
        }

    }

    public int secondSmallArrayNr(int[] array) {
        Arrays.sort(array);
        return array[1];
    }


    }
























