package AnimalRescue;

import java.sql.SQLOutput;

public class AppMain {
    public static void main(String[] args) {
        Dog tina = new Dog();
        tina.setName("Tina");
        tina.setAge(10);
        tina.setColor("Brown");
        tina.setRace("Basset");
        tina.setWeight((float) 20.5);
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
        tina.eat();
        tina.sleep();
        tina.play();
        tina.speak();
        tina.run();
        tina.walk();
        tina.pet();


        Cat zizou = new Cat();
        zizou.setName("Zizou");
        zizou.setAge(1);
        zizou.setColor("tricolor");
        zizou.setRace("european");
        zizou.setWeight(4.5F);
        zizou.setLevelOfHealth(10);
        zizou.setFeelingHungry(10);
        zizou.setLevelMood(10);
        System.out.println(zizou.getName());
        System.out.println(zizou.getAge());
        System.out.println(zizou.getColor());
        System.out.println(zizou.getRace());
        System.out.println(zizou.getWeight());
        System.out.println(zizou.getLevelOfHealth());
        System.out.println(zizou.getFeelingHungry());
        System.out.println(zizou.getLevelMood());
        zizou.eat();
        zizou.sleep();
        zizou.play();
        zizou.speak();
        zizou.run();
        zizou.walk();
        zizou.pet();

        Duck loli = new Duck();
        loli.setName("Loli");
        loli.setAge(5);
        loli.setColor("yellow");
        loli.setRace("Pekin");
        loli.setWeight(0.8F);
        loli.setLevelOfHealth(10);
        loli.setFeelingHungry(7);
        loli.setLevelMood(6);
        System.out.println(loli.getName());
        System.out.println(loli.getAge());
        System.out.println(loli.getColor());
        System.out.println(loli.getRace());
        System.out.println(loli.getWeight());
        System.out.println(loli.getLevelOfHealth());
        System.out.println(loli.getFeelingHungry());
        System.out.println(loli.getLevelMood());
        loli.eat();
        loli.sleep();
        loli.play();
        loli.speak();
        loli.run();
        loli.walk();
        loli.pet();


        Adoptator girl = new Adoptator();
        girl.setName("Mya");
        girl.setAge(28);
        girl.setMoney(28.346);
        girl.setSpecialization("Animal lover");
        System.out.println(girl.getName());
        System.out.println(girl.getAge());
        System.out.println(girl.getMoney());
        System.out.println(girl.getSpecialization());
        girl.buy();
        girl.save();
        girl.spend();
        girl.consult();
        girl.have();

        Adoptator boy = new Adoptator();
        boy.setName("Luca");
        boy.setAge(30);
        boy.setMoney(12.000F);
        boy.setSpecialization(" Veterinary Assiatant");
        System.out.println(boy.getName());
        System.out.println(boy.getAge());
        System.out.println(boy.getMoney());
        System.out.println(boy.getSpecialization());
        boy.buy();
        boy.save();
        boy.spend();
        boy.consult();
        boy.have();

        Doctor veterinary = new Doctor();
        veterinary.setName("Ho Go Vet");
        veterinary.setAge(45);
        veterinary.setMoney(45.999);
        veterinary.setSpecialization("General, Surgery");
        System.out.println(veterinary.getName());
        System.out.println(veterinary.getAge());
        System.out.println(veterinary.getMoney());
        System.out.println(veterinary.getSpecialization());
        veterinary.buy();
        veterinary.save();
        veterinary.spend();
        veterinary.consult();
        veterinary.have();


        Food food = new AnimalFood();
        food.setName("Husse");food.setPrice(37);
        food.setQuantity(4);
        food.setStock(12);
        System.out.println(food.getName());
        System.out.println(food.getPrice());
        System.out.println(food.getQuantity());
        System.out.println(food.getStock());
        food.producer();
        food.distribute();

        


    }
}