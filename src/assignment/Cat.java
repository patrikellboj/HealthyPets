package assignment;

public class Cat extends Animal {
    // inkapsling
    private FoodType foodtype = FoodType.CATFOOD;

    public Cat(String name, int weightInGrams) {
        super(name, weightInGrams);
    }

    // Polymorfism
    @Override
    public String getFoodType() {
        // enum
        return foodtype.rightFoodType;
    }

    @Override
    public String calculatePortion() {
        return String.valueOf(this.weightInGrams / 150);
    }
}
