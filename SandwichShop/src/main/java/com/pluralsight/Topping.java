package com.pluralsight;

import java.util.List;

public class Topping {
    private String name;
    private boolean extra;
    private boolean isPremium;

    public Topping(String name, boolean extra, boolean isPremium) {
        this.name = name;
        this.extra = extra;
        this.isPremium = isPremium;
    }

    @Override
    public String toString() {
        return name;
        /*"Topping{" +
                "name='" + name + '\'' +
                ", extra=" + extra +
                ", isPremium=" + isPremium +
                '}';
                */
    }

    private boolean getIsPremium(Topping topping){
        if(topping.isPremium){
}
        return true;
    }
    private boolean extra(){
return extra;
    }
}
