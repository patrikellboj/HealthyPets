package assignment;

public class Dog extends Animal {

    public Dog(String name, int weightInGrams) {
        super(name, weightInGrams);
    }

    @Override
    public String getFoodType() {
        // enum
        return FoodType.DOGFOOD.rightFoodType;
    }

    @Override
    public String calculatePortion() {
        return String.valueOf(this.weightInGrams / 100);
    }
}
