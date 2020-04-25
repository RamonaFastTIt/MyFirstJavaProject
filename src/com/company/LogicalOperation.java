package com.company;

public class LogicalOperation {

    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String checkTexAndNumber(String Text, int number) {
        if ((Text.equals("FastTrackIt")) && (number < 3)) {
            return (Text + number);
        } else {
            return (number + Text);
        }
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

    public String NumberEven(int p) {
        if (p % 2 == 0) {
            return ("True");
        } else {
            return ("False");
        }
    }

    public String EligibleToVote(int q) {
        if (q > 18) {
            return ("True");
        } else {
            return ("False");
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
}





