package AnimalRescue;

public class MedicalStaff extends HumanBeing {
    public String name = "Ho Go Vet";
    public String specialization = "General, Surgery, ";

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSpecialization(){
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void consult(){
        System.out.println("Consulting..");}
    public void have(){
        System.out.println("Having...");
    }

}
