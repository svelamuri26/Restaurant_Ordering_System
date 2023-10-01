package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static Object True;

    public static void main(String[] args) {
        FoodItem biriyani = new FoodItem(" Biryani", 8.99);

        FoodItem mangoLassi = new FoodItem("MangoLassi",5.00 );
        Table table = new Table(1, true);

        List<FoodItem> foodItemList = new ArrayList<>();
        foodItemList.add(biriyani);
        foodItemList.add(mangoLassi);
        Order order = new Order();
        order.setOrderID(10);
        order.setFoodItems(foodItemList);
        Restaurant yummyKitchen = new Restaurant();
        yummyKitchen.setOrders(List.of(order));
        for (Order o : yummyKitchen.getOrders()) {
            System.out.println(o.orderID);
            for (FoodItem f : o.foodItems) {
                System.out.println("Food name = " + f.getName());
                System.out.println("Food Price = " + f.getPrice());
            }
            System.out.println("Total bill = " + o.totalPrice);
        }
    }
}