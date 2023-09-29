package org.example;

public class Restaurant {


   private int tables ;

    public int getTables() {
        return tables;
    }

    public void setTables(int tables) {
        this.tables = tables;
    }
    private FoodItem[] foodItemsList;

    public FoodItem[] getFoodItemsList(){
        return foodItemsList;
    }

    public void setFoodItemsList(FoodItem[] foodItemsList){
        this.foodItemsList=foodItemsList;

    }
}
