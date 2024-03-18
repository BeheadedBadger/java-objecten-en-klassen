package assets.Zoo;

public class Animal {
    String commonName;
    String scientificName;
    String type;
    String diet;
    String biome;

    public Animal(String commonName, String scientificName, String type, String diet, String biome) {
        this.commonName = commonName;
        this.scientificName = scientificName;
        this.type = type;
        this.diet = diet;
        this.biome = biome;
    }

    @Override
    public String toString() {
        return commonName + " (" + scientificName + ")";
    }
}
