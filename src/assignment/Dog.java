package assignment;

public class Dog extends Animal {
    // inkapsling
    private FoodType foodtype = FoodType.DOGFOOD;

    public Dog(String name, int weightInGrams) {
        super(name, weightInGrams);
    }

    @Override
    public String getFoodType() {
        // enum
        return foodtype.rightFoodType;
    }

    @Override
    public String calculatePortion() {
        return String.valueOf(this.weightInGrams / 100);
    }
}
