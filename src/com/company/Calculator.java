package com.company;

public class Calculator {


    public class javaproject2 {
        public int x =127;
        public int y =32325;
        public int x1=10;
        public int x2=8;
        public int x3=9;
        public int F=50;
        public float inch=100;
        public void main() {
            printMyName("Ramona");
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

        public void printMyName(String args) {
            System.out.println("Hello Ramona");
        }



        public void divide(int args) {
            int divide = 8888/44;
            System.out.println(divide);
        }

        public void substraction(int args) {
            int substraction = 23000-450;
            System.out.println(substraction);
        }

        public void multiple(int args) {
            int multiple = 556*58;
            System.out.println(multiple);
        }

        public void a (int args) {
            int a = -5 +8*6;
            System.out.println(a);
        }

        public  void b (int args) {
            int b =  (55+9) % 9;
            System.out.println(b);
        }

        public  void d(int args) {
            int d = 5 + 15 / 3 * 2 - 8 % 3;
            System.out.println(d);
        }

        public void c(int args) {
            int c =  20 + -3*5 / 8;
            System.out.println(c);
        }

        public int sum2(int first, int second) {
            int sum2 = first+ second;
            return sum2;
        }

        public int aggregate() {
            int agg=(x1+x2+x3)/3;
            return agg;
        }

        public int restulImpartirii() {
            int rest=x1%x2;
            return rest;
        }

        public float distance() {
            float distanceMeter= (float) (inch*2.5/100);
            return distanceMeter;
        }

        public double viteza() {
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

        public float temperature() {
            float C= (F-32)*((float)5/(float)9);
            return C;
        }

    }

    public double sum2(int  first, double second){
        double result = first + second;
        return result;
    }
    public double sum2(double  first, double second){
        double result = first + second;
        return result;
    }
    public int sum2(int first, int second, int third){
        int result = first + second + third;
        return result;
    }
    public int substraction(int first, int second, int third, int four){
        int result = first - second- third - four;
        return result;
    }
    public double substraction(double first, int second, int third){
        double result= first - second- third;
        return result;
    }
    public double multiple( double first, double second, double third){
        double result = first * second * third;
        return result;
    }
    public double multiple ( double first, int second, int third){
        double result = first* second* third;
        return second;
    }
    public double aggregate ( double first, double second){
        double result= first/second;
        return result;
    }
    public float aggregate( int first, int second, int third){
        float result = first/second/third;
        return result;

    }
}
