package com.example;


public class Refrigerator extends Appliance {
    // Attributes    
    private int temperature;
    private String[] foodItems;
    private int itemCount;

    // Constructor
    public Refrigerator(String brand, String model, int powerUsage, int temperature) {
        super(brand, model, powerUsage);
        this.temperature = temperature;

        this.foodItems = new String[5];
        this.itemCount = 0;
    }

    // F**king get and S**t set
    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    // override
    // I don't like this. 
    @Override
    public String displayInfo() {
        // return "Brand: "+this.brad+", Model:" + this.model+ ", Power Usage: "+ this.PowerUsage+ " Watts , Temperature: "+ this.temperature + "°C";
        return "Brand: " + getBrand() + ", Model: " + getModel() + ", Power Usage: " + getPowerUsage() + " Watts, Temperature: " + this.temperature + "°C";
    }

    // BONUS BRO

    public boolean addFoodItem(String foodItem) {
        if (itemCount < 5) {
            foodItems[itemCount++] = foodItem;
            return true;
        }
        return false;
    }

    public boolean removeFoodItem(String foodItem) {
        for (int i = 0; i < itemCount; i++) {
            if (foodItems[i].equals(foodItem)) {
                for (int j = i; j < itemCount - 1; j++) {
                    foodItems[j] = foodItems[j + 1];
                }
                foodItems[itemCount - 1] = null;
                itemCount--;
                return true;
            }
        }
        return false;
    }

    // Get Food Items
    // why works after put String"[]"? this is suggest by VS code but...
    public String[] getFoodItems() {
        return foodItems;
    }
}
