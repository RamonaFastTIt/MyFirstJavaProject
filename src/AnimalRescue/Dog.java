package AnimalRescue;

import org.w3c.dom.ls.LSOutput;

public class Dog extends Animal{
    public void run(){
        System.out.println(" Running fast");
    }

    @Override
    public void sleep() {

    }

    public void play (){
        System.out.println(" Playing balls");
    }
    public void eat(){
        System.out.println(" Eating dog food");
    }
    public void speak(){
        System.out.println(" Ham Ham");

    }

    @Override
    public void pet() {

    }

    public void walk(){
        System.out.println(" Walking bad");
    }


}
