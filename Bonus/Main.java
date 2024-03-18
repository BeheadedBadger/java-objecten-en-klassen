package Bonus;
import java.util.ArrayList;
import assets.Zoo.*;

public class Main {

    public static Zoo NewZoo = new Zoo("Leiden", false);

    public static void main(String[] args) {
        addAnimals();
        printInfo();
    }

    static void addAnimals() {
        ArrayList<Animal> NewZoosAnimals = new ArrayList<>();

        NewZoosAnimals.add(new Animal("Rainbow boa", "Epicrates cenchria", "Reptile", "Carnivore", "Tropical forest"));
        NewZoosAnimals.add(new Animal("Wild boar", "Sus scrofa", "Mammal", "Omnivore", "Temperate forest"));
        NewZoosAnimals.add(new Animal("Imperial zebra", "Equus grevyi", "Mammal", "Herbivore", "Grassland"));
        NewZoosAnimals.add(new Animal("Asian small-clawed otter", "Aonyx cinereus", "Mammal", "Carnivore", "Freshwater wetlands"));
        NewZoosAnimals.add(new Animal("Wolverine","Gulo gulo","Mammal","Carnivore","Arctic tundra"));
        NewZoosAnimals.add(new Animal("Green anaconda","Eunectes murinus","Reptile","Carnivore","Tropical forest"));
        NewZoosAnimals.add(new Animal("Asian water monitor", "Varanus salvator","Reptile", "Carnivore", "Freshwater wetlands"));

        NewZoo.setAnimals(NewZoosAnimals);
    }

    static void printInfo()
    {
        System.out.println("Our zoo is located in " + NewZoo.getLocation() + ".");
        System.out.println("We have the following animals on display: " + NewZoo.getAnimals());
        if (NewZoo.getWAZAaccreditation())
        {
            System.out.println("We are WAZA accreditated.");
        }
        else if (!NewZoo.getWAZAaccreditation())
        {
            System.out.println("We are (not yet) WAZA accreditated.");
        }
    }
}