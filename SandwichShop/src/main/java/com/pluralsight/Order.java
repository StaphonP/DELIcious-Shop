package com.pluralsight;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private String orderId;
   private List<Sandwich> sandwiches;
   private List<Drink> drinks;
  private List<Chips> chips;

    public Order(String orderId, List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
        this.orderId = orderId;
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", sandwiches=" + sandwiches +
                ", drinks=" + drinks +
                ", chips=" + chips +
                '}';
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
private double getTotalCost(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
    double totalCost = 0;
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

    }
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
