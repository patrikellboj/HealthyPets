package assignment;

public class Snake extends Animal implements ICalculatePortion {
    String foodType = "ormpellets";

    public Snake(String name, int weightInGrams) {
        super(name, weightInGrams);
    }

    @Override
    public String getFoodType() {
        return this.foodType;
    }

    @Override
    public String calculatePortion() {
        return "20";
    }
}
