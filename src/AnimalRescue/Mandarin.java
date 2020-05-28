package AnimalRescue;

public class Mandarin extends Duck {
    @Override
    public void eat() {
        System.out.println(" eat only clean food and clean water");
    }

    @Override
    public void run() {
        System.out.println(" flying ");
    }

    @Override
    public void speak() {
        System.out.println(" piupiupiu");

    }

    @Override
    public void sleep() {
        System.out.println("sleeping on grass, gravel");
    }
}
