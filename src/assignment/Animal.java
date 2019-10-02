package assignment;

abstract class Animal {

    String name;
    int weightInGrams;

    public Animal(String name, int weightInGrams) {
        this.name = name;
        this.weightInGrams = weightInGrams;
    }

    public String getName() {
        return name;
    }
}
