package com.pluralsight;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public void homeScreen(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n----------Welcome to DELI-cious Sandwich Shop----------\n");
        System.out.println("\n(1)New Order (2) Exit");
        int command = input.nextInt();
        switch (command){
            case 1 -> orderScreen(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
            case 2 -> exit();
            default -> throw new InputMismatchException("Unexpected Value" + command);
        }
   // input.close();
    }
    public void orderScreen(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n(1) Add Sandwich\n(2) Add Drink\n(3) Add Chips\n(4) Checkout\n(5) Cancel Order");
       int screenCommand = input.nextInt();

        switch (screenCommand){
            case 1 -> addSandwich(new ArrayList<>());
            case 2 -> addDrinks(new ArrayList<>());
            case 3 -> addChips(new ArrayList<>());
            case 4 -> checkOut(sandwiches,drinks,chips);
            case 5 -> exit();
            default -> throw new InputMismatchException("Unexpected Value " + screenCommand);
        }
//input.close();
    }

    private void checkOut(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
LocalDateTime today = LocalDateTime.now();
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

        //Prompt user on what drink they would like to add
        System.out.println("What Drink would you like?\n (1)Sprite\n(2)Coke\n(3)Orange Fanta\n(4)Sweet Tea\n(5)Dr.Pepper\n(6)Water Bottle");
        int choice = input.nextInt();

        //Create variable that will change based on user input
        String drinkChoice;

        //Switch case, depending on user input "drinkChoice" will change.
        switch (choice){
            case 1 ->  drinkChoice = "Sprite";
            case 2 -> drinkChoice = "Coke";
            case 3 -> drinkChoice = "Orange Fanta";
            case 4 -> drinkChoice = "Sweet Tea";
            case 5 -> drinkChoice = "Dr.Pepper";
            case 6 -> drinkChoice = "Water Bottle";
            default -> throw new InputMismatchException("Unexpected value: " + choice);
        }

        //Prompt user on what size they would like
        System.out.println("What size? (1)Small- $2.00\n(2)Medium- $2.50\n(3)Large - $3.00");
        int choice1 = input.nextInt();

        //Create variable that will change based on user Input
        String drinkSize;

        //Switch case, drinkSize will change based on user input
        switch (choice1){
            case 1 -> drinkSize = "Small";
            case 2 -> drinkSize = "Medium";
            case 3 -> drinkSize = "Large";
            default -> throw new InputMismatchException("Unexpected Value: " +choice1);
        }
        input.close();
        //Create new Drink object with user input and add it to the Drink arraylist
        Drink drink = new Drink(drinkChoice, drinkSize);
            drinks.add(drink);
        System.out.println("Drink added.");
            //Back to orderScreen
                orderScreen(new ArrayList<>(), drinks, new ArrayList<>());
    }

    private void addChips( List<Chips> chips) {
        Scanner input = new Scanner(System.in);
        System.out.println("What chips would you like to add? \n(1)Lays\n(2)Doritos\n(3)Cheetos");
        int choice = input.nextInt();
        String chipChoice;
        switch (choice){
            case 1 -> chipChoice = "Lays";
            case 2 -> chipChoice = "Doritos";
            case 3 -> chipChoice = "Cheetos";
            default -> throw new InputMismatchException("Unexpected Value: "+ choice);
        }
        Chips chips1 = new Chips(chipChoice);
        chips.add(chips1);
        System.out.println("Chips added.");
      //  input.close();
        orderScreen(new ArrayList<>(), new ArrayList<>(), chips);
    }
//Method for adding a sandwich to the order
    private void addSandwich(List<Sandwich> sandwiches ) {
        //Scanner
        Scanner input = new Scanner(System.in);

//Prompt user for what bread they would like on the sandwich,User enters numbers
        System.out.println("\nSelect Bread\n" + "(1) White\n(2) Wheat\n(3) Rye\n(4)Wrap");
       int command = input.nextInt();

       //Creating breadType variable to make a new sandwich object
       String breadType;

       //Switch command, Bread choices
        switch (command){
            case 1 -> breadType = "White" ;
            case 2 -> breadType = "Wheat";
            case 3 -> breadType = "Rye";
            case 4 -> breadType = "Wrap";
            default -> throw new InputMismatchException("Unexpected value: " + command);
        }

        //Prompt user for sandwich size
        System.out.println("\nSandwich Size\n(1)4inch - $5.50\n(2)8inch - $7.00\n(3)12inch - $8.50");
        int command1 = input.nextInt();

        //Creating sandwichSize variable to make a new sandwich object
        int sandwichSize;

        //Switch command, sandwich size changes depending on the number that the user enters
        switch (command1){
            case 1 -> sandwichSize = 4;
            case 2 -> sandwichSize = 8;
            case 3 -> sandwichSize = 12;
            default -> throw new InputMismatchException("Unexpected value: " + command1);
        }

            List<Topping> toppings = new ArrayList<>();
        //Prompt user for meat selection
        System.out.println("\nWhat meat would you like?\n-Steak\n-Ham\n-Salami\n-Roast Beef\n-Chicken\n-Bacon");
        System.out.println("4inch - $1.00, 8inch - $2.00, 12inch - $3.00"); //Print out price below
        String meat = input.next().toLowerCase();

        //Ask the user if they would like extra
        System.out.println("\nExtra " + meat + "? Y/N");
        String extraTop = input.next();

        //Created boolean extra, It is true if the user inputs a "Y". Ignore Case
       boolean extra = extraTop.equalsIgnoreCase("Y");

       //Create new Topping object with the input of user
        Topping meats = new Topping(meat,extra,true);
        //Add topping to arrayList
        toppings.add(meats);

        //Prompt user for the Cheese they would like
        System.out.println("\nWhat cheese would you like?\n(1) American\n(2) Provolone\n(3) Cheddar\n(4) Swiss\n(5) No Cheese");
        int cheeseType = input.nextInt();
        //Create variable that will change based on the user input
        String typeCheese;

        //Switch case, Typecheese changes depending on user input
        switch (cheeseType){
            case 1 -> typeCheese = "American";
            case 2 -> typeCheese = "Provolone";
            case 3 -> typeCheese = "cheddar";
            case 4 -> typeCheese = "Swiss";
            case 5 -> typeCheese = "No Cheese";
            default -> throw new InputMismatchException("Unexpected value: " + cheeseType);
        }

        //Ask the user if they would like extra
        System.out.println("\n Extra? Y/N");
        String extraCheese = input.next();

        //Created boolean extra, It is true if the user inputs a "Y". Ignore Case
        boolean extraCheesy = extraCheese.equalsIgnoreCase("Y");

        //Create new cheese topping with user input
            Topping cheese = new Topping(typeCheese,extraCheesy,true);

            //Add cheese to arrayList
            toppings.add(cheese);

           //Toppings List
        System.out.println("--------Toppings--------\n" +
                "1 - lettuce\n" +
                "2 - peppers\n" +
                "3 - onions\n" +
                "4 - tomatoes\n" +
                "5 - jalepenos\n" +
                "6 - cucumbers\n" +
                "7 - pickles\n" +
                "8 - guacamole\n" +
                "9 - mushrooms");

        //User will add toppings until they input "Done"
        System.out.println("Please choose your toppings. Enter 'done' when you're finished.");
        String toppingChoice;
        do {
            System.out.print("Add a topping: ");
            toppingChoice = input.nextLine();
            if (!toppingChoice.equalsIgnoreCase("done")) {
                Topping newTopping = new Topping(toppingChoice,false,false);
                toppings.add(newTopping);
            }
        } while (!toppingChoice.equalsIgnoreCase("done"));

//If user doesnt enter any toppings we let them know that their sandwich is plain
        if (toppings.isEmpty()) {
            System.out.println("You didn't choose any toppings. Your sandwich is plain.");
        } else {
            //Shows user the list of toppings they chose
            System.out.println("Your sandwich with the following toppings:");
            for (Topping topping : toppings) {
                System.out.println("- " + topping);
            }
        }


        System.out.println("\nSauce:" +
                "\n(1) mayo\n" +
                "(2)mustard\n" +
                "(3)ketchup\n" +
                "(4)ranch\n" +
                "(5)thousand island\n" +
                "(6)vinaigrette");
        //User will add toppings until they input "Done"
        System.out.println("Please choose your sauces. Enter 'done' when you're finished.");
        String sauceChoice;
        do {
            System.out.print("Add a sauce: ");
            sauceChoice = input.nextLine();
            if (!sauceChoice.equalsIgnoreCase("done")) {
                Topping newSauce = new Topping(sauceChoice,false,false);
                toppings.add(newSauce);
            }
        } while (!sauceChoice.equalsIgnoreCase("done"));

//If user doesnt enter any toppings we let them know that their sandwich is plain
        if (toppings.isEmpty()) {
            System.out.println("You didn't choose any toppings. Your sandwich is plain.");
        } else {
            //Shows user the list of toppings they chose
            System.out.println("Your sandwich with the following toppings:");
            for (Topping topping : toppings) {
                System.out.println("- " + topping);
            }
        }
        System.out.println("Would you like this toasted? Y/N: ");
        String toasted = input.next();
        boolean isToasted = toasted.equalsIgnoreCase("Y");
        Sandwich sandwich1 = new Sandwich(sandwichSize,breadType,isToasted,toppings);
     sandwiches.add(sandwich1);
        System.out.println("Sandwich added!");
       // input.close();
        orderScreen(sandwiches, new ArrayList<>(), new ArrayList<>());
    }









    public void exit(){

    }
}

