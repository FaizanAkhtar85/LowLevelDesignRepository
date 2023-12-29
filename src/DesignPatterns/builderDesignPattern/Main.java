package DesignPatterns.builderDesignPattern;

public class Main {
    public static void main(String[] args) {
        Meal meal1 = new Meal.Builder()
                .withDessert("Pan Ice Cream")
                .withBurger("Chicken Burger")
                .withFries("chilli potato")
                .build();

        Meal meal2 = new Meal.Builder()
                .withDessert("Butter Scoach Cream")
                .withBurger("Panner Burger")
                .withDrink("Lime Soda")
                .build();

        displayMealItems(meal1);
        displayMealItems(meal2);
    }
    public static  void displayMealItems(Meal meal){
        System.out.println("Meal Details:");
        System.out.println("Burger: " + meal.getBurger());
        System.out.println("Drink: " + meal.getDrink());
        System.out.println("Fries: " + meal.getFries());
        System.out.println("Dessert: " + meal.getDessert());
        System.out.println();

    }
}
