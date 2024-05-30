package com.pluralsight;

public class Drink {
    private String name;
    private String size;

    public Drink(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
