package com.pluralsight;

import java.util.List;

public class Sandwich {
    private int size;
    private String bread;
    private boolean toasted;
    private List<Topping> toppings;

    public Sandwich(int size, String bread, boolean toasted, List<Topping> toppings) {
        this.size = size;
        this.bread = bread;
        this.toasted = toasted;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "size=" + size +
                ", bread='" + bread + '\'' +
                ", toasted=" + toasted +
                ", toppings=" + toppings +
                '}';
    }

    private void addTopping(){

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public List<Topping> getToppingsList() {
        return toppings;
    }

    public void setToppingsList(List<Topping> toppings) {
        this.toppings = toppings;
    }
}
