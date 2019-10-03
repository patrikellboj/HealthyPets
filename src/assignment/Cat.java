package assignment;

public class Cat extends Animal {

    public Cat(String name, int weightInGrams) {
        super(name, weightInGrams);
    }

    // Polymorfism
    @Override
    public String getFoodType() {
        // enum
        return FoodType.CATFOOD.rightFoodType;
    }

    @Override
    public String calculatePortion() {
        return String.valueOf(this.weightInGrams / 150);
    }
}
