package AnimalRescue;

public class Animax extends AnimalFood {
    @Override
    public void producer() {
        System.out.println(" producing food for all animals inclusiv ducks");
    }

    @Override
    public void distribute() {
        System.out.println(" distributing food all over the world");
    }
}
