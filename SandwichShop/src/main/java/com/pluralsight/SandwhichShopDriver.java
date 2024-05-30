package com.pluralsight;



public class SandwhichShopDriver {
    public static void main(String[] args) {
        UserInterface mainApp = new UserInterface();
        mainApp.homeScreen();
    }

}
/*
    public void homeScreen() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n----------Welcome to DELI-cious Sandwich Shop----------\n");
        System.out.println("\n(1) New Order (2) Exit");
        int command = input.nextInt();
        switch (command) {
            case 1 -> orderScreen(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
            case 2 -> exit();
        }
    }

    public void orderScreen(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n(1) Add Sandwich\n(2) Add Drink\n(3) Add Chips\n" + (isCartEmpty(sandwiches, drinks, chips) ? "" : "(4) Checkout\n") + "(5) Cancel Order");
        int command = input.nextInt();
        switch (command) {
            case 1 -> addSandwich(sandwiches);
            case 2 -> addDrinks(drinks);
            case 3 -> addChips(chips);
            case 4 -> {
                if (!isCartEmpty(sandwiches, drinks, chips)) {
                    checkOut(sandwiches, drinks, chips);
                } else {
                    System.out.println("Your cart is empty. Please add items before checking out.");
                    orderScreen(sandwiches, drinks, chips);
                }
            }
            case 5 -> exit();
        }
    }

    private boolean isCartEmpty(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
        return sandwiches.isEmpty() && drinks.isEmpty() && chips.isEmpty();
    }

    private void checkOut(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
        String today = String.valueOf(LocalDateTime.now());

        System.out.println("Your Order: ");
        System.out.println(today);
        System.out.println("Sandwiches:");
        for (Sandwich sandwich : sandwiches) {
            System.out.println("- " + sandwich);
        }
        System.out.println("Drinks:");
        for (Drink drink : drinks) {
            System.out.println("- " + drink);
        }
        System.out.println("Chips:");
        for (Chips chip : chips) {
            System.out.println("- " + chip);
        }
    }

    private void addDrinks(List<Drink> drinks) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select Drink: \n(1) Coke\n(2) Pepsi\n(3) Sprite");
        int choice = input.nextInt();
        Drink drink;
        switch (choice) {
            case 1 -> drink = new Drink("Coke", "Medium");
            case 2 -> drink = new Drink("Pepsi", "Medium");
            case 3 -> drink = new Drink("Sprite", "Medium");
            default -> {
                System.out.println("Invalid choice. Adding default drink (Coke).");
                drink = new Drink("Coke", "Medium");
            }
        }
        drinks.add(drink);
        System.out.println("Drink added.");
        orderScreen(new ArrayList<>(), drinks, new ArrayList<>());
    }

    private void addChips(List<Chips> chips) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select Chips: \n(1) Doritos\n(2) Lays\n(3) Cheetos");
        int choice = input.nextInt();
        Chips chip;
        switch (choice) {
            case 1 -> chip = new Chips("Doritos");
            case 2 -> chip = new Chips("Lays");
            case 3 -> chip = new Chips("Cheetos");
            default -> {
                System.out.println("Invalid choice. Adding default chip (Lays).");
                chip = new Chips("Lays");
            }
        }
        chips.add(chip);
        System.out.println("Chips added.");
        orderScreen(new ArrayList<>(), new ArrayList<>(), chips);
    }

    private void addSandwich(List<Sandwich> sandwiches) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select Sandwich: \n(1) Turkey\n(2) Ham\n(3) Veggie");
        int choice = input.nextInt();
        Sandwich sandwich;
        switch (choice) {
            case 1 -> sandwich = new Sandwich("Turkey", 8, "Wheat", false, new ArrayList<>());
            case 2 -> sandwich = new Sandwich("Ham", 8, "Wheat", false, new ArrayList<>());
            case 3 -> sandwich = new Sandwich("Veggie", 8, "Wheat", false, new ArrayList<>());
            default -> {
                System.out.println("Invalid choice. Adding default sandwich (Turkey).");
                sandwich = new Sandwich("Turkey", 8, "Wheat", false, new ArrayList<>());
            }
        }
        sandwiches.add(sandwich);
        System.out.println("Sandwich added.");
        orderScreen(sandwiches, new ArrayList<>(), new ArrayList<>());
    }

    public void exit() {
        // Exit method implementation

   }

 */

