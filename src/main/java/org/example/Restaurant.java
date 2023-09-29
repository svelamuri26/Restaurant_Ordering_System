package org.example;

public class Restaurant {
    private FoodItem[] foodItemsList;

    public FoodItem[] getFoodItemsList(){
        return foodItemsList;
    }

    public void setFoodItemsList(FoodItem[] foodItemsList){
        this.foodItemsList=foodItemsList;
    }
}
