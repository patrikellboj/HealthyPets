package assignment;

public class Snake extends Animal {
    private String foodType = "ormpellets";

    public Snake(String name, int weightInGrams) {
        super(name, weightInGrams);
    }

    // Polymorfism
    @Override
    public String getFoodType() {
        return this.foodType;
    }

    @Override
    public String calculatePortion() {
        return "20";
    }
}
