package com.esraa.CreationalDesignPatterns.BuilderPattern;

public class Car{

    private String brand;
    private String model;
    private String color;
    private double price;
    private int year;
    private String fuelType;
    private String transmission;
    private int horsepower;
    private double mileage;
    private boolean isUsed;
    private String vin;
    private int numberOfDoors;
    private boolean isAvailable;

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.color = builder.color;
        this.price = builder.price;
        this.year = builder.year;
        this.fuelType = builder.fuelType;
        this.transmission = builder.transmission;
        this.horsepower = builder.horsepower;
        this.mileage = builder.mileage;
        this.isUsed = builder.isUsed;
        this.vin = builder.vin;
        this.numberOfDoors = builder.numberOfDoors;
        this.isAvailable = builder.isAvailable;
    }

     public static class CarBuilder{
        private String brand;
        private String model;
        private  String color;
        private double price;
        private int year;
        private String fuelType;
        private String transmission;
        private int horsepower;
        private double mileage;
        private boolean isUsed;
        private String vin;
        private int numberOfDoors;
        private boolean isAvailable;


         public CarBuilder brand(String brand) {
             this.brand = brand;
             return this;
         }

         public CarBuilder model(String model) {
             this.model = model;
             return this;
         }

         public CarBuilder color(String color) {
             this.color = color;
             return this;
         }

         public CarBuilder price(double price) {
             this.price = price;
             return this;
         }

         public CarBuilder year(int year) {
             this.year = year;
             return this;
         }

         public CarBuilder fuelType(String fuelType) {
             this.fuelType = fuelType;
             return this;
         }

         public CarBuilder transmission(String transmission) {
             this.transmission = transmission;
             return this;
         }

         public CarBuilder horsepower(int horsepower) {
             this.horsepower = horsepower;
             return this;
         }

         public CarBuilder mileage(double mileage) {
             this.mileage = mileage;
             return this;
         }

         public CarBuilder isUsed(boolean isUsed) {
             this.isUsed = isUsed;
             return this;
         }

         public CarBuilder vin(String vin) {
             this.vin = vin;
             return this;
         }

         public CarBuilder numberOfDoors(int numberOfDoors) {
             this.numberOfDoors = numberOfDoors;
             return this;
         }

         public CarBuilder isAvailable(boolean isAvailable) {
             this.isAvailable = isAvailable;
             return this;
         }

         // Build method
         public Car build() {
             return new Car(this);
         }
     }

    }

