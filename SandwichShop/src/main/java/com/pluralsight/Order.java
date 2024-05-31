package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    public static String orderId;
   public static List<Sandwich> sandwiches;
   public static List<Drink> drinks;
  public static List<Chips> chips;

    public Order(String orderId, List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
        this.orderId = orderId;
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\nOrder # " + orderId +
                "\n Sandwiches- "
                + sandwiches +
                "\nDrinks- "
                + drinks +
                "\nChips- " +
                chips;

    }

    public void addSandwich(Sandwich sandwich){
    sandwiches.add(sandwich);
}
 void addDrink(Drink drink){
    drinks.add(drink);
}
private void addChips(Chips chip){
chips.add(chip);
}
private void displayOrder(){

}
public float getTotalCost(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
    float totalCost = 0;
    for (Sandwich sandwich : sandwiches) {
        int size = sandwich.getSize();
        if (size == 4) {
            totalCost += 5.50;
        } else if (size == 8) {
            totalCost += 7.00;
        } else if (size > 8) {
            totalCost += 8.00;
        }
    }

// Calculate total cost for drinks
    for (Drink drink : drinks) {
        String size = drink.getSize();
        if (size.equals("Large")) {
            totalCost += 3.00;
        } else if (size.equals("Medium")) {
            totalCost += 2.50;
        } else if (size.equals("Small")) {
            totalCost += 2.00;
        }
    }
    for(Chips chip: chips){
    totalCost +=  1.50;
    }
    return totalCost;
}
public void printReceipt(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips){
LocalDateTime today = LocalDateTime.now();
    try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(receiptId(today),true));
        writer.write(String.valueOf(today));
        writer.newLine();
      for(Sandwich sandwich : sandwiches) {
          writer.write(String.valueOf(sandwich));
      }
      writer.newLine();
      for (Drink drink : drinks){
          writer.write(String.valueOf(drink));
      }
      writer.newLine();
      for(Chips chip : chips){
          writer.write(String.valueOf(chip));
      }
      writer.newLine();
       double costs = getTotalCost(sandwiches,drinks,chips);
      writer.write(String.valueOf(costs));
        writer.close();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}

public String receiptId(LocalDateTime dateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        return "receipt_" + dateTime.format(formatter) + ".txt";
    }

    public String getOrderId () {
        return orderId;
    }

    public void setOrderId (String orderId){
        this.orderId = orderId;
    }

    public List<Sandwich> getSandwiches () {
        return sandwiches;
    }

    public void setSandwiches (List < Sandwich > sandwiches) {
        this.sandwiches = sandwiches;
    }

    public List<Drink> getDrinks () {
        return drinks;
    }

    public void setDrinks (List < Drink > drinks) {
        this.drinks = drinks;
    }

    public List<Chips> getChips () {
        return chips;
    }

    public void setChips (List < Chips > chips) {
        this.chips = chips;
    }

}
