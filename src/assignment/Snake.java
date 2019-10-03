package assignment;

public class Snake extends Animal {
    // inkapsling
    private FoodType foodtype = FoodType.SNAKEFOOD;

    public Snake(String name, int weightInGrams) {
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
        return "20";
    }
}