/* while (true) {
            String choice = input.nextLine();
            if (choice.equalsIgnoreCase("done")) {
                break;
            }
            try {
                int toppingChoice = Integer.parseInt(choice);
                switch (toppingChoice) {
                    case 1:
                        Topping lettuce = new Topping("lettuce",false,false);
                        toppings.add(lettuce);
                        break;
                    case 2:
                        Topping peppers = new Topping("peppers",false,false);
                        toppings.add(peppers);
                        break;
                    case 3:
                        Topping onions = new Topping("onions",false,false);
                        toppings.add(onions);
                        break;
                    case 4:
                        Topping tomatoes = new Topping("tomatoes",false,false);
                        toppings.add(tomatoes);
                        break;
                    case 5:
                        Topping jalepenos = new Topping("jalepenos",false,false);
                        toppings.add(jalepenos);
                        break;
                    case 6:
                        Topping cucumbers = new Topping("cucumbers",false,false);
                        toppings.add(cucumbers);
                        break;
                    case 7:
                        Topping pickles = new Topping("pickles",false,false);
                        toppings.add(pickles);
                        break;
                    case 8:
                        Topping guacamole = new Topping("guacamole",false,false);
                        toppings.add(guacamole);
                        break;
                    case 9:
                        Topping mushrooms = new Topping("mushrooms",false,false);
                        toppings.add(mushrooms);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 9 or type 'done' to finish.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please enter a number between 1 and 9 or type 'done' to finish.");


 */