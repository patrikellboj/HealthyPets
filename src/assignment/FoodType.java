package assignment;

public enum FoodType {
    DOGFOOD("hundfoder"),
    CATFOOD("kattfoder"),
    SNAKEFOOD("ormpellets");

    public final String rightFoodType;

    private FoodType(String rightFoodType) {
        this.rightFoodType = rightFoodType;
    }
}


