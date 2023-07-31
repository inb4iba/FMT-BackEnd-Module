package models;

public class Pet {
    String name;
    Integer age;
    String species;
    String race;

    public Pet(String name, Integer age, String species, String race) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
