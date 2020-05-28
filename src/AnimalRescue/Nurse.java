package AnimalRescue;

public class Nurse extends MedicalStaff {
    @Override
    public void spend() {
        System.out.println(" spend time to help the doctor");
    }

    @Override
    public void save() {
        System.out.println(" save lifes together with the doctor");
    }
}
