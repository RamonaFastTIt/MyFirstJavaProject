package AnimalRescue;

public class HumanBeing {
    private String name;
    private int age;
    private double money;
    public String specialization;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getSpecialization(){
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }


    public void buy(){
        System.out.println("Buying..");
    }
    public void save(){
        System.out.println("Saving..");}
    public void spend()
    { System.out.println("Spending..");}
    public void consult(){
        System.out.println("Consulting..");}
    public void have(){
        System.out.println("Having...");
    }



}


