package assets.Zoo;
import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> Animals = new ArrayList<>();
    String Location;
    Boolean WAZAaccreditation;

    public Zoo(String location, Boolean WAZAaccreditation) {
        Location = location;
        this.WAZAaccreditation = WAZAaccreditation;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        Animals = animals;
    }

    public ArrayList<Animal> getAnimals() {
        return Animals;
    }

    public String getLocation() {
        return Location;
    }

    public Boolean getWAZAaccreditation() {
        return WAZAaccreditation;
    }
}


