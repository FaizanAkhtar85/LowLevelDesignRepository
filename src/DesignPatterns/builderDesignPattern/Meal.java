package DesignPatterns.builderDesignPattern;

public class Meal {
    private String burger;
    private String drink;
    private String fries;
    private String dessert;

    private Meal(){

    }
    public String getBurger() {
        return burger;
    }

    public String getDrink() {
        return drink;
    }

    public String getFries() {
        return fries;
    }

    public String getDessert() {
        return dessert;
    }

    static class Builder{
        private Meal meal;
        Builder(){
            meal = new Meal();
        }
        Builder withBurger(String burger){
            meal.burger = burger;
            return  this;
        }
        Builder withDrink(String drink) {
            meal.drink = drink;
            return this;
        }

        Builder withFries(String fries) {
            meal.fries = fries;
            return this;
        }

        Builder withDessert(String dessert) {
            meal.dessert = dessert;
            return this;
        }
        Meal build(){
            return  meal;
        }
    }
}
