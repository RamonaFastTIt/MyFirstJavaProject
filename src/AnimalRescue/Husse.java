package AnimalRescue;

public class Husse extends AnimalFood {
    @Override
    public void producer() {
        System.out.println(" producing food only for cats and dogs");
    }

    @Override
    public void distribute() {
        System.out.println(" distributing food only in Romania");
    }
}
