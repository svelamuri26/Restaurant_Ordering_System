package org.example;

import java.util.List;

public class Order {
    int orderID;
    List<FoodItem> foodItems;
    double totalPrice;


    public int getOrderID() {
        return orderID;
    }
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    public List<FoodItem> getFoodItems() {
        return this.foodItems;
    }
    public void setFoodItems(List<FoodItem> foodItems) {
        this.foodItems = foodItems;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
