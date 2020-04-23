package AnimalRescue;

public class Recreation {
    public String recreation = "Run, Play, Sleep";

    public String getRecreation(){
        return recreation;
    }

    public void setRecreation(String recreation) {
        this.recreation = recreation;
    }

    public void walk (){
        System.out.println("walking..");
    }
    public void pet(){
        System.out.println("Petting..");
    }
    public void play(){
        System.out.println("Playing..");
    }
}
