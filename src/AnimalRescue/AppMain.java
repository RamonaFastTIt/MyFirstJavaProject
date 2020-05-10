package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog tina = new Dog();
        tina.setName("Tina");
        tina.setAge (10);
        tina.setColor("Brown");
        tina.setRace("Basset");
        tina.setWeight ((float) 20.5);
        tina.setLevelOfHealth(10);
        tina.setFeelingHungry(10);
        tina.setLevelMood(10);
        System.out.println(tina.getName());
        System.out.println(tina.getAge());
        System.out.println(tina.getColor());
        System.out.println(tina.getRace());
        System.out.println(tina.getWeight());
        System.out.println(tina.getLevelOfHealth());
        System.out.println(tina.getFeelingHungry());
        System.out.println(tina.getLevelMood());

        Cat zizou =new Cat();
        zizou.setName("Zizou");


        Adoptator girl = new Adoptator();
        girl.setName("Mya");
        girl.setAge(28);
        girl.setMoney(28.346);
        System.out.println(girl.getName());
        System.out.println(girl.getAge());
        System.out.println(girl.getMoney());


        Food food = new Food();
        food.setName("Husse");
        food.setPrice(37);
        food.setQuantity(4);
        food.setStock(12);
        System.out.println(food.getName());
        System.out.println(food.getPrice());
        System.out.println(food.getQuantity());
        System.out.println(food.getStock());

        Recreation activities = new Recreation();
        activities.setRecreation("Run, Play, Sleep");
        System.out.println(activities.getRecreation());

        Doctor save = new Doctor();
        save.setName("Ho Go Vet");
        save.setSpecialization("General, Surgery");
        System.out.println(save.getName());
        System.out.println(save.getSpecialization());
    }
}
