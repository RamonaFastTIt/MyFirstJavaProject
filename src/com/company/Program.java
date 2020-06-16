package com.company;

public class Program {
    private Read read = new Read();
    private Calculator calc = new Calculator();
    private LogicalOperation op =  new LogicalOperation();

    public void startProgram() {
        boolean repeatProgram = true;
        do {
            repeatProgram = executeProgram();
        } while (repeatProgram);
    }

    private boolean executeProgram() {
        printMenu();
        int number = read.getInt();
        switch (number) {
            case 1:
                System.out.println("Enter three values");
                int first = read.getInt();
                int second = read.getInt();
                int third = read.getInt();
                System.out.println("The result sum is :" + calc.sum(first, second, third));
                break;
            case 2:
                doSubstraction();

                break;
            case 3:
                doInmultire();
                break;
            case 4:
                doAggreggate();
                break;
            case 5:
                doDistance();
                break;
            case 6:
                doBiggerNumber();
            break;
            case 7:
                doCheckTextFastTrackIt();
                break;
            case 8:
                doCheckTextAndNumber();
                break;
            case 9:
                doEligibleToVote();
                break;
            case 10:
                checkNumber();
                break;
            case 11:
                prb7();
                break;
            case 12 :
                NumberEven();
                break;
            case 13:
                

            case 0:
                System.out.println("End!");
                return false;
            default:
                printMenu();


        }
        return true;

    }


    public void printMenu() {
        System.out.println(
                "Hello!\n" +
                        "Choose an option:\n" +
                        "1. Sum\n" +
                        "2. Substraction\n" +
                        "3. Inmultire\n" +
                        "4. Impartire\n" +
                        "5. Distance\n" +
                        "6. BiggerNumber\n"+
                        "7. Check text\n "+
                        "8. Check text and number\n" +
                        "9. EligibleToVote\n"+
                        "10. Get Snow size\n" +
                        "11. Equal number greater than 3 and eqaul with 4\n"+
                        "12. Even Number\n"+
                        "\n" +
                        "0. Exit"
        );
    }

    private void doSum() {
        System.out.println("Enter three values");
        int first = read.getInt();
        int second = read.getInt();
        int third = read.getInt();
        System.out.println("The result sum is :" + calc.sum(first, second, third));
    }

    private void doSubstraction() {
        System.out.println("Enter four values");
        int first = read.getInt();
        int second = read.getInt();
        int third = read.getInt();
        int four = read.getInt();
        System.out.println("The result substraction is :" + calc.substraction(first, second, third, four));
    }

    private void doInmultire() {
        System.out.println("Enter three values");
        int first = read.getInt();
        int second = read.getInt();
        int third = read.getInt();
        System.out.println("The result inmultire is :" + calc.inmultire(first, second, third));


    }

    private void doAggreggate() {
        System.out.println("Enter three values");
        int first = read.getInt();
        int second = read.getInt();
        int third = read.getInt();

        System.out.println("The result aggreggate is :" + calc.aggregate(first, second, third));
    }

    private void doDistance(){
        System.out.println("Enter a value");
        float a = read.getFloat();
        float b = read.getFloat();
        System.out.println(" The distance in meter is:" + calc.Distance(b));

    }
    private void doBiggerNumber(){
        System.out.println("Enter two values");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println(" The bigger number is: "+ op.checkBiggerNumber(first, second));
    }
    private void doCheckTextFastTrackIt(){
        System.out.println(" Enter text:");
        String text = read.getString();
        System.out.println(op.checkTextFastTrackIt(text));
    }
    private void doCheckTextAndNumber(){
        System.out.println(" Enter text and number:");
        String text = read.getString();
        int number = read.getInt();
        System.out.println(op.checkTextAndNumber(text, number));

    }
    private void doEligibleToVote(){
        System.out.println(" Enter a number: ");
        int number = read.getInt();
        System.out.println(op.EligibleToVote(number));
    }
    private void checkNumber(){
        System.out.println("Enter a number : ");
        int z = read.getInt();
        System.out.println("The snow is :"+ op.checkNumber(z));
    }
    private void prb7(){
        System.out.println("Enter a number: ");
        int a = read.getInt();
        System.out.println(op.prb7(a));
    }
    private void NumberEven(){
        System.out.println("Enter a number: ");
        int p = read.getInt();
        System.out.println(op.NumberEven(p));
    }

    }




