package wild_farm;

public class Tiger extends Felime {
    private static final String INVALID_FOOD_FOR_ANIMAL = "Tigers are not eating that type of food!";

    public Tiger(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    protected String makeSound() {
        return "ROAAR!!!";
    }

    @Override
    protected void eat(Food food, int quantity) {
        if ((super.getAnimalType().equals("Zebra") || super.getAnimalType().equals("Mouse")) && food.getClass().getSimpleName().equals("Meat")) {
            throw new IllegalArgumentException(INVALID_FOOD_FOR_ANIMAL);
        } else if ((super.getAnimalType().equals("Tiger")) && food.getClass().getSimpleName().equals("Vegetable")) {
            throw new IllegalArgumentException(INVALID_FOOD_FOR_ANIMAL);
        }
        super.setFoodEaten(super.getFoodEaten() + quantity);
    }
}
