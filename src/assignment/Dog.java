package assignment;

public class Dog extends Animal implements ICalculatePortion {
    String foodType = "hundfoder";

    public Dog(String name, int weightInGrams) {
        super(name, weightInGrams);
    }

    @Override
    public String getFoodType() {
        return this.foodType;
    }

    @Override
    public String calculatePortion() {
        return String.valueOf(this.weightInGrams / 100);
    }
}
