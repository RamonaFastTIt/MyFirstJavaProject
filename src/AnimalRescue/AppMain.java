package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog myObject = new Dog();
        System.out.println(myObject.name);
        System.out.println(myObject.age);
        System.out.println(myObject.color);
        System.out.println(myObject.race);
        System.out.println(myObject.weight);
        System.out.println(myObject.feelingHungry);
        System.out.println(myObject.levelMood);
        System.out.println(myObject.levelOfHealth);
        System.out.println(myObject.food);
        System.out.println(myObject.recreation);

        Adoptator MyObject = new Adoptator();
        System.out.println(MyObject.name);
        System.out.println(MyObject.age);
        System.out.println(MyObject.money);

        AnimalFood MyFood = new AnimalFood();
        System.out.println(MyFood.name);
        System.out.println(MyFood.price);
        System.out.println(MyFood.quantity);
        System.out.println(MyFood.stock);

        Recreation activities = new Recreation();
        System.out.println(activities.recreation);

        VetDoctor save = new VetDoctor();
        System.out.println(save.name);
        System.out.println(save.specialization);
    }
}
