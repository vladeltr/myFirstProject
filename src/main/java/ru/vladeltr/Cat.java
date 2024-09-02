package ru.vladeltr;

public class Cat {
    private String name;
    private String colour;

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setColour(String colour){
         this.colour = colour;
    }

    public void speak() {
        System.out.println("meow");
    }

    public void eat(Meat food){
        System.out.println("Meat was eaten by cat");

    }
}

