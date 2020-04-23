package AnimalRescue;

public class Dog {
    private String name;
    private int age;
    private String color;
    private String race ;
    private float weight;
    private int levelOfHealth;
    private int feelingHungry;
    private int levelMood;


    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getRace(){
        return race;
    }
    public void setRace(String race){
        this.race = race;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getLevelOfHealth() {
        return levelOfHealth;
    }

    public void setLevelOfHealth(int levelOfHealth) {
        this.levelOfHealth = levelOfHealth;
    }

    public int getFeelingHungry() {
        return feelingHungry;
    }

    public void setFeelingHungry(int feelingHungry) {
        this.feelingHungry = feelingHungry;
    }

    public int getLevelMood() {
        return levelMood;
    }

    public void setLevelMood(int levelMood) {
        this.levelMood = levelMood;
    }

    public void eat() {
        System.out.println("Eating.."); }
        public void run(){
            System.out.println("Running..");
        }
        public void bark(){
            System.out.println("HamHam");
        }
    public void sleep(){
        System.out.println("ZzZZ");
    }


}
