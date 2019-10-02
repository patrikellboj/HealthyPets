package assignment;

public class Cat extends Animal implements ICalculatePortion {
    String foodType = "kattfoder";

    public Cat(String name, int weightInGrams) {
        super(name, weightInGrams);
    }

    @Override
    public String getFoodType() {
        return this.foodType;
    }

    @Override
    public String calculatePortion() {
        return String.valueOf(this.weightInGrams / 150);
    }
}
