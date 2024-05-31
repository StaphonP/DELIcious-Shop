package com.pluralsight;

public class Chips {
    private String name;


    public Chips(String name) {
        this.name = name;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
