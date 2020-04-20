package com.company;

public class javaproject2 {
    public static int X=127;
    public static int Y=32325;
    public static int x1=10;
    public static int x2=8;
    public static int x3=9;
    public static int F=50;
    public static float inch=100;
    public static void main(String[] args) {
        printMyName("Ramona");
        sum(X+Y);
        divide(8888/44);
        substraction(2300-450);
        multiple(556*58);
        a(-5+8*6);
        b ( 55+9 % 9 );
        d (5 + 15 / 3 * 2 - 8 % 3 );
        c ( 20 + -3*5 / 8 );
        int result= sum2(88, 66);
        System.out.println(result);
        System.out.println(aggregate());
        System.out.println(restulImpartirii());
        System.out.println(distance());
        System.out.println(viteza());
        System.out.println(temperature());
        System.out.println("      J    a v     v a");
        System.out.println("      J   a a v   v  a a");
        System.out.println("  J   J  aaaaa v v  aaaaa");
        System.out.println("    JJ a      a v  a      a");
        System.out.println("  +\"\"\"\"\"+");
        System.out.println(" [| o o |]");
        System.out.println("  |  ^  |");
        System.out.println("  | '_' |");
        System.out.println("  +-----+");
    }

    public static void printMyName(String args) {
        System.out.println("Hello Ramona");
    }

    public static void sum(int args) {
        int sum = X+Y;
        System.out.println(sum);
    }

    public static void divide(int args) {
        int divide = 8888/44;
        System.out.println(divide);
    }

    public static void substraction(int args) {
        int substraction = 23000-450;
        System.out.println(substraction);
    }

    public static void multiple(int args) {
        int multiple = 556*58;
        System.out.println(multiple);
    }

    public static void a (int args) {
        int a = -5 +8*6;
        System.out.println(a);
    }

    public static void b (int args) {
        int b =  (55+9) % 9;
        System.out.println(b);
    }

    public static void d(int args) {
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(d);
    }

    public static void c(int args) {
        int c =  20 + -3*5 / 8;
        System.out.println(c);
    }

    public static int sum2(int first, int second) {
      int sum2 = first+ second;
      return sum2;
    }

    public static int aggregate() {
        int agg=(x1+x2+x3)/3;
        return agg;
    }

    public static int restulImpartirii() {
        int rest=x1%x2;
        return rest;
    }

    public static float distance() {
        float distanceMeter= (float) (inch*2.5/100);
        return distanceMeter;
    }

    public static double viteza() {
        float distanta = 1000;
        float ore = 0;
        float min = 35;
        float sec = 60;
        float timp = (ore * 3600) + (min * 60) + sec;
        double v1 = distanta / timp;
        double v2 = v1 * 3.6;
        double v3 = v1 * 2.236936;
        return v1;
    }

    public static float temperature() {
       float C= (F-32)*((float)5/(float)9);
       return C;
    }


}