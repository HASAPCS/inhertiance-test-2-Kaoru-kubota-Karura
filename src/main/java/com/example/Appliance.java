package com.example;

public class Appliance {
    // Attributes
    // TODO: Declare common attributes for electronic devices, such as brand and model and powerUsage.
        private String brand;
        private String model;
        private int powerUsage;
    // Constructor
    public Appliance(String brand, String model, int powerUsage) {
        // TODO: Initialize all attributes
        this.brand = brand;
        this.model = model;
        this.powerUsage = powerUsage;
    }

    public String getBrand(){
        return this. brand;
    }
    public String getModel(){
        return this. model;
    }
    public int getPowerUsage(){
        return this. powerUsage;
    }
    // Getters
    // TODO: Implement getters for brand, model, and powerUsage

    // public String displayInfo(){
    //     return getBrand()+getModel()+getPowerUsage();
    // } 
    public String displayInfo() {
        return "Brand: " + this.brand + ", Model: " + this.model + ", Power Usage: " + this.powerUsage + " Watts";
    }
    // displayInfo Method
    // TODO: Implement a method that returns information about the appliance, including brand, model, and power usage.
    // Check the tests for more details

    public boolean isEcoFriendly() {
        // Check if the appliance is eco-friendly based on power usage
        return this.powerUsage < 400;
    }
    // isEcoFriendly Method
    // TODO: Implement a method to check if the appliance is eco-friendly based on its power usage. 
    // An appliance that uses less than 400 Watts of power is eco-friendly.

}


